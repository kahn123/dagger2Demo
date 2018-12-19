package com.daggr2.demo.newdagger2.test8;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.daggr2.demo.newdagger2.test8.component.AppComponent;
import com.daggr2.demo.newdagger2.test8.component.DaggerAppComponent;
import com.daggr2.demo.newdagger2.test8.module.AppModule;

import javax.inject.Inject;

public class App extends Application {
    @Inject
    SharedPreferences sharedPreferences;
    private static App instance;
    AppComponent appComponent;

    public static App get(Context context) {
        return (App) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initComponent();

    }


    public void initComponent() {
        if (appComponent == null) {
            appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
            appComponent.inject(this);

        }
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }

    public static App getInstance() {
        return instance;
    }
}
