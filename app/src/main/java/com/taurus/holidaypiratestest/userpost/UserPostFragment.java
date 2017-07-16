package com.taurus.holidaypiratestest.userpost;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import butterknife.BindView;
import com.taurus.holidaypiratestest.R;
import com.taurus.holidaypiratestest.baseadapter.RecyclerAdapter;
import com.taurus.holidaypiratestest.baseadapter.model.GenericItem;
import com.taurus.holidaypiratestest.core.BaseFragment;
import com.taurus.holidaypiratestest.customview.EndlessRecyclerView;
import java.util.List;

/**
 * Created by eminuluyol on 16/07/2017.
 */

public class UserPostFragment extends BaseFragment<UserPostView, UserPostPresenter>
    implements UserPostView, EndlessRecyclerView.OnEndReachedListener {

  @BindView(R.id.userPostsRecyclerView)
  EndlessRecyclerView userPostsRecyclerView;

  @BindView(R.id.emptyView)
  NestedScrollView emptyView;

  private RecyclerAdapter userPostsArticlesAdapter;

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

    getPresenter().onProgressBarShow();
    getPresenter().onMostViewArticlesRequestedRequested();

    userPostsRecyclerView.setOnEndReachedListener(this);
    userPostsRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    userPostsArticlesAdapter = RecyclerAdapter.with(new MostViewArticlesAdapterDelegate());
    userPostsRecyclerView.setAdapter(mostViewedArticlesAdapter);
    userPostsRecyclerView.setLoading(false);

  }


}
