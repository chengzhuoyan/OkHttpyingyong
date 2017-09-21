package com.bwie.text;

import android.app.Application;
import android.content.Context;

/**
 * Desc  注册全局捕获异常
 * Author 程茁燕
 * Time 2017/9/18.
 */
public class App extends Application {
    private static Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        this.mContext = this;
        CrashHandler.getInstance().init(this);//初始化全局异常管理
    }

    public static Context getContext(){
        return mContext;
    }
}
