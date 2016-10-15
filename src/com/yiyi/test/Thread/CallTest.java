package com.yiyi.test.Thread;

import java.util.concurrent.Callable;

/**
 * 实现Callable接口线程
 * Created by liuzhe on 2016/7/4.
 */
public class CallTest implements Callable<Integer>{
    Ticket ticket = Ticket.getInstance();
    private boolean falg = true;
    @Override
    public Integer call() throws Exception {
        int j = 0;
        for (int i = 0; i < 1000; i++) {
            if (ticket.getTicket()){
                j++;
            }
        }
        return j;
    }
}
