package com.daggr2.demo.newdagger2.test8.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.daggr2.demo.newdagger2.test8.component.Sub1AppComponent;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = Sub1AppComponent.class)
public class AppModule {
    Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    @Singleton
    SharedPreferences providesSharedpreference() {
        return application.getSharedPreferences("sp", Context.MODE_PRIVATE);
    }

    @Provides
    Application providesApplication() {
        return application;
    }

}
