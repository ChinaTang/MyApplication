package com.example.administrator.dragger.windows;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Administrator on 2017/5/31.
 */

@Module
public class WindowsFragmentPersenterMoudle {
    @Provides
    public IWindoFragmentPersenter provideWindowsPersenter(){
        return new WindowsFragmentPersenter();
    }
}
