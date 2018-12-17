package com.daggr2.demo.newdagger2.test1.module;

import com.daggr2.demo.newdagger2.test1.bean.AppleTest1;
import com.daggr2.demo.newdagger2.test1.bean.OrangeTest1;

import dagger.Module;
import dagger.Provides;

@Module
public class AModuleTest1 {
    String name;
    int numbers;

    public AModuleTest1(String name, int numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    @Provides
    AppleTest1 providesApple() {
        return new AppleTest1(name, numbers);
    }

    @Provides
    OrangeTest1 providesOrange() {
        return new OrangeTest1();
    }


    //非module构造注入使用此方法返回相应实例
    @Provides
    String providesString() {
        return name;
    }

    @Provides
    Integer providesInteger() {
        return numbers;
    }
}
