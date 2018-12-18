package com.daggr2.demo.newdagger2.test6.bean;

import retrofit2.Retrofit;

public class RetrofitManager {

    Retrofit retrofit;

    public RetrofitManager(Retrofit retrofit) {
        this.retrofit = retrofit;
    }

    public Retrofit getRetrofit() {
        return retrofit;
    }
}
