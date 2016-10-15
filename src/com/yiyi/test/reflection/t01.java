package com.yiyi.test.reflection;

import com.yiyi.test.Collection.ClassRoom;

/**
 * Created by liuzhe on 2016/7/5.
 */
public class t01 {
    public static void main(String[] args) {
        try {
            Class clzz = Class.forName("com.yiyi.test.Annonation.Student");

            System.out.println(clzz.hashCode());

            clzz = null;

            System.gc();

            System.runFinalization();

            System.out.println(Class.forName("com.yiyi.test.Annonation.Student").hashCode());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
