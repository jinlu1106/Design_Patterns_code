package com.indi.jinlu.FactoryMethod;
//产品实现1
    public class Product1 implements IProduct {
        @Override
        public void create() {
            System.out.println("Create Product1");
        }

        @Override
        public void show() {
            System.out.println("Show Product1");
        }
}
