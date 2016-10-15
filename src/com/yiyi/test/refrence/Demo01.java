package com.yiyi.test.refrence;

import java.lang.ref.WeakReference;
import java.util.EnumMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.WeakHashMap;

/**
 * 垃圾回收机制：
 * 弱引用(new对象)在执行system.gc后悔被回收，强引用(常量)不会被回收
 *
 * IdentityHashMap检查key是否重复时检查地址，而非hashcode和equals
 * Created by liuzhe on 2016/7/4.
 */
public class Demo01 {
    enum Seasons{
        Spring, Summer, Autumn, Winter
    }
    public static void main(String[] args) {
        String s1 = "test strong reference";
        String s2 = new String("test weak referance");

//        WeakReference<String> ws = new WeakReference<String>(s1);
//
//        WeakReference<String > ws1 = new WeakReference<String>(s2);
//
//        s1 = null; //不可被回收，因使用常量定义
//        s2 = null; //可被回收，因使用new对象定义
//
//        System.gc();
//        System.runFinalization();
//
//        System.out.println(ws.get());
//        System.out.println(ws1.get());


//        IdentityHashMap<String ,String > imap = new IdentityHashMap<>();
//        imap.put("a", "testa");
//        System.out.println(imap.get("a"));
//
//        imap.put("a", "testa2");
//        System.out.println(imap.get("a"));
//
//        imap.put(new String("a"), "new a");
//        System.out.println(imap.keySet().toString());
//        imap.put(new String("a"), "new a");
//        System.out.println(imap.keySet().toString());//[a, a, a]

//        EnumMap<Seasons, String> enumMap = new EnumMap<Seasons, String>(Seasons.class);
//        enumMap.put(Seasons.Spring, "spring");
//        enumMap.put(Seasons.Spring, "spring test");
//        enumMap.put(Seasons.Winter, "winter");
//
//        System.out.println(enumMap.keySet());

        WeakHashMap<String ,String > weakHashMap = new WeakHashMap<>();
        weakHashMap.put(new String("a"), "test1");
        weakHashMap.put(new String("b"), "test2");
        weakHashMap.put("c", "test3");

        System.out.println(weakHashMap.size());//  3

        System.gc();
        System.runFinalization();

        System.out.println(weakHashMap.size());//  1,使用new String创建key的key/value被回收

    }
}
