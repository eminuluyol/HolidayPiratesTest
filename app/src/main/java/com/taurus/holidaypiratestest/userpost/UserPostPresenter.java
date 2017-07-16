package com.taurus.holidaypiratestest.userpost;

import com.taurus.holidaypiratestest.R;
import com.taurus.holidaypiratestest.baseadapter.model.GenericItem;
import com.taurus.holidaypiratestest.core.BasePresenter;
import com.taurus.holidaypiratestest.core.injection.Injector;
import com.taurus.holidaypiratestest.network.model.userpost.UserPost;
import com.taurus.holidaypiratestest.network.model.userpost.UserPostRequest;
import com.taurus.holidaypiratestest.userpost.adapter.UserPostUIModel;
import com.taurus.holidaypiratestest.util.ListConverter;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Headers;
import retrofit2.Response;
import retrofit2.http.Header;

/**
 * Created by eminuluyol on 16/07/2017.
 */

public class UserPostPresenter extends BasePresenter<UserPostView> {

  private int PAGE_NUMBER = 0;
  private int PAGE_LIMIT = 10;
  private String TOTAL_COUNT = "X-Total-Count";
  private int totalCount = Integer.MAX_VALUE;

  UserPostPresenter() {
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

  void onUserPostRequested() {

    if( PAGE_NUMBER <= totalCount) {

      if(isViewAttached()) {
        onProgressBarShow();
      }

      UserPostRequest request = new UserPostRequest(PAGE_NUMBER, PAGE_LIMIT);

      getApi().getUserPosts(request)
          .subscribeOn(Schedulers.newThread())
          .observeOn(AndroidSchedulers.mainThread())
          .subscribe(this::handleResponse, this::handleError);
    }

  }

  private void handleResponse(Response<List<UserPost>> listResponse) {

    PAGE_NUMBER = PAGE_NUMBER + PAGE_LIMIT;

    if(isViewAttached()) {
      onProgressBarHide();
    }

    Headers header = listResponse.headers();
    totalCount = Integer.parseInt(header.get(TOTAL_COUNT));
    List<UserPostUIModel> userPosts = createList(listResponse);
    List<GenericItem> postList = new ArrayList<>(userPosts);

    getView().showGetUserPostSuccess(postList);

  }

  private void handleError(Throwable throwable) {

    if(isViewAttached()) {
      onProgressBarHide();
    }

  }

  public static List<UserPostUIModel> createList(Response<List<UserPost>> userPostList) {
    return ListConverter.convert(userPostList.body(), item -> create(item));
  }

  private static UserPostUIModel create(UserPost item) {

    final UserPostUIModel model = new UserPostUIModel();

    model.setUserId(item.getUserId());
    model.setId(item.getId());
    model.setTitle(item.getTitle());
    model.setBody(item.getBody());

    return model;
  }

  void onPostDetailRequested(int userId, int postId) {
    getNavigator().toPostDetailActivity(userId, postId).withAnimation(R.anim.right_in, R.anim.left_out).navigate();

  }
}
