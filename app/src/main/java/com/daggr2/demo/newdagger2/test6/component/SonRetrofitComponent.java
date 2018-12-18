package com.daggr2.demo.newdagger2.test6.component;

import com.daggr2.demo.newdagger2.test6.Test6Activity;
import com.daggr2.demo.newdagger2.test6.module.SonRetrofitModule;

import dagger.Component;
import dagger.Subcomponent;

@Subcomponent(modules = SonRetrofitModule.class)
public interface SonRetrofitComponent {
    void inject(Test6Activity test6Activity);

    @Subcomponent.Builder
    interface Builder{
        SonRetrofitComponent buildSonRetrofitComponent();
    }
}
