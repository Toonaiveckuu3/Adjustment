package com.xinchen.adjustment;

import android.os.Bundle;
import android.view.Menu;

import com.xinchen.adjustment.presenter.MainPresenter;
import com.xinchen.adjustment.view.IMainView;
import com.xinchen.apppub.AbsToolBarActivity;

/***
 * @since 2016-3-21 17:18
 */
public class MainActivity extends AbsToolBarActivity implements IMainView{

    private MainPresenter mMainPresenter = new MainPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private void initView(){}
}
