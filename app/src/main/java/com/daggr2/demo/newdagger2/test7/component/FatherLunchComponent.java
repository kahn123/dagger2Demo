package com.daggr2.demo.newdagger2.test7.component;

import com.daggr2.demo.newdagger2.test7.FatherQualifier;
import com.daggr2.demo.newdagger2.test7.module.FatherLunchModule;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = FatherLunchModule.class)
public interface FatherLunchComponent {
    SonLunchComponent.Builder getSonLunchComponent();

    @Component.Builder
    interface Builder {
        FatherLunchComponent buildFatherLunchComponent();

        @BindsInstance
        Builder toMice(@FatherQualifier String name);
    }

}
