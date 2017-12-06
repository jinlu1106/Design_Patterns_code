package com.indi.jinlu.AbstractFactory.electric_appliance;
//海信产品生产工厂
public class Haixin implements IElectricFactory {
    @Override
    public Television createTelevision() {
        return new HaixinTV();
    }

    @Override
    public Fridge createFridge() {
        return new HaixinFridge();
    }
}
