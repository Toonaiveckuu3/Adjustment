package com.xinchen.adjustment.presenter;

import android.view.View;

import com.xinchen.adjustment.model.IMainModel;
import com.xinchen.adjustment.modelimp.MainModelImp;
import com.xinchen.adjustment.view.IMainView;

/**
 * Created by ZH on 2016/4/10.
 */
public class MainPresenter {
    private IMainView mMainView;
    private IMainModel mMainModel;

    public MainPresenter (IMainView view){
        mMainView = view;
        mMainModel = new MainModelImp();
    }
}
