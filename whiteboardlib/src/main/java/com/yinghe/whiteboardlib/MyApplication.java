package com.yinghe.whiteboardlib;

import android.app.Application;

import com.zhy.autolayout.config.AutoLayoutConifg;

/**
 * Created by acer-pc on 2017/12/26.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //拿设备的物理高度进行百分比化：
        AutoLayoutConifg.getInstance().useDeviceSize();
    }
}
