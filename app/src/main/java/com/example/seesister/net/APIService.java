package com.example.seesister.net;

import com.example.seesister.DryInit;
import com.example.seesister.data.result.GankResult;


import io.reactivex.Flowable;

import retrofit2.Retrofit;

import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * 描述：API 请求接口
 */

public class APIService {

    private static String BASE_URL = "http://gank.io/";   //未启用

    public APIs apis;

    private static APIService instance;

    public static APIService getInstance() {
        if (instance == null) {
            instance = new APIService();
        }
        return instance;
    }

    private APIService() {
        Retrofit storeRestAPI = new Retrofit.Builder().baseUrl(BASE_URL)
                .client(DryInit.mOkHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        apis = storeRestAPI.create(APIs.class);
    }

    public interface APIs{

        /* Gank.io 妹子图 */
        @GET("http://gank.io/api/data/福利/{count}/{page}")
        Flowable<GankResult> fetchGankMZ(
                @Path("count") int count,
                @Path("page") int page
        );

    }

}
