package com.yiyi.test.Collection;

import java.io.*;
import java.util.Properties;

/**
 * Created by liuzhe on 2016/7/4.
 */
public class Tproperties {

    public static void main(String[] args) {
        Properties properties = new Properties();

//        properties.setProperty("driver","mysql.jdbc.driver");
//        properties.setProperty("url", "jdbc:mysql://20.22.22.22:3306");
//        properties.setProperty("user","yiyi");
//        properties.setProperty("password", "yiyi");
//
//        try {
//            properties.store(new FileOutputStream(new File("jdbc.properties")), "jdbc配置信息");
//            properties.storeToXML(new FileOutputStream(new File("jdbc.xml")), "jdbc xml配置信息", "utf-8");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        System.out.println(Tproperties.class.getResource(""));//file:/E:/yiyi/JAVA/unit01/out/production/unit01/com/yiyi/test/Collection/
        System.out.println(Tproperties.class.getResource("/"));//file:/E:/yiyi/JAVA/unit01/out/production/unit01/
//        System.out.println(Thread.currentThread().getContextClassLoader().getResource(""));//file:/E:/yiyi/JAVA/unit01/out/production/unit01/
//        try {
//
//            properties.load(new FileReader(new File("jdbc.properties"))); //使用FileReader
////            properties.load(new FileInputStream(new File("jdbc.properties")));//使用FileInputStream
//            System.out.println(properties.getProperty("url"));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

}
