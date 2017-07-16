package com.taurus.holidaypiratestest.userpost;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.taurus.holidaypiratestest.R;
import com.taurus.holidaypiratestest.core.BaseFragment;
import com.taurus.holidaypiratestest.core.BaseSimpleActivity;

/**
 * Created by eminuluyol on 16/07/2017.
 */

public class UserPostActivity extends BaseSimpleActivity {

  @Nullable
  @Override
  protected BaseFragment getContainedFragment() {
    return UserPostFragment.newInstance();
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setTitle(R.string.user_posts);

  }
}
