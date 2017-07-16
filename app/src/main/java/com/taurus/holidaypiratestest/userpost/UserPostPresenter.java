package com.taurus.holidaypiratestest.userpost;

import com.taurus.holidaypiratestest.core.BasePresenter;
import com.taurus.holidaypiratestest.core.injection.Injector;

/**
 * Created by eminuluyol on 16/07/2017.
 */

public class UserPostPresenter extends BasePresenter<UserPostView> {

  UserPostPresenter() {
    Injector.getInstance().getActivityComponent().inject(this);
  }

  void onProgressBarShow() {

    if(isViewAttached()) {
      getView().showProgress();
    }

  }

  void onProgressBarHide() {

    if(isViewAttached()) {
      getView().dismissProgress();
    }

  }

  void onUserPostRequested() {

  }
}
