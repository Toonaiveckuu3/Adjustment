package com.xinchen.apppub;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.xinchen.apppub.toolbar.ToolBarHelper;
import com.xinchen.apppub.toolbar.ToolBarHelper.IToolBarController;
import com.xinchen.apppub.toolbar.ToolbarParam;

/**
 * Created by ZH on 2016/3/23.
 */
public abstract class AbsActivity extends AppCompatActivity implements IToolBarController{
    private ToolBarHelper mToolBarHelper;
    public Toolbar toolbar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
        super.setContentView(layoutResID);
        mToolBarHelper = new ToolBarHelper(this,layoutResID,this);
        toolbar= mToolBarHelper.getToolBar();
        setContentView(mToolBarHelper.getContentView());
        //把 toolbar 设置到Activity 中
        setSupportActionBar(toolbar);
        //自定义操作
        //onCreateCustomToolBar(toolbar);
    }

    @Override
    public boolean onToolbarConfiguration(Toolbar toolbar, ToolbarParam param) {
        return false;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
            return true ;
        }
        return super.onOptionsItemSelected(item);
    }
}



