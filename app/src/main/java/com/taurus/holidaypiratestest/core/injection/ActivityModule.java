package com.taurus.holidaypiratestest.core.injection;

import android.support.v7.app.AppCompatActivity;

import com.taurus.holidaypiratestest.util.navigator.Navigator;
import dagger.Module;
import dagger.Provides;

@Module
public class ActivityModule {
    private final AppCompatActivity activity;

    public ActivityModule(AppCompatActivity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityScope
    public AppCompatActivity provideActivity() {
        return activity;
    }


    @Provides
    @ActivityScope
    public Navigator provideNavigator(AppCompatActivity activity) {
        return new Navigator(activity);
    }

}