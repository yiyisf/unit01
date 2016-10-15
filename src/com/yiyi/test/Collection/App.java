package com.yiyi.test.Collection;

import java.util.*;

/**
 * Created by liuzhe on 2016/7/4.
 */
public class App {
    public static void main(String[] args) {

        List<Student> Slist = new ArrayList<>();
        insertStudent(Slist);

        Map<Integer, ClassRoom> Mc = new HashMap<>();
        count(Mc, Slist);

    }

    private static void count(Map<Integer, ClassRoom> mc, List<Student> slist) {
        for (Student stu :
                slist) {
            Integer no = stu.getNo();
            Double score = stu.getScore();

            ClassRoom c = null;

            if ((c = mc.get(no)) != null) {
                c.setTotal(c.getTotal() + score);
            }else {
                c = new ClassRoom(no, score);
                mc.put(no, c);
            }
        }

        Set<Map.Entry<Integer, ClassRoom>> ets = mc.entrySet();

        for (Map.Entry<Integer, ClassRoom> c : ets) {

            System.out.println("班级：" + c.getKey() + "总分是：" + c.getValue().getTotal());
        }

    }

    private static void insertStudent(List<Student> slist) {
        slist.add(new Student("01", 1, 80.5));
        slist.add(new Student("02", 1, 80.5));
        slist.add(new Student("01", 2, 82.5));
        slist.add(new Student("01", 3, 0.5));
        slist.add(new Student("01", 3, 10.5));
        slist.add(new Student("05", 6, 100.0));
        slist.add(new Student("01", 3, 0.5));
    }


}
