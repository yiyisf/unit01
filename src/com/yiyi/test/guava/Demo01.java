package com.yiyi.test.guava;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 只读设置
 * 使用Conllections2创建过滤器，转换器及多重转换
 * Created by liuzhe on 2016/7/4.
 */
public class Demo01 {
    public static void main(String[] args) {
        List<String > list = new ArrayList<>();
        list.add("test01");
        list.add("test02");
        list.add("test03");
        list.add("03");
        list.add("ABBA");
        list.add("mom");

        List<String> newList =  Collections.unmodifiableList(list);

        Collection c = listFilter(list);
        c.forEach(System.out::println);

        Collection cUp = listTrasferUp(list);
        cUp.forEach(System.out::println);

        System.out.println("==================================");
        Function f = mutiFunc(list);

        Collection<String > result = Collections2.transform(list,f);

        result.forEach(System.out::println);




//        System.out.println(newList.size());
//        list.add("Test update");
//        System.out.println(newList.size());
//
//        System.out.println("----------------------");
//
////        不可更改的list
//        List<String> glist = ImmutableList.copyOf(list);
//        System.out.println(glist);
//        list.add("test update 2");
//        glist.add("foe guava");
//        System.out.println(list);
//        System.out.println(glist);
    }

    /**
     * 过滤器例子
     * @param list
     * @return
     */
    public static Collection listFilter(List list){

        Collection c = Collections2.filter(list, new Predicate<String >() {
            @Override
            public boolean apply(String  s) {
                return new StringBuilder(s).reverse().toString().equals(s);
            }
        });

        return c;
    }

    /**
     * 转换list
     */
    public static Collection listTrasferUp(List list){
        Collection c = Collections2.transform(list, new Function<String ,String >() {
            @Override
            public String  apply(String  s) {
                return s.toUpperCase();
            }
        });
        return c;
    }

    /**
     * 多重function
     */
    public static Function mutiFunc(List list){
        Function<String ,String> f1 = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.length()>5 ? s.substring(0,5) + "...": s;
            }
        };

        Function<String ,String> f2 = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };

        return Functions.compose(f1, f2);
    }

}
