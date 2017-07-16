package com.taurus.holidaypiratestest.core.injection;
import com.taurus.holidaypiratestest.core.NoOpPresenter;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = {ActivityModule.class})
public interface ActivityComponent {

    void inject(NoOpPresenter noOpPresenter);

}
