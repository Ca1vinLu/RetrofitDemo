package me.lyz.retrofitdemo.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @description: Retrofit工具类
 * @author: luyuzheng
 * @date: 2019-04-25 18:00
 */
public class RetrofitUtils {

    public static final String BASE_URL = "https://api.github.com/";

    private static volatile Retrofit sRetrofit;

    public static Retrofit getRetrofit() {
        if (sRetrofit == null) {
            synchronized (RetrofitUtils.class) {
                if (sRetrofit == null) {
                    sRetrofit = new Retrofit.Builder()
                            .baseUrl(BASE_URL)
                            .addConverterFactory(GsonConverterFactory.create())
                            .build();
                }
            }
        }
        return sRetrofit;
    }

}
