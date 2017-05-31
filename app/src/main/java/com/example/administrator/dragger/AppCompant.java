package com.example.administrator.dragger;

import android.content.Context;

import dagger.Component;

/**
 * Created by Administrator on 2017/5/24.
 */
@Component(modules = {AppAplicationPersenterMoudle.class})
@ApplicationScope
public interface AppCompant {
    Context getContext();
}
