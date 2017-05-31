package com.example.administrator.dragger;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/5/24.
 */

@Module
public class AppAplicationPersenterMoudle {

    private final Context mContext;

    public AppAplicationPersenterMoudle(Context context){
        mContext = context;
    }

    @Provides
    @ApplicationScope
    public Context povidesContext(){
        return mContext;
    }
}
