package com.daggr2.demo.newdagger2.test4.component;

import android.app.Application;

import com.daggr2.demo.newdagger2.test4.Test4Activity;
import com.daggr2.demo.newdagger2.test4.module.SpModule;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = SpModule.class)
public interface SpComponent {

    void inject(Test4Activity test4Activity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        SpComponent build1();

        Builder module(SpModule componentBuilderModule);
    }


}
