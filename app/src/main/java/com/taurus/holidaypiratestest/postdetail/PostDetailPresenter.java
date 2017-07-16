package com.taurus.holidaypiratestest.postdetail;

import com.taurus.holidaypiratestest.R;
import com.taurus.holidaypiratestest.baseadapter.model.GenericItem;
import com.taurus.holidaypiratestest.core.BasePresenter;
import com.taurus.holidaypiratestest.core.injection.Injector;
import com.taurus.holidaypiratestest.network.model.postdetail.comment.CommentData;
import com.taurus.holidaypiratestest.network.model.postdetail.comment.CommentRequest;
import com.taurus.holidaypiratestest.network.model.postdetail.photo.PhotoData;
import com.taurus.holidaypiratestest.network.model.postdetail.photo.PhotoRequest;
import com.taurus.holidaypiratestest.network.model.postdetail.userdata.UserData;
import com.taurus.holidaypiratestest.network.model.postdetail.userdata.UserDataRequest;
import com.taurus.holidaypiratestest.network.model.userpost.UserPost;
import com.taurus.holidaypiratestest.postdetail.adapter.model.CommentsUIModel;
import com.taurus.holidaypiratestest.postdetail.adapter.model.PhotosUIModel;
import com.taurus.holidaypiratestest.postdetail.adapter.model.UserDataUIModel;
import com.taurus.holidaypiratestest.userpost.adapter.UserPostUIModel;
import com.taurus.holidaypiratestest.util.ListConverter;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Headers;
import retrofit2.Response;

/**
 * Created by eminuluyol on 16/07/2017.
 */

public class PostDetailPresenter extends BasePresenter<PostDetailView> {

  private int PAGE_NUMBER = 1;
  private int PAGE_LIMIT = 10;
  private String TOTAL_COUNT = "X-Total-Count";
  private int totalCount = Integer.MAX_VALUE;

  private int userId;
  private int postId;
  private boolean isFirstTime = true;
  private List<GenericItem> detailList;

  PostDetailPresenter() {
    Injector.getInstance().getActivityComponent().inject(this);
  }

  void onProgressBarShow() {

    if(isViewAttached()) {
      getView().showProgress();
    }

  }

  void onProgressBarHide() {

    if(isViewAttached()) {
      getView().dismissProgress();
    }

  }

  void onPostDetailRequested(int userId, int postId) {

    this.userId = userId;
    this.postId = postId;

    if(isViewAttached()) {
      onProgressBarShow();
    }

    detailList = new ArrayList<>();

    UserDataRequest request = new UserDataRequest(userId);

    getApi().getUserData(request)
        .subscribeOn(Schedulers.newThread())
        .observeOn(AndroidSchedulers.mainThread())
        .map(UserData::createList)
        .subscribe(this::handleUserDataResponse, this::handleError);

  }

  private void handleUserDataResponse(List<UserDataUIModel> userDataUIModels) {

    detailList.addAll(userDataUIModels);

    PhotoRequest request = new PhotoRequest(0, 20);

    getApi().getPhotos(request)
        .subscribeOn(Schedulers.newThread())
        .observeOn(AndroidSchedulers.mainThread())
        .map(PhotoData::createList)
        .subscribe(this::handlePhotoDataResponse, this::handleError);

  }

  private void handlePhotoDataResponse(List<PhotosUIModel> photosUIModels) {

    detailList.addAll(photosUIModels);

    onCommentRequested();

  }

  void onCommentRequested() {

    if( PAGE_NUMBER <= totalCount) {

      if(!isFirstTime) {
        onProgressBarShow();
      }

      CommentRequest request = new CommentRequest(PAGE_NUMBER, PAGE_LIMIT, postId);

      getApi().getComments(request)
          .subscribeOn(Schedulers.newThread())
          .observeOn(AndroidSchedulers.mainThread())
          .subscribe(this::handleCommentDataResponse, this::handleError);
    }

  }

  private void handleCommentDataResponse(Response<List<CommentData>> listResponse) {

    PAGE_NUMBER = PAGE_NUMBER + PAGE_LIMIT;

    onProgressBarHide();

    Headers header = listResponse.headers();
    totalCount = Integer.parseInt(header.get(TOTAL_COUNT));

    if(isFirstTime) {
      detailList.addAll(createList(listResponse));
      getView().showGetDetailSuccess(detailList);
    } else {
      List<GenericItem> comments = new ArrayList<>(createList(listResponse));
      getView().showGetCommentSuccess(comments);
    }

  }

  private void handleError(Throwable throwable) {
    if(isViewAttached()) {
      onProgressBarHide();
    }
  }

  private List<CommentsUIModel> createList(Response<List<CommentData>> commentResponse) {
    return ListConverter.convert(commentResponse.body(), item -> create(item));
  }

  private static CommentsUIModel create(CommentData item) {

    final CommentsUIModel model = new CommentsUIModel();

    model.setName(item.getName());
    model.setEmail(item.getEmail());
    model.setBody(item.getBody());

    return model;

  }

}
