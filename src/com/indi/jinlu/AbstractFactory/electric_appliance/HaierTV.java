package com.indi.jinlu.AbstractFactory.electric_appliance;
//海尔电视实现
public class HaierTV implements Television {
    @Override
    public void display() {
        System.out.println("海尔电视");
    }
}
