package com.daggr2.demo.newdagger2.test1.bean;

public class AppleTest1 implements FruitTest1 {
    String name;
    int numbers;
    public AppleTest1(String name, int numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    @Override
    public String eat() {
        return "我是苹果";
    }
}
