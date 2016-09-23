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
    /** 水准等级 1,2,3,4,0*/
    private int grade;//1,2,3,4,0
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
    /** 备注*/
    private String remark;

    /** 测站数 */
    private int stationNum;
    /** 水准点数 */
    private int benchmarkNum;
    /** 水准路线总长度 */
    private double lineLength;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getImaging() {
        return imaging;
    }

    public void setImaging(String imaging) {
        this.imaging = imaging;
    }

    public String getObserver() {
        return observer;
    }

    public void setObserver(String observer) {
        this.observer = observer;
    }

    public String getRecorder() {
        return recorder;
    }

    public void setRecorder(String recorder) {
        this.recorder = recorder;
    }

    public String getReckoner() {
        return reckoner;
    }

    public void setReckoner(String reckoner) {
        this.reckoner = reckoner;
    }

    public String getInspector() {
        return inspector;
    }

    public void setInspector(String inspector) {
        this.inspector = inspector;
    }

    public String getMechanism() {
        return mechanism;
    }

    public void setMechanism(String mechanism) {
        this.mechanism = mechanism;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public int getStationNum() {
        return stationNum;
    }

    public void setStationNum(int stationNum) {
        this.stationNum = stationNum;
    }

    public int getBenchmarkNum() {
        return benchmarkNum;
    }

    public void setBenchmarkNum(int benchmarkNum) {
        this.benchmarkNum = benchmarkNum;
    }

    public double getLineLength() {
        return lineLength;
    }

    public void setLineLength(double lineLength) {
        this.lineLength = lineLength;
    }
}
