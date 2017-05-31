package com.example.administrator.dragger;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/5/23.
 */

@Module
public class MainActivityPresenterModule {

    public MainActivityPresenterModule(){}

    @Provides
    public IMainActivityPersenter providePersenter(){
        return new MainActivityPresenter();
    }

    @Provides
    public Icontext provideContext(Context context){
        return new InstallContext();
    }
}
