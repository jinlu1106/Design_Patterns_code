package com.indi.jinlu.AbstractFactory.electric_appliance;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import sun.security.provider.certpath.OCSP;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class XMLUtil {
    public static Object getBean(){
        try {
            //创建文档对象
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc = builder.parse(new File("configuration/config1.xml"));

            //获取包含类名的文本节点
            NodeList li = doc.getElementsByTagName("className1");
            Node classNode = li.item(0).getFirstChild();
            String Name = classNode.getNodeValue().trim();

            //通过类名生成实例对象并将其返回
            Class c = Class.forName("com.indi.jinlu.AbstractFactory.electric_appliance." + Name);
            Object obj = c.newInstance();
            return obj;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
