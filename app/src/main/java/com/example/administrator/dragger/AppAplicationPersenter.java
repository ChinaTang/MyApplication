package com.example.administrator.dragger;

import android.content.Context;

/**
 * Created by Administrator on 2017/5/24.
 */

public class AppAplicationPersenter implements IAppAplicationPersenter{

    private Context mContext;

    public AppAplicationPersenter (Context context){
        mContext = context;
    }

    @Override
    public Context getContext() {
        return mContext;
    }
}
