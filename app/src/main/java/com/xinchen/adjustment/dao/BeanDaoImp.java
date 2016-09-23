package com.xinchen.adjustment.dao;

import com.lidroid.xutils.DbUtils;
import com.lidroid.xutils.exception.DbException;
import com.xinchen.appinit.BaseApp;
import com.xinchen.apppub.BaseDao.IBeanDao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * 基础接口
 * Created by ZH on 2016/4/11.
 */
@SuppressWarnings("unchecked")
public class BeanDaoImp<T> implements IBeanDao<T> {
    private Class<?> mClass;
    static private DbUtils mDBLoader = BaseApp.DBLoader;

    public BeanDaoImp() {
        mClass = getTClass();
    }

    @Override
    public List<T> getAll() {
        try {
            List<T> list = (List<T>) mDBLoader.findAll(mClass);
            return list;
        } catch (DbException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public T getById(Object id) {
        try {
            T t = (T) mDBLoader.findById(mClass, id);
            return t;
        } catch (DbException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean deleteAll() {
        try {
            mDBLoader.deleteAll(mClass);
            return true;
        } catch (DbException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteById(Object id) {
        try {
            mDBLoader.deleteById(mClass, id);
            return true;
        } catch (DbException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean save(T t) {
        try {
            mDBLoader.save(t);
            return true;
        } catch (DbException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean savaList(List<T> list) {
        try {
            mDBLoader.saveAll(list);
            return true;
        } catch (DbException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(T t, String... updateColumnNames) {
        try {
            mDBLoader.update(t, updateColumnNames);
            return true;
        } catch (DbException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateList(List<T> list, String... updateColumnNames) {
        try {
            mDBLoader.updateAll(list, updateColumnNames);
            return true;
        } catch (DbException e) {
            e.printStackTrace();
            return false;
        }
    }

    /***
     * 获取泛型的.class()类型
     * @return 泛型.class()
     */
    private Class<?> getTClass() {
        //getGenericSuperclass()获得带有泛型的父类
        Type sType = this.getClass().getGenericSuperclass();
        //ParameterizedType参数化类型，即泛型
        //getActualTypeArguments获取参数化类型的数组，泛型可能有多个
        Type[] generics = ((ParameterizedType) sType).getActualTypeArguments();
        return (Class<?>) (generics[0]);
    }
}
