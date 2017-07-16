package com.taurus.holidaypiratestest.core.injection;
import com.taurus.holidaypiratestest.core.NoOpPresenter;
import com.taurus.holidaypiratestest.userpost.UserPostPresenter;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = {ActivityModule.class})
public interface ActivityComponent {

    void inject(NoOpPresenter noOpPresenter);

    void inject(UserPostPresenter userPostPresenter);

}
