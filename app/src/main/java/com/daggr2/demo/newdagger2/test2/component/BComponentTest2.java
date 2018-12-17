package com.daggr2.demo.newdagger2.test2.component;


import com.daggr2.demo.newdagger2.test2.Test2Activity;
import com.daggr2.demo.newdagger2.test2.module.BModuleTest2;

import dagger.Subcomponent;

@Subcomponent(modules = BModuleTest2.class)
public interface BComponentTest2 {

    void inject(Test2Activity test2Activity);
}
