package com.taurus.holidaypiratestest.core;

/**
 * Created by eminuluyol on 09/07/2017.
 */

import android.support.annotation.NonNull;

/**
 * Inherit activities which have no presenter and view from {@link BaseSimpleActivity}.
 *
 * For example, an activity which is a container only for a fragment.
 */
public abstract class BaseSimpleActivity extends BaseActivity<BaseView, NoOpPresenter> {

  @NonNull
  @Override
  public NoOpPresenter createPresenter() {
    return new NoOpPresenter();
  }
}
