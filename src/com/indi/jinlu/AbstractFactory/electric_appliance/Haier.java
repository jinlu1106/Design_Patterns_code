package com.indi.jinlu.AbstractFactory.electric_appliance;
//海尔产品生产工厂
public class Haier implements IElectricFactory {
    @Override
    public Television createTelevision() {
        return new HaierTV();
    }

    @Override
    public Fridge createFridge() {
        return new HaierFridge();
    }
}
