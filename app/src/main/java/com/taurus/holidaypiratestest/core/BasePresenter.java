package com.taurus.holidaypiratestest.core;

import android.app.Application;
import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;
import com.taurus.holidaypiratestest.network.retrofit.RetrofitHolidayPiratesApi;
import com.taurus.holidaypiratestest.util.navigator.Navigator;
import io.reactivex.disposables.CompositeDisposable;
import javax.inject.Inject;

/**
 * Created by eminuluyol on 09/07/2017.
 */

public abstract class BasePresenter<V extends BaseView> extends MvpBasePresenter<V> {

  @Inject
  Application application;

  @Inject
  Navigator navigator;

  @Inject
  RetrofitHolidayPiratesApi api;

  protected CompositeDisposable compositeDisposable;

  public BasePresenter() {
    compositeDisposable = new CompositeDisposable();
  }

  public Application getApplication() {
    return application;
  }

  public Navigator getNavigator() {
    return navigator;
  }

  public RetrofitHolidayPiratesApi getApi() {
    return api;
  }

  public void clearCompositeDisposable() {

    if (compositeDisposable != null) {

      compositeDisposable.clear();
    }
  }
}
