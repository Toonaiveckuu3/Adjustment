package com.xinchen.appinit;

import android.app.Application;

import com.lidroid.xutils.DbUtils;

/**
 * Created by ZH on 2016/3/19.
 */
public class BaseApp extends Application {
    /** 数据库 */
    public static DbUtils DBLoader = null;
    /** 初始化 */
    private IAppInitController mAppInitController = null;

    @Override
    public void onCreate() {
        mAppInitController = new AppInitControllerImp(this);
        mAppInitController.init();
        super.onCreate();
    }
}
