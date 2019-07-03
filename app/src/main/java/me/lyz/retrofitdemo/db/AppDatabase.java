package me.lyz.retrofitdemo.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import me.lyz.retrofitdemo.dao.GitHubRepoDao;
import me.lyz.retrofitdemo.model.GitHubRepoEntity;

/**
 * @description:
 * @author: luyuzheng
 * @date: 2019-07-03 18:39
 */
@Database(entities = {GitHubRepoEntity.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {

    public abstract GitHubRepoDao githubRepoDao();
}
