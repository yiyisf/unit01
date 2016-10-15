package com.yiyi.test.Thread;

/**
 * Created by liuzhe on 2016/7/4.
 */
public class Ticket {
    private static Ticket ourInstance = new Ticket();

    private static  Integer total = 1000;

    public static Ticket getInstance() {
        return ourInstance;
    }

    private Ticket() {
    }

//    private static int total = 1000;

    public Boolean getTicket(){
        synchronized(this) {
            if (total > 0) {
                total--;
                return true;
            }
            return false;
        }
    }
}
