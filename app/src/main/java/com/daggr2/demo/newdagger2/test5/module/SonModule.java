package com.daggr2.demo.newdagger2.test5.module;

import com.daggr2.demo.newdagger2.test5.bean.Bike;

import dagger.Module;
import dagger.Provides;

@Module
public class SonModule {

    @Provides
    Bike providesBike(String name){
        return new Bike(name);
    }
}
