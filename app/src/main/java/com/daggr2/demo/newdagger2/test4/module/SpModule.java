package com.daggr2.demo.newdagger2.test4.module;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import javax.inject.Inject;
import dagger.Module;
import dagger.Provides;

@Module
public class SpModule {
    Application application;

    public SpModule(Application application) {
        this.application = application;
    }

    @Provides
    SharedPreferences providesSp() {
        return application.getSharedPreferences("sp", Context.MODE_PRIVATE);
    }

}
