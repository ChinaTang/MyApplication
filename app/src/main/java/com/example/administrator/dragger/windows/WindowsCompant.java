package com.example.administrator.dragger.windows;

import dagger.Component;

/**
 * Created by Administrator on 2017/5/31.
 */

@Component(modules = WindowsFragmentPersenterMoudle.class)
public interface WindowsCompant {
    void inject(WindowsActivity windowsActivity);
}
