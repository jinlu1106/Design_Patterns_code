package com.indi.jinlu.prototype.Method2;

import java.io.IOException;

public class WeekClient {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        WeekLog weekLog = new WeekLog();
        weekLog.setName("凡凡~");
        weekLog.setDate("2017-12-12");
        weekLog.setContent("工作工作~~");
//        Attachment attachment = new Attachment();
//        weekLog.setAttachment(attachment);
        DeepAttachment deepAttachment = new DeepAttachment();
        weekLog.setDeepAttachment(deepAttachment);


//        WeekLog weekLog1 = weekLog.clone();
        WeekLog weekLog1 = weekLog.deepClone();
//        try {
//            WeekLog weekLog1 = weekLog.deepClone();
//        }catch (Exception e){
//            System.out.println("克隆失败！");
//        }

        weekLog1.setName("靳璐~");
        weekLog1.setContent("学习学习~~");
        DeepAttachment deepAttachment1 = new DeepAttachment();
        weekLog.setDeepAttachment(deepAttachment1);
        System.out.println("***********一************");
        System.out.println("姓名：" + weekLog.getName());
        System.out.println("日期：" + weekLog.getDate());
        System.out.println("事情：" + weekLog.getContent());
//        System.out.println("附件：" + weekLog.getAttachment());
        System.out.println("附件：" + weekLog.getDeepAttachment());
        System.out.println("***********二************");
        System.out.println("姓名：" + weekLog1.getName());
        System.out.println("日期：" + weekLog1.getDate());
        System.out.println("事情：" + weekLog1.getContent());
//        System.out.println("附件：" + weekLog1.getAttachment());
        System.out.println("附件：" + weekLog1.getDeepAttachment());

//        System.out.println("浅克隆：");
//        System.out.println("周报是否相同：" + (weekLog == weekLog1));
//        System.out.println("附件是否相同："
//                + (weekLog.getAttachment() == weekLog1.getAttachment()));

        System.out.println("深克隆：");
        System.out.println("周报是否相同：" + (weekLog == weekLog1));
        System.out.println("附件是否相同："
                + (weekLog.getDeepAttachment() == weekLog1.getDeepAttachment()));
    }
}
