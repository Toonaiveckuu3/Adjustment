package com.xinchen.adjustment.presenter;

import com.xinchen.adjustment.levelingbean.LevelingProject;
import com.xinchen.adjustment.model.ICreatLevelingProModel;
import com.xinchen.adjustment.modelimp.CreatLevelingProImp;
import com.xinchen.adjustment.view.ICreatLevelingProView;

/**
 * 新建水准工程
 * Created by ZH on 2016/4/27.
 */
public class CreatLevelingProPresenter {
    private ICreatLevelingProView mView;
    private ICreatLevelingProModel mModel;

    public CreatLevelingProPresenter(ICreatLevelingProView view){
        mView = view;
        mModel = new CreatLevelingProImp();
    }

    public void savePro(){
        LevelingProject mProject = new LevelingProject();

        mProject.setProjectName(mView.getProjectName());
        mProject.setGrade(mView.getGrade());
        mProject.setPosition(mView.getProjectPosition());
        mProject.setDate(mView.getProjectDate());
        mProject.setLevel(mView.getLevelType());
        mProject.setObserver(mView.getObserver());
        mProject.setRecorder(mView.getRecorder());
        mProject.setWeather(mView.getWeather());

        mModel.creatLevelingProject(mProject);
    }
}
