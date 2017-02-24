package com.myapp.qingqiaohu.trippple;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;


public class TRipppleApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);
    }
}
