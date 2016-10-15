package com.yiyi.test.Thread;

/**
 * Created by liuzhe on 2016/7/4.
 */
public class T1 extends Thread {
    @Override
    public void run() {
        Ticket ticket = Ticket.getInstance();
        int j = 0;
        for (int i = 0; i < 1000; i++) {
            if (ticket.getTicket()) {
                j++;
            } else {
                System.out.println("线程1抢了" + (i < 0 ? 0 : i) + "次");
                break;
            }
        }
        System.out.println("线程1抢到了:" + j + "张票！");

    }
}
