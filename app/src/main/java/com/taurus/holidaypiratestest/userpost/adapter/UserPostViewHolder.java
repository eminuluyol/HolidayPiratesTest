package com.taurus.holidaypiratestest.userpost.adapter;

import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.taurus.holidaypiratestest.R;
import com.taurus.holidaypiratestest.baseadapter.viewholder.BaseViewHolder;
import com.taurus.holidaypiratestest.listener.OnItemClickListener;
import com.taurus.holidaypiratestest.network.model.userpost.UserPost;

/**
 * Created by eminuluyol on 16/07/2017.
 */

public class UserPostViewHolder extends BaseViewHolder {

  @BindView(R.id.userPostTextViewTitle)
  TextView textViewTitle;

  @BindView(R.id.userPostTextViewBody)
  TextView textViewBody;

  private UserPostUIModel userPostUIModel;
  private OnItemClickListener listener;

  public UserPostViewHolder(@NonNull ViewGroup parentView, int layoutId, OnItemClickListener listener) {
    super(parentView, layoutId);

    this.listener = listener;
  }

  public void bind(UserPostUIModel item) {

    userPostUIModel = item;
    textViewTitle.setText(userPostUIModel.getTitle());
    textViewBody.setText(userPostUIModel.getBody());

  }

  @OnClick(R.id.userPostLinearLayoutContainer)
  public void onViewClicked(View view) {
    view.setTag(userPostUIModel);
    listener.onItemClick(view);
  }

}
