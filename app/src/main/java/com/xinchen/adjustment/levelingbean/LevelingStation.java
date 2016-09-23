package com.xinchen.adjustment.levelingbean;

/**
 * 水准-测站
 * Created by ZH on 2016/4/6.
 */
public class LevelingStation {
    /** 测站ID*/
    private String id;
    /** 所属工程ID*/
    private String objId;

    /** 测站号*/
    private String stationCode;
    /** 前视点号*/
    private String frontId;
    /** 后视点号*/
    private String rearId;

    /** 前尺上丝读数*/
    private double frontTopRead;
    /** 前尺下丝读数*/
    private double frontBelowRead;
    /** 前尺中丝读数*/
    private double frontMiddleRead;
    /** 前尺中丝复读数*/
    private double frontMiddleRead_2;
    /** 前尺辅助读数*/
    private double frontAidRead;
    /** 前尺辅助复读数*/
    private double frontAidRead_2;
    /** 前尺主辅差值*/
    private double frontPriAidDiff;
    /** 前尺复主辅差值*/
    private double frontPriAidDiff_2;
    /** 前尺主辅读数均值*/
    private double frontMeanReading;
    /** 前尺主辅复读数均值*/
    private double frontMeanReading_2;
    /** 前尺视距*/
    private double frontDistance;

    /** 后尺上丝读数*/
    private double rearTopRead;
    /** 后尺下丝读数*/
    private double rearBelowRead;
    /** 后尺中丝读数*/
    private double rearMiddleRead;
    /** 后尺中丝复读数*/
    private double rearMiddleRead_2;
    /** 后尺辅助读数*/
    private double rearAidRead;
    /** 后尺辅助复读数*/
    private double rearAidRead_2;
    /** 后尺主辅差值*/
    private double rearPriAidDiff;
    /** 后尺复主辅差值*/
    private double rearPriAidDiff_2;
    /** 后尺主辅读数均值*/
    private double rearMeanReading;
    /** 后尺主辅复读数均值*/
    private double rearMeanReading_2;
    /** 后尺视距*/
    private double rearDistance;

    /** 视距差*/
    private double distanceDiff;
    /** 视距累计差*/
    private double accDistanceDiff;

    /** 高差*/
    private double heightDiff;
    /** 复高差*/
    private double heightDiff_2;
    /** 平均高差*/
    private double meanHeightDiff;

    /** 备注*/
    private String remark;
}
