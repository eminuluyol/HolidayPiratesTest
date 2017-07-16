package com.taurus.holidaypiratestest.core;

import android.app.Application;
import com.hannesdorfmann.mosby.mvp.MvpBasePresenter;
import com.taurus.trivagotest.network.retrofit.RetrofitNewYorkTimesApi;
import com.taurus.trivagotest.util.navigator.Navigator;
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

  public void clearCompositeDisposable() {

    if (compositeDisposable != null) {

      compositeDisposable.clear();
    }
  }
}
