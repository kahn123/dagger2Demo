package com.daggr2.demo.newdagger2.test3.module;

import com.daggr2.demo.newdagger2.test3.bean.AppleTest3;
import com.daggr2.demo.newdagger2.test3.bean.OrangeTest3;
import com.daggr2.demo.newdagger2.test3.component.BComponentTest3;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = BComponentTest3.class)
public class AModuleTest3 {
    String name;
    int numbers;

    public AModuleTest3(String name, int numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    @Provides
    AppleTest3 providesApple() {
        return new AppleTest3(name, numbers);
    }

    @Provides
    OrangeTest3 providesOrange() {
        return new OrangeTest3();
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
