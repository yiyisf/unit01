package com.yiyi.test.Collection;

import java.util.*;

/**
 *
 * Created by liuzhe on 2016/7/3.
 */
public class myArryList {

    volatile String st;

    public static void main(String[] args) {

        Set<Object> s = new HashSet<>();
        s.add("1");
        s.add("2");
        s.add("3");
        s.add("4");

        Iterator r = s.iterator();

        while (r.hasNext()){
            System.out.println(r.next());
        }




//        int a = 11;
//        int b = 3;
//        System.out.println(Integer.toBinaryString(a));
//        System.out.println(Integer.toBinaryString(b));
//
//        System.out.println(11 & 3);
//        String aa = "sgdfhs";
//        char[] ac = aa.toCharArray();
//        System.out.println(aa.length());
//        System.out.println(ac[10]);

//        System.out.println(Math.max((int) (10/.75f) + 1, 16));



    }
}
