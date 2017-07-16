package com.taurus.holidaypiratestest.core;

import android.app.Application;
import com.taurus.trivagotest.core.injection.Injector;

/**
 * Created by eminuluyol on 09/07/2017.
 */

public class App extends Application {

  @Override
  public void onCreate() {
    super.onCreate();

    Injector.getInstance().createApplicationScope(this);

  }
}
