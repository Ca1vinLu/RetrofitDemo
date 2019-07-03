package me.lyz.retrofitdemo.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * @description:
 * @author: luyuzheng
 * @date: 2019-07-03 18:38
 */
@Entity
public class GitHubRepoEntity {

    @PrimaryKey
    public int id;
    public String name;

    public GitHubRepoEntity(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
