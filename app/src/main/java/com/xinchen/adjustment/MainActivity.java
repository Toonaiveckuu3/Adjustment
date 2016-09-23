package com.xinchen.adjustment;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.view.Menu;
import android.view.View;

import com.xinchen.adjustment.activity.CreatLevelingProActivity;
import com.xinchen.adjustment.presenter.MainPresenter;
import com.xinchen.adjustment.view.IMainView;
import com.xinchen.apppub.AbsToolBarActivity;

/***
 * @since 2016-3-21 17:18
 */
public class MainActivity extends AbsToolBarActivity implements View.OnClickListener,IMainView{

    private MainPresenter mMainPresenter = new MainPresenter(this);

    FloatingActionButton mAddButton;
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

    private void initView(){
        mAddButton = (FloatingActionButton) findViewById(R.id.fab);
        mAddButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.fab:
                Intent intent_creatLeve = new Intent(this, CreatLevelingProActivity.class);
                startActivity(intent_creatLeve);
                break;
        }
    }
}
