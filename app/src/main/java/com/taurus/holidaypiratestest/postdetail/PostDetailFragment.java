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
import com.taurus.holidaypiratestest.core.BaseFragment;
import com.taurus.holidaypiratestest.customview.EndlessRecyclerView;

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

    getPresenter().onPostDetailRequested();

    postDetailRecyclerView.setOnEndReachedListener(this);
    postDetailRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
    postDetailAdapter = RecyclerAdapter.with();
    postDetailRecyclerView.setAdapter(postDetailAdapter);
    postDetailRecyclerView.setLoading(false);

  }

  @Override
  public void onEndReached() {

  }

}
