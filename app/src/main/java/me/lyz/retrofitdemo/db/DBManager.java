package me.lyz.retrofitdemo.db;

import android.arch.persistence.room.Room;

import me.lyz.retrofitdemo.BaseApplication;

/**
 * @description:
 * @author: luyuzheng
 * @date: 2019-07-03 19:19
 */
public class DBManager {

    private static AppDatabase appDb;

    public static AppDatabase getInstance() {
        if (appDb == null) {
            appDb = Room.databaseBuilder(BaseApplication.getInstance(),
                    AppDatabase.class, "github.db").build();
        }
        return appDb;
    }
}
