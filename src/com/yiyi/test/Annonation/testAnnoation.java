package com.yiyi.test.Annonation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by liuzhe on 2016/7/5.
 */
public class testAnnoation {
    public static void main(String[] args) {
        try {
            Class c = Class.forName("com.yiyi.test.Annonation.Student");

            Field name = c.getDeclaredField("name");

            /**
             * 通过反射获取到class后，取到field的注解内容
             */
            System.out.println("name of field name is :" + name.getAnnotation(TableField.class).name());//name
            System.out.println("type of field name is :" + name.getAnnotation(TableField.class).type());//verchar
            System.out.println("len of field name is :" + name.getAnnotation(TableField.class).len());//30

            /**
             * 通过反射获取类的方法，通过使用getModifiers()检查方法是public还是private(获取修饰符)
             */
//            Method[] ms =  c.getDeclaredMethods();
//            for (Method m : ms) {
//                System.out.println(m.getName()+ " : " + m.getModifiers());
////                System.out.println(m.getName()+ " : " + m.toGenericString());
//            }

        } catch (ClassNotFoundException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
