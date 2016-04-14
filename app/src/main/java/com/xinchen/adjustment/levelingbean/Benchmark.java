package com.xinchen.adjustment.levelingbean;

/**
 * 水准点
 * Created by ZH on 2016/4/6.
 */
public class Benchmark {
    /** 水准点ID*/
    private String id;
    /** 所属工程ID*/
    private String objId;
    /** 水准点编号*/
    private String benchmarkCode;

    /** 高程*/
    private double height;
    /** 改正值*/
    private double corrections;
    /** 改正后高程*/
    private double realHeight;
}
