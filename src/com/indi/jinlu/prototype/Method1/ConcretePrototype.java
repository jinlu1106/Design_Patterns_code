package com.indi.jinlu.prototype.Method1;
//通用实现方法
public class ConcretePrototype implements Prototype {

    private String attr;

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }

   //克隆方法

    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype();
        prototype.setAttr(this.attr);
        return prototype;
    }
}
