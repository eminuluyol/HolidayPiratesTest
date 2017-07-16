package com.taurus.holidaypiratestest.util.navigator;

import android.app.Activity;
import com.taurus.holidaypiratestest.core.injection.ActivityScope;
import com.taurus.holidaypiratestest.postdetail.PostDetailActivity;

@ActivityScope
public class Navigator {

    private final Activity activity;

    public Navigator(Activity activity) {
        this.activity = activity;
    }

  public Navigation toPostDetailActivity(int userId, int postId) {
    return new Navigation(activity, PostDetailActivity.newIntent(activity, userId, postId));
  }
}
