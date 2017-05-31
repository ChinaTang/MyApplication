package com.example.administrator.dragger;

import dagger.Component;

/**
 * Created by Administrator on 2017/5/23.
 */
@Component(modules = {MainActivityPresenterModule.class}, dependencies = {AppCompant.class})
@ActivityScope
public interface PresenterModule {
    void inject(MainActivity mainActivity);
}
