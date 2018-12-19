package com.daggr2.demo.newdagger2.test7.module;

import com.daggr2.demo.newdagger2.test7.FatherQualifier;
import com.daggr2.demo.newdagger2.test7.bean.Mice;
import com.daggr2.demo.newdagger2.test7.component.SonLunchComponent;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = SonLunchComponent.class)
public class FatherLunchModule {

    @Provides
    Mice providesMicce(@FatherQualifier String name){
        return  new Mice(name);
    }
}
