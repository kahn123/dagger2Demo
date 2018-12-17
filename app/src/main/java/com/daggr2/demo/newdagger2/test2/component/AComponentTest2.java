package com.daggr2.demo.newdagger2.test2.component;

import com.daggr2.demo.newdagger2.test2.bean.AppleTest2;
import com.daggr2.demo.newdagger2.test2.module.AModuleTest2;
import com.daggr2.demo.newdagger2.test2.module.BModuleTest2;

import dagger.Component;

@Component(modules = {AModuleTest2.class})
public interface AComponentTest2 {
        BComponentTest2 getBcomponent2();
}
