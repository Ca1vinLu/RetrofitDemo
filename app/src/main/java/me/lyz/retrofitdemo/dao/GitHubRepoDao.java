package me.lyz.retrofitdemo.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

import me.lyz.retrofitdemo.model.GitHubRepoEntity;

/**
 * @description:
 * @author: luyuzheng
 * @date: 2019-07-03 18:44
 */
@Dao
public interface GitHubRepoDao {

    @Query("select * from GitHubRepoEntity")
    List<GitHubRepoEntity> getAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(List<GitHubRepoEntity> repos);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(GitHubRepoEntity repo);
}
