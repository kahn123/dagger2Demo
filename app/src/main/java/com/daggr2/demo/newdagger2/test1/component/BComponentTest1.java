package com.daggr2.demo.newdagger2.test1.component;

import com.daggr2.demo.newdagger2.test1.Test1Activity;
import com.daggr2.demo.newdagger2.test1.bean.OrangeTest1;
import com.daggr2.demo.newdagger2.test1.module.BModuleTest1;

import dagger.Component;

@Component(dependencies = AComponentTest1.class,modules = BModuleTest1.class)
public interface BComponentTest1 {
    void inject(Test1Activity test1Activity);
}
