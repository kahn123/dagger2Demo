package com.daggr2.demo.newdagger2.test3.component;

import com.daggr2.demo.newdagger2.test3.module.AModuleTest3;

import dagger.Component;

@Component(modules = AModuleTest3.class)
public interface AComponentTest3 {

    BComponentTest3.Builder getComponent3();

}
