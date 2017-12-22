package com.indi.jinlu.prototype.Method3;

public class Client {
    public static void main(String[] args) {
        PrototypeManager pm = PrototypeManager.getPrototypeManager();

        OfficialDocument doc1,doc2,doc3,doc4,doc5;
        doc1 = pm.getOfficialDocument("far");
        doc1.display();
        doc2 = pm.getOfficialDocument("far");
        doc2.display();
        System.out.println(doc1 == doc2);               //???
        doc3 = pm.getOfficialDocument("srs");
        doc3.display();
        doc4 = pm.getOfficialDocument("srs");
        doc4.display();
        System.out.println(doc3 == doc4);

        pm.addOfficialDocument("ppr", new OfficialDocument() {
            @Override
            public OfficialDocument clone() {
                OfficialDocument ppr = null;
                try {
                    ppr = (OfficialDocument) super.clone();
                } catch (CloneNotSupportedException e) {
                    System.out.println("不可复制！");
                }
                return ppr;
            }

            @Override
            public void display() {
                System.out.println("《项目进展报告》");
            }
        });
        doc5 = pm.getOfficialDocument("ppr");
        doc5.display();
    }
}
