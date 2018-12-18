package com.daggr2.demo.newdagger2.test6.module;

import com.daggr2.demo.newdagger2.test6.bean.RetrofitManager;
import com.daggr2.demo.newdagger2.test6.component.SonRetrofitComponent;

import java.util.concurrent.TimeUnit;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module(subcomponents = SonRetrofitComponent.class)
public class FatherRetrofitModule {
    private static final int TIME_OUT = 20;

    @Provides
    RetrofitManager providesRetrofitManager(Retrofit retrofit) {
        return new RetrofitManager(retrofit);
    }

    @Provides
    Retrofit providesRetrofit(OkHttpClient okHttpClient) {
        return new Retrofit.Builder().client(okHttpClient).baseUrl("asdsada").addCallAdapterFactory(RxJava2CallAdapterFactory.create()).addConverterFactory(GsonConverterFactory.create()).build();
    }

    @Provides
    OkHttpClient providesOkhttpClient() {
        return new OkHttpClient.Builder().writeTimeout(TIME_OUT, TimeUnit.SECONDS)
                .connectTimeout(TIME_OUT, TimeUnit.SECONDS)
                .readTimeout(TIME_OUT, TimeUnit.SECONDS)
                .addInterceptor(getHttpLoggingInterceptor())
                .build();
    }

    private HttpLoggingInterceptor getHttpLoggingInterceptor() {

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                System.out.println("body: " + message);
            }
        });
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        return interceptor;
    }
}
