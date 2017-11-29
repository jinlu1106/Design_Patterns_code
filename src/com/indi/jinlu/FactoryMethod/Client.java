package com.indi.jinlu.FactoryMethod;

//客户类
public class Client {
    public static void main(String[] args) {
        //创建product1类型的具体产品
        IFactory iFactory1 = new FactoryMethod1();
        IProduct product1 = iFactory1.createProduct();
        product1.create();
        product1.show();
        //创建product2类型的具体产品
        IFactory iFactory2 = new FactoryMethod2();
        IProduct product2 = iFactory2.createProduct();
        product2.create();
        product2.show();
        //配置文件读取类的信息，并利用反射创建对象
        IFactory iFactory;
        IProduct iProduct;
        iFactory = (IFactory) XMLUtil.getBean();
        iProduct = iFactory.createProduct();
        iProduct.create();
        iProduct.show();
        //工厂方法隐藏
        newFactory factory;
        factory = (newFactory) XMLUtil.getBean();
        factory.create();

    }
}
