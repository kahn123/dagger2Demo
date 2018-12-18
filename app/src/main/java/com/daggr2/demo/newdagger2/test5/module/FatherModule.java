package com.daggr2.demo.newdagger2.test5.module;

import com.daggr2.demo.newdagger2.test5.bean.Car;
import com.daggr2.demo.newdagger2.test5.component.SonComponent;

import dagger.Module;
import dagger.Provides;
import dagger.Subcomponent;

@Module(subcomponents = SonComponent.class)
public class FatherModule {

    @Provides
    Car providesCar(){
        return new Car();
    }
}
