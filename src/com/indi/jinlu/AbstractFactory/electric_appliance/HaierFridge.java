package com.indi.jinlu.AbstractFactory.electric_appliance;
//海尔电冰箱实现
public class HaierFridge implements  Fridge {
    @Override
    public void display() {
        System.out.println("海尔电冰箱");
    }
}
