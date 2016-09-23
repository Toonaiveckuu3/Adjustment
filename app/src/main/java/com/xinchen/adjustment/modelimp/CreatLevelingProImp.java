package com.xinchen.adjustment.modelimp;

import android.util.Log;

import com.xinchen.adjustment.dao.LevelingProjectDao;
import com.xinchen.adjustment.levelingbean.LevelingProject;
import com.xinchen.adjustment.model.ICreatLevelingProModel;

/**
 * Created by ZH on 2016/4/27.
 */
public class CreatLevelingProImp implements ICreatLevelingProModel {
    private LevelingProjectDao mDao = new LevelingProjectDao();
    @Override
    public void creatLevelingProject(LevelingProject project) {
        if (!mDao.save(project))
            Log.e(getClass().getName(),"水准工程保存失败");
    }
}
