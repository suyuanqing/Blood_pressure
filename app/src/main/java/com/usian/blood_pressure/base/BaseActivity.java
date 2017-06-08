package com.usian.blood_pressure.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by 苏元庆 on 2017/6/8.
 */

public abstract class BaseActivity extends AppCompatActivity {


    protected abstract int getLayoutId();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        initView();
        initData();
        initListener();
    }

    /**
     * 初始化控件
     */
    protected abstract void initView();

    /**
     * 初始化数据
     */
    protected abstract void initData();

    /**
     * 加载数据
     */
    protected abstract void loadData();

    /**
     * 初始化监听
     */
    protected abstract void initListener();

    @Override
    protected void onResume() {
        super.onResume();
        loadData();
    }
}
