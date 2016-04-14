package com.xinchen.adjustment.levelingbean;

/**
 * 水准-工程
 * Created by ZH on 2016/4/6.
 */
public class LevelingProject {
    /** 工程ID */
    private String id;
    /** 工程名称 */
    private String projectName;
    /** 工程位置 */
    private String position;
    /** 工程日期 */
    private String date;
    /** 开始时间 */
    private String startTime;
    /** 结束时间 */
    private String endTime;
    /** 天气 */
    private String weather;
    /** 水准仪 */
    private String level;
    /** 成像 */
    private String imaging;
    /** 测量员 */
    private String observer;
    /** 记录员 */
    private String recorder;
    /** 计算员 */
    private String reckoner;
    /** 检查员 */
    private String inspector;
    /** 测量单位 */
    private String mechanism;

    /** 测站数 */
    private int stationNum;
    /** 水准点数 */
    private int benchmarkNum;
    /** 水准路线总长度 */
    private double lineLength;
}
