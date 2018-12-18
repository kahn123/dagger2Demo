package com.daggr2.demo.newdagger2.test5.component;

import com.daggr2.demo.newdagger2.test5.Test5Activity;
import com.daggr2.demo.newdagger2.test5.module.SonModule;

import dagger.BindsInstance;
import dagger.Subcomponent;

@Subcomponent(modules =SonModule.class)
public interface SonComponent {
    void inject(Test5Activity test5Activity);

    @Subcomponent.Builder
    interface Builder{
        SonComponent buildSonComponent();
        @BindsInstance
        Builder toSonStr(String name);
    }
}
