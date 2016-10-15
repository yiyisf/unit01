package com.yiyi.test.collectionSynchornized;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 使用Collections管理及同步容器
 * Created by liuzhe on 2016/7/4.
 */
public class T01 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10235);
        list.add(1023);
        list.add(102324);
        list.add(155);

        list =  Collections.synchronizedList(list);

        System.out.println(list.hashCode());


        List x = Collections.singletonList("tetst");
        System.out.println(x.getClass());
//        System.out.println(list.hashCode());

//        System.out.println(list);//原始顺序：[10235, 1023, 102324, 155]

        //list排序操作
//        Collections.reverse(list);//按原始顺序倒序：[155, 102324, 1023, 10235]
////        list.sort();
//        System.out.println(list.toString());
//
//        Collections.sort(list); //默认按内容升序排列：[155, 1023, 10235, 102324]
//        System.out.println(list);
//
//        list.sort(Collections.reverseOrder()); //按内容倒序排列：[102324, 10235, 1023, 155]
//        System.out.println(list);
    }
}
