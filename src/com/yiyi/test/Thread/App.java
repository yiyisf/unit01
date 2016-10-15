package com.yiyi.test.Thread;

import java.util.concurrent.*;

/**
 * Created by liuzhe on 2016/7/4.
 */
public class App {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        T1 t = new T1();//继承thread的线程
        T2 t2 = new T2();//实现Runable的线程

        ExecutorService es = Executors.newFixedThreadPool(3);  //创建线程池
        CallTest c1 = new CallTest();
        CallTest c2 = new CallTest();

        Future<Integer> r1 = es.submit(c1);
        t.start();
        Future<Integer> r2 = es.submit(c2);
        Future<?> r3 = es.submit(t2);
//        new Thread(t2,"线程2").start();
//        new Thread(t2,"线程3").start();

        try {
            System.out.println("**********************");
            Thread.sleep(1000);
            System.out.println("**********************");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("==========================");
        System.out.println(r1.toString()+ " :" + r1.get());
        System.out.println(r1.toString()+ " :" +r2.get());
//        System.out.println(r3.get().toString());

        es.shutdownNow();
        System.out.println("==========================");


    }
}
