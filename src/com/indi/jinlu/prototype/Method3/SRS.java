package com.indi.jinlu.prototype.Method3;

public class SRS implements OfficialDocument {
    @Override
    public OfficialDocument clone() {
        OfficialDocument srs = null;
        try {
            srs = (OfficialDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不可复制！");
        }
        return srs;
    }

    @Override
    public void display() {
        System.out.println("《软件需求说明书》");
    }
}
