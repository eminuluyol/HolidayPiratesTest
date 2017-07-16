package com.taurus.holidaypiratestest.core;

import com.hannesdorfmann.mosby.mvp.MvpView;

/**
 * Created by eminuluyol on 09/07/2017.
 */

public interface BaseView extends MvpView {

  void showError(String message);

  void showProgress();

  void showProgress(String message);

  void setProgressMessage(String message);

  void dismissProgress();
}
