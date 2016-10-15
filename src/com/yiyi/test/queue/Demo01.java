package com.yiyi.test.queue;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by liuzhe on 2016/7/4.
 */
public class Demo01 {
    public static void main(String[] args) {
        Queue<Request> queue = new ArrayDeque<>();

//        模拟排队
        for (int i = 0; i < 10; i++) {
            final int finalI = i;
            queue.add(new Request() {
                @Override
                public void deposit() {
                    System.out.println("deposit:" + finalI);
                }

                @Override
                public void cash() {
                    System.out.println("cash:" + finalI);

                }
            });
        }

        deposit(queue);


    }

    private static void deposit(Queue<Request> queue) {
        Request r =null;
        while ((r =queue.poll())!= null){
            r.deposit();
            r.cash();
        }
    }
}

interface Request {
    void deposit();
    void cash();
}
