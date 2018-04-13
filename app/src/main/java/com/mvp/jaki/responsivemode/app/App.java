package com.mvp.jaki.responsivemode.app;

import android.app.Application;

/**
 * app 入口
 * Created by jaki on 2018/4/13.
 */

public class App extends Application{
    private static App app;
    @Override
    public void onCreate() {
        super.onCreate();
        app = this;
        initApp();
    }

    /**
     * app的初始化工作
     * 包括框架、三方库的初始化等
     */
    private static void initApp() {

    }

    /**
     * 获取app实例
     * @return app实例
     */
    public App getApp(){
        return app;
    }
}
