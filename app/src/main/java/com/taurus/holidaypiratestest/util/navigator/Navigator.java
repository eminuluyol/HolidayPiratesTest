package com.taurus.holidaypiratestest.util.navigator;

import android.app.Activity;
import com.taurus.holidaypiratestest.core.injection.ActivityScope;

@ActivityScope
public class Navigator {

    private final Activity activity;

    public Navigator(Activity activity) {
        this.activity = activity;
    }

}
