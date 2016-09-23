package com.xinchen.adjustment.view;

/**
 * Created by ZH on 2016/4/26.
 */
public interface ICreatLevelingProView {
    /***
     * 工程名
     * @return
     */
    String getProjectName();

    /***
     * 获取水准等级
     * @return
     */
    int getGrade();

    /***
     * 工程位置
     * @return
     */
    String getProjectPosition();

    /***
     * 工程日期
     * @return
     */
    String getProjectDate();

    /***
     * 获取水准仪型号
     * @return
     */
    String getLevelType();

    /***
     * 获取测量员
     * @return
     */
    String getObserver();

    /***
     *获取记录员
     * @return
     */
    String getRecorder();

    /***
     * 获取天气状况
     * @return
     */
    String getWeather();
}
