package com.example.administrator.dragger;

import android.app.Application;

/**
 * Created by Administrator on 2017/5/24.
 */

public class AppApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
        AppCompant appCompant = DaggerAppCompant.builder().appAplicationPersenterMoudle(new AppAplicationPersenterMoudle(this)).build();
        AppCompantHelp.setAppCompant(appCompant);
    }
}
