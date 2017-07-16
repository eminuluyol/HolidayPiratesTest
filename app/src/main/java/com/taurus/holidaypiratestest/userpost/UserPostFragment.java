package com.taurus.holidaypiratestest.userpost;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.LinearLayoutManager;

import android.view.View;
import butterknife.BindView;
import com.taurus.holidaypiratestest.R;
import com.taurus.holidaypiratestest.baseadapter.RecyclerAdapter;
import com.taurus.holidaypiratestest.baseadapter.model.GenericItem;
import com.taurus.holidaypiratestest.core.BaseFragment;
import com.taurus.holidaypiratestest.customview.EndlessRecyclerView;
import com.taurus.holidaypiratestest.listener.OnItemClickListener;
import com.taurus.holidaypiratestest.userpost.adapter.UserPostAdapterDelegate;
import com.taurus.holidaypiratestest.userpost.adapter.UserPostUIModel;
import java.util.List;



/**
 * Created by eminuluyol on 16/07/2017.
 */

public class UserPostFragment extends BaseFragment<UserPostView, UserPostPresenter>
    implements UserPostView, EndlessRecyclerView.OnEndReachedListener, OnItemClickListener {

  @BindView(R.id.userPostsRecyclerView)
  EndlessRecyclerView userPostsRecyclerView;

  @BindView(R.id.emptyView)
  NestedScrollView emptyView;

  private RecyclerAdapter userPostsAdapter;

  public static UserPostFragment newInstance() {
    return new UserPostFragment();
  }

  @Override
  protected int getLayoutResId() {
    return R.layout.fragment_user_posts;
  }

  @Override
  public UserPostPresenter createPresenter() {
    return new UserPostPresenter();
  }

  @Override
  public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
    super.onViewCreated(view, savedInstanceState);

    getPresenter().onUserPostRequested();

    userPostsRecyclerView.setOnEndReachedListener(this);
    userPostsRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    userPostsAdapter = RecyclerAdapter.with(new UserPostAdapterDelegate(this));
    userPostsRecyclerView.setAdapter(userPostsAdapter);
    userPostsRecyclerView.setLoading(false);

  }

  @Override
  public void showGetUserPostSuccess(List<GenericItem> postList) {
    userPostsRecyclerView.setLoading(false);
    userPostsAdapter.addAll(postList);
  }

  @Override
  public void onEndReached() {
    userPostsRecyclerView.setLoading(true);
    getPresenter().onUserPostRequested();
  }

  @Override
  public void onItemClick(View view) {

    UserPostUIModel userPostUIModel = (UserPostUIModel) view.getTag();
    getPresenter().onPostDetailRequested(userPostUIModel.getUserId(), userPostUIModel.getId());
  }
}
