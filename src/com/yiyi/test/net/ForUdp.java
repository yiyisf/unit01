package com.yiyi.test.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by liuzhe on 2016/7/5.
 */
public class ForUdp {

    public static void main(String[] args) {

        try {
            DatagramSocket ds = new DatagramSocket(9000);
        } catch (SocketException e) {
            e.printStackTrace();
        }

    }

}
