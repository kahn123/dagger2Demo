package com.daggr2.demo.newdagger2.test8.component;

import com.daggr2.demo.newdagger2.test8.App;
import com.daggr2.demo.newdagger2.test8.module.AppModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    void inject(App app);

    Sub1AppComponent.Builder getSubAppComponent();

}
