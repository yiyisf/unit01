package com.yiyi.test.Thread;

/**
 * Created by liuzhe on 2016/7/4.
 */
public class T2 implements Runnable {
    @Override
    public void run() {
        Ticket ticket = Ticket.getInstance();
        int j = 0;
        for (int i = 0; i < 1000; i++) {
            if (ticket.getTicket()) {
                j++;
            } else {
                System.out.println(Thread.currentThread().getName() +"抢了" + (i < 0 ? 0 : i) + "次");
                System.out.println(Thread.currentThread().getName() +"抢到了" + j + "张票...");
                break;
            }
        }
    }
}
