package com.daggr2.demo.newdagger2.test5.component;

import com.daggr2.demo.newdagger2.test5.module.FatherModule;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = FatherModule.class)
public interface FatherComponent {
    SonComponent.Builder  getSonComponent();


    @Component.Builder
    interface Builder{
        FatherComponent buildFatherComponent();
        @BindsInstance
        Builder toFatherInt(int money);
    }
}
