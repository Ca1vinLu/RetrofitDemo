package me.lyz.retrofitdemo;

import android.app.Application;
import android.content.Context;

/**
 * @description:
 * @author: luyuzheng
 * @date: 2019-07-03 19:20
 */
public class BaseApplication extends Application {

    private static Context mContext;

    public static Context getInstance() {
        return mContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }
}
