package com.daggr2.demo.newdagger2.test2.bean;

public class AppleTest2 implements FruitTest2 {
    String name;
    int numbers;

    public AppleTest2(String name, int numbers) {
        this.name = name;
        this.numbers = numbers;
    }

    @Override
    public String eat() {
        return "我是苹果";
    }
}
