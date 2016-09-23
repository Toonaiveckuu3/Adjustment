package com.xinchen.adjustment.activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;

import com.xinchen.adjustment.R;
import com.xinchen.adjustment.presenter.CreatLevelingProPresenter;
import com.xinchen.adjustment.view.ICreatLevelingProView;
import com.xinchen.apppub.AbsToolBarActivity;

/**
 * Created by ZH on 2016/4/26.
 */
public class CreatLevelingProActivity extends AbsToolBarActivity
        implements ICreatLevelingProView, View.OnClickListener {

    EditText mProjectName,
            mGrade,
            mProjectPosition,
            mProjectDate,
            mLevelType,
            mObserver,
            mRecorder,
            mWeather;
    FloatingActionButton mButton;

    DrawerLayout mDrawerLayout;

    private CreatLevelingProPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creatlevelingpro);
        initView();
    }

    private void initView() {
        mPresenter = new CreatLevelingProPresenter(this);

        mProjectName = (EditText) findViewById(R.id.projectName);
        mGrade = (EditText) findViewById(R.id.grade);
        mProjectPosition = (EditText) findViewById(R.id.projectPosition);
        mProjectDate = (EditText) findViewById(R.id.projectDate);
        mLevelType = (EditText) findViewById(R.id.levelType);
        mObserver = (EditText) findViewById(R.id.observer);
        mRecorder = (EditText) findViewById(R.id.recorder);
        mWeather = (EditText) findViewById(R.id.weather);
        mButton = (FloatingActionButton) findViewById(R.id.creatPro_button);

        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.creatPro_button:
                mPresenter.savePro();
                finish();
        }
    }

    @Override
    public String getProjectName() {
        return mProjectName.getText().toString();
    }

    @Override
    public int getGrade() {
        String grade = mGrade.getText().toString();
        if (grade == null || grade.equals(""))
            return 0;
        else
            return new Integer(grade);
    }

    @Override
    public String getProjectPosition() {
        return mProjectPosition.getText().toString();
    }

    @Override
    public String getProjectDate() {
        return mProjectDate.getText().toString();
    }

    @Override
    public String getLevelType() {
        return mLevelType.getText().toString();
    }

    @Override
    public String getObserver() {
        return mObserver.getText().toString();
    }

    @Override
    public String getRecorder() {
        return mRecorder.getText().toString();
    }

    @Override
    public String getWeather() {
        return mWeather.getText().toString();
    }
}
