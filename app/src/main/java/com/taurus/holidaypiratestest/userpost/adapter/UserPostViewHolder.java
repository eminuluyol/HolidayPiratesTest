package com.taurus.holidaypiratestest.userpost.adapter;

import android.support.annotation.NonNull;
import android.view.ViewGroup;
import com.taurus.holidaypiratestest.baseadapter.viewholder.BaseViewHolder;
import com.taurus.holidaypiratestest.network.model.userpost.UserPost;

/**
 * Created by eminuluyol on 16/07/2017.
 */

public class UserPostViewHolder extends BaseViewHolder {

  private UserPostUIModel userPostUIModel;
  private OnIt

  public UserPostViewHolder(@NonNull ViewGroup parentView, int layoutId) {
    super(parentView, layoutId);
  }

  public void bind(UserPostUIModel item) {

    userPostUIModel = item;
  }
}
