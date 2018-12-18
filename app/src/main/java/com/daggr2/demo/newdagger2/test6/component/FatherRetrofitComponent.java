package com.daggr2.demo.newdagger2.test6.component;

import com.daggr2.demo.newdagger2.test6.module.FatherRetrofitModule;

import dagger.Component;

@Component(modules = FatherRetrofitModule.class)
public interface FatherRetrofitComponent {

    SonRetrofitComponent.Builder getSonRetrofitComponent();


}
