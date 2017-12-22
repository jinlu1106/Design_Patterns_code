package com.indi.jinlu.prototype.Method2;

public class ConcretePrototype implements Cloneable {
    private int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    private String name;
    private String Date;
    private String thing;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getThing() {
        return thing;
    }

    public void setThing(String thing) {
        this.thing = thing;
    }

    public ConcretePrototype clone(){
        Object object = null;
        try {
            object = super.clone();
            return (ConcretePrototype) object;
        } catch (CloneNotSupportedException e) {
            System.err.println("Not Support cloneable");
            return null;
        }
    }
}
