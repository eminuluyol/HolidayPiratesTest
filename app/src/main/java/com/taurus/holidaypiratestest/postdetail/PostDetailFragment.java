package com.taurus.holidaypiratestest.postdetail;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import butterknife.BindView;
import com.hannesdorfmann.fragmentargs.annotation.Arg;
import com.hannesdorfmann.fragmentargs.annotation.FragmentWithArgs;
import com.taurus.holidaypiratestest.R;
import com.taurus.holidaypiratestest.baseadapter.RecyclerAdapter;
import com.taurus.holidaypiratestest.baseadapter.model.GenericItem;
import com.taurus.holidaypiratestest.core.BaseFragment;
import com.taurus.holidaypiratestest.customview.EndlessRecyclerView;
import com.taurus.holidaypiratestest.postdetail.adapter.delegate.CommentsAdapterDelegate;
import com.taurus.holidaypiratestest.postdetail.adapter.delegate.PhotosAdapterDelegate;
import com.taurus.holidaypiratestest.postdetail.adapter.delegate.UserDataAdapterDelegate;
import com.taurus.holidaypiratestest.postdetail.adapter.model.CommentsUIModel;
import java.util.List;

import static com.taurus.holidaypiratestest.R.id.postDetailRecyclerView;
import static com.taurus.holidaypiratestest.R.id.userPostsRecyclerView;

/**
 * Created by eminuluyol on 16/07/2017.
 */

@FragmentWithArgs
public class PostDetailFragment extends BaseFragment<PostDetailView, PostDetailPresenter>
    implements PostDetailView, EndlessRecyclerView.OnEndReachedListener {

  @BindView(R.id.postDetailRecyclerView)
  EndlessRecyclerView postDetailRecyclerView;

  @BindView(R.id.emptyView)
  NestedScrollView emptyView;

  @Arg
  int userId;

  @Arg
  int postId;

  private RecyclerAdapter postDetailAdapter;

  @Override
  protected int getLayoutResId() {
    return R.layout.fragment_post_detail;
  }

  @Override
  public PostDetailPresenter createPresenter() {
    return new PostDetailPresenter();
  }

  @Override
  public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);

    getPresenter().onPostDetailRequested(userId, postId);

    postDetailRecyclerView.setOnEndReachedListener(this);
    postDetailRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

    postDetailAdapter = RecyclerAdapter.with(
        new UserDataAdapterDelegate(),
        new PhotosAdapterDelegate(),
        new CommentsAdapterDelegate()
    );

    postDetailRecyclerView.setAdapter(postDetailAdapter);
    postDetailRecyclerView.setLoading(false);

  }

  @Override
  public void showGetDetailSuccess(List<GenericItem> detailList) {
    postDetailRecyclerView.setLoading(false);
    postDetailAdapter.swapItems(detailList);
  }

  @Override
  public void showGetCommentSuccess(List<GenericItem> comments) {
    postDetailRecyclerView.setLoading(false);
    postDetailAdapter.addAll(comments);
  }

  @Override
  public void onEndReached() {
    postDetailRecyclerView.setLoading(true);
    getPresenter().onPostDetailRequested(userId, postId);
  }
}
