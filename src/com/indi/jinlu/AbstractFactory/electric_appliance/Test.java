package com.indi.jinlu.AbstractFactory.electric_appliance;

public class Test {
    public static void main(String[] args) {
        IElectricFactory ie;
        Television tv;
        Fridge fr;
        ie = new Haier();
//        tv = ie.createTelevision();
//        tv.display();
//        fr = ie.createFridge();
//        fr.display();
        ie = (IElectricFactory) XMLUtil.getBean();
        tv = ie.createTelevision();
        tv.display();
        fr = ie.createFridge();
        fr.display();
    }
}
