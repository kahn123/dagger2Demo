package com.daggr2.demo.newdagger2.test3.bean;

public class AppleTest3 implements FruitTest3 {
    String name;
    int numbers;

    public AppleTest3(String name, int numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    @Override
    public String eat() {
        return "我是苹果";
    }
}
