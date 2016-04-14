package com.xinchen.appinit;

/**
 * Created by ZH on 2016/4/5.
 */
public interface IAppInitController {
    /**
     * 公共初始化
     */
    void init();

    /***
     * 数据库初始化
     */
    void initDatabase();
}
