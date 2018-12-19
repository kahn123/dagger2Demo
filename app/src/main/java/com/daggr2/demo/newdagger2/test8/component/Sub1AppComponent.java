package com.daggr2.demo.newdagger2.test8.component;

import com.daggr2.demo.newdagger2.test8.Test8Activity;
import com.daggr2.demo.newdagger2.test8.module.Sub1AppModule;
import com.daggr2.demo.newdagger2.test8.scope.MyScope;

import dagger.Subcomponent;
@MyScope
@Subcomponent(modules = Sub1AppModule.class)
public interface Sub1AppComponent {

    void inject(Test8Activity test8Activity);

    @Subcomponent.Builder
    interface Builder {
        Sub1AppComponent buildSubAppComponent();
    }
}
