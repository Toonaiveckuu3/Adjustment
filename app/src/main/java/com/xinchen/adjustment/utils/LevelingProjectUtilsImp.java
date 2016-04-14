package com.xinchen.adjustment.utils;

import com.lidroid.xutils.exception.DbException;
import com.xinchen.adjustment.levelingbean.LevelingProject;
import com.xinchen.appinit.BaseApp;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZH on 2016/4/10.
 */
public class LevelingProjectUtilsImp implements IBeanUtils<LevelingProject>{
    @Override
    public List<LevelingProject> getAll() {
        List<LevelingProject> list;
        try {
            list = BaseApp.DBLoader.findAll(LevelingProject.class);
            if (list==null||list.size()==0){
                return null;
            }
            return list;
        } catch (DbException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public LevelingProject getById(Object id) {
        return null;
    }

    @Override
    public boolean deleteAll() {
        return false;
    }

    @Override
    public boolean deleteById(Object id) {
        return false;
    }

    @Override
    public boolean save(LevelingProject levelingProject) {
        return false;
    }

    @Override
    public boolean savaList(List<LevelingProject> list) {
        return false;
    }

    @Override
    public boolean update(LevelingProject levelingProject) {
        return false;
    }

    @Override
    public boolean updateList(List<LevelingProject> list) {
        return false;
    }
}
