package com.daggr2.demo.newdagger2.test2.module;

import com.daggr2.demo.newdagger2.test2.bean.AppleTest2;
import com.daggr2.demo.newdagger2.test2.bean.OrangeTest2;

import dagger.Module;
import dagger.Provides;

@Module
public class AModuleTest2 {
    String name;
    int numbers;

    public AModuleTest2(String name, int numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    @Provides
    AppleTest2 providesApple() {
        return new AppleTest2(name, numbers);
    }

    @Provides
    OrangeTest2 providesOrange() {
        return new OrangeTest2();
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
