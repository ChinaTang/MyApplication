package com.example.administrator.dragger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    IMainActivityPersenter mPersenter;
    @Inject
    Icontext installContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initMvp();
        if(mPersenter != null){
            if(installContext != null){

            }
        }
    }

    private void initMvp(){
        DaggerPresenterModule.builder()
                             .mainActivityPresenterModule(new MainActivityPresenterModule())
                             .appCompant(AppCompantHelp.getAppCompant()).build().inject(this);
        //DaggerPresenterModule.builder().mainActivityPresenterModule(new MainActivityPresenterModule()).build().inject(this);
    }
}
