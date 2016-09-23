package com.xinchen.apppub;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.xinchen.apppub.toolbar.ToolbarParam;

/**
 * 封装ToolBar，支持自定义ToolBar的布局</br> 自动加入ToolBar，无需在Activity和其布局文件中定义ToolBar</br>
 * @author GISirFive
 * @since 2015-12-11 下午3:49:16
 */
public abstract class AbsToolBarActivity extends AbsActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public boolean onToolbarConfiguration(Toolbar toolbar, ToolbarParam param) {
        toolbar.setContentInsetsRelative(0, 0);
        return true;
    }

    /**
     * 自定义Toolbar相关的操作
     *
     * @param toolbar
     * @author GISirFive
     */
    public void onCreateCustomToolBar(Toolbar toolbar) {
        toolbar.setContentInsetsRelative(0, 0);
    }

}
