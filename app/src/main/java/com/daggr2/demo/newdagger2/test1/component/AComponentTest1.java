package com.daggr2.demo.newdagger2.test1.component;

import com.daggr2.demo.newdagger2.test1.bean.AppleTest1;
import com.daggr2.demo.newdagger2.test1.bean.OrangeTest1;
import com.daggr2.demo.newdagger2.test1.module.AModuleTest1;

import dagger.Component;

@Component(modules = {AModuleTest1.class})
public interface AComponentTest1 {
    AppleTest1 getApple();
    OrangeTest1 getOrange();


}
