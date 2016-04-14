package com.xinchen.adjustment.utils;

import com.xinchen.adjustment.levelingbean.LevelingProject;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by ZH on 2016/4/11.
 * 这个实现的复杂之处在于，怎么获取泛型T的.class类型。
 * 俩方案：通过反射获取；将.class作为参数传入
 */
public class BeanUtilsImp<T> implements IBeanUtils<T> {
    @Override
    public List<T> getAll() {
        return null;
    }

    @Override
    public T getById(Object id) {
        LevelingProject levelingProject = new LevelingProject();
        Type type = levelingProject.getClass();
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
    public boolean save(T t) {
        return false;
    }

    @Override
    public boolean savaList(List<T> list) {
        return false;
    }

    @Override
    public boolean update(T t) {
        return false;
    }

    @Override
    public boolean updateList(List<T> list) {
        return false;
    }
}
