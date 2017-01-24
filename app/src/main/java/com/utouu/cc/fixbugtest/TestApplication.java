package com.utouu.cc.fixbugtest;

import android.app.Application;

import com.utouu.cc.fixbugtest.manager.FixBugManage;

/**
 * Create by 任新 on 2017/1/23 15:18
 * Function：TestApplication
 * Desc：
 */
public class TestApplication extends Application {
    public FixBugManage mFixBugManage;

    @Override
    public void onCreate() {
        super.onCreate();
        this.mFixBugManage = new FixBugManage(this);
        //初始化版本
        this.mFixBugManage.init("1.0");
    }
}
