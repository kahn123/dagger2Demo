package com.daggr2.demo.newdagger2.test3.component;

import com.daggr2.demo.newdagger2.test3.Test3Activity;
import com.daggr2.demo.newdagger2.test3.module.BModuleTest3;

import dagger.Component;
import dagger.Subcomponent;

@Subcomponent(modules = BModuleTest3.class)
public interface BComponentTest3 {
    void inject(Test3Activity test3Activity);

    @Subcomponent.Builder
    interface Builder {
        BComponentTest3 build();
    }

}
