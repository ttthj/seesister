package com.example.seesister;

import android.app.Application;

/**
 * 描述：Application类
 */
public class SeeSisterApp extends Application {

    private static SeeSisterApp context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        DryInit.initTimber();
        DryInit.initOKHttp(this);
    }

    public static SeeSisterApp getContext() {
        return context;
    }
}
