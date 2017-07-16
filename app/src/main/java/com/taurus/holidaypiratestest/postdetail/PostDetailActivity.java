package com.taurus.holidaypiratestest.postdetail;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.taurus.holidaypiratestest.R;
import com.taurus.holidaypiratestest.core.BaseFragment;
import com.taurus.holidaypiratestest.core.BaseSimpleActivity;
import com.taurus.holidaypiratestest.userpost.UserPostFragment;

/**
 * Created by eminuluyol on 16/07/2017.
 */

public class PostDetailActivity extends BaseSimpleActivity {

  private final static String EXTRA_USER_ID = "user_id";
  private final static String EXTRA_POST_ID = "post_id";
  private int userId;
  private int postId;

  public static Intent newIntent(Activity activity, int userId, int postId) {

    Intent intent = new Intent(activity, PostDetailActivity.class);
    intent.putExtra(PostDetailActivity.EXTRA_USER_ID, userId);
    intent.putExtra(PostDetailActivity.EXTRA_POST_ID, postId);

    return intent;
  }

  @Nullable
  @Override
  protected BaseFragment getContainedFragment() {
    return PostDetailFragmentBuilder.newPostDetailFragment(postId, userId);
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    getBundleArgmuments();
    super.onCreate(savedInstanceState);

    setTitle(R.string.detail_view);
    setHomeAsUpEnabled(true);
    setTitleTextColor(getResources().getColor(R.color.white));

  }

  private void getBundleArgmuments() {

    Intent extras = getIntent();

    if (extras != null) {
      userId = extras.getIntExtra(PostDetailActivity.EXTRA_USER_ID, 0);
      postId = extras.getIntExtra(PostDetailActivity.EXTRA_POST_ID, 0);
    }

  }

}
