package com.yiyi.test.Collection;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Enumeration的使用
 * 1.判断hasnoreelemernt
 * 2.获取nextelement
 * <p>
 * Created by liuzhe on 2016/7/4.
 */
public class TestVector {
    /**
     * Vevtor的方法
     */

    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("tt01");
        v.add("t02");
        v.add("t03");
        v.add("t04");

        System.out.println(v.size());

        System.out.println(v.capacity());
        System.out.println(v.firstElement());

        System.out.println(v.lastElement());

        System.out.println("*****************************************");
        Enumeration<String > enumeration = v.elements();

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

    }
}
