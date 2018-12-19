package com.daggr2.demo.newdagger2.test7.module;

import com.daggr2.demo.newdagger2.test7.FatherQualifier;
import com.daggr2.demo.newdagger2.test7.SonQualifier;
import com.daggr2.demo.newdagger2.test7.bean.Noodle;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class SonLunchModule {

    @Provides
    Noodle providesNoodle(@SonQualifier String money){
        return new Noodle(money);
    }

}
