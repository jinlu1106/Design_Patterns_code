package com.indi.jinlu.FactoryMethod;
//产品实现2
public class Product2 implements IProduct{
    @Override
    public void create() {
        System.out.println("Create Product2");
    }

    @Override
    public void show() {
        System.out.println("Show Product2");
    }
}
