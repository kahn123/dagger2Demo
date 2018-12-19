package com.daggr2.demo.newdagger2.test8.bean;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;

public interface ApiService {

    @FormUrlEncoded
    @POST("post/post")
    Observable<String> findStr(@QueryMap Map<String,String> map);
}
