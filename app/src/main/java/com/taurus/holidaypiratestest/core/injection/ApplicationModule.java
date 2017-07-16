package com.taurus.holidaypiratestest.core.injection;

import android.app.Application;

import com.taurus.holidaypiratestest.network.retrofit.RetrofitHolidayPiratesApi;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module
public class ApplicationModule {

    private final Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    public Application provideApplication() {
        return application;
    }

    @Provides
    @Singleton
    public RetrofitHolidayPiratesApi provideHolidayPiratesApi() {
        return new RetrofitHolidayPiratesApi();
    }

}
