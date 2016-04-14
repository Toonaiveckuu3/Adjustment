package com.xinchen.appinit;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

import com.lidroid.xutils.DbUtils;
import com.lidroid.xutils.DbUtils.DaoConfig;
import com.xinchen.apppub.utils.ConfigUtils;

/**
 * Created by ZH on 2016/4/5.
 */
public class AppInitControllerImp implements IAppInitController{
    private Application mApplication;
    /** 数据库版本 */
    private int DB_VERSION;
    /** 数据库名称 */
    private String DB_NAME;
    /** 程序版本号 */
    private String APP_VERSION;

    public AppInitControllerImp(Application application){
        mApplication = application;
        DB_VERSION = ConfigUtils.dbVersion;
        DB_NAME = ConfigUtils.privateInfo+".db";
        APP_VERSION = getAppVersion(mApplication);
    }

    @Override
    public void init() {
        initDatabase();
    }

    @Override
    public void initDatabase() {
        DaoConfig config = new DaoConfig(mApplication);
        config.setDbName(DB_NAME);
        //应该直接等同于程序版本号
        config.setDbVersion(DB_VERSION);
        BaseApp.DBLoader = DbUtils.create(config);
        BaseApp.DBLoader.configDebug(true);
    }

    /***
     * 获取程序版本号
     * @param application
     * @return
     */
    private String getAppVersion(Application application){
        PackageManager manager = application.getPackageManager();
        try {
            PackageInfo info = manager.getPackageInfo(application.getPackageName(),0);
            String appVersion = info.versionName;
            return  appVersion;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "0";
        }
    }
}
