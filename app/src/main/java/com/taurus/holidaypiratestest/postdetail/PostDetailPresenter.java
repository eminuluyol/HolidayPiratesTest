package com.taurus.holidaypiratestest.postdetail;

import com.taurus.holidaypiratestest.core.BasePresenter;
import com.taurus.holidaypiratestest.core.injection.Injector;

/**
 * Created by eminuluyol on 16/07/2017.
 */

public class PostDetailPresenter extends BasePresenter<PostDetailView> {

  private int PAGE_NUMBER = 1;
  private int PAGE_LIMIT = 10;
  private String TOTAL_COUNT = "X-Total-Count";
  private int totalCount = Integer.MAX_VALUE;

  PostDetailPresenter() {
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

  void onPostDetailRequested() {

    if(isViewAttached()) {
      onProgressBarShow();
    }

  }
}
