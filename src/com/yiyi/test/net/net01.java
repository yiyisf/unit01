package com.yiyi.test.net;

import com.google.common.base.Utf8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by liuzhe on 2016/7/4.
 */
public class net01 {
    public static void main(String[] args) {
//        try {
//            System.out.println(InetAddress.getLocalHost().getHostAddress());
//            System.out.println(InetAddress.getLoopbackAddress().getHostName());
//            System.out.println(InetAddress.getByName("www.google.com").getHostAddress());
//
//            System.out.println();
//        } catch (UnknownHostException e) {
//            e.printStackTrace();
//        }

        try {
            URL url = new URL("https://www.youtube.com/watch?v=3P6MUTiKuC0&index=182&list=PLTstZD3AK3S-eVO1jay1EURUVHG20_5dq");
            System.out.println("协议：" + url.getProtocol());
            System.out.println("Host：" + url.getHost());
            System.out.println("Path：" + url.getPath());
            System.out.println("Ref：" + url.getRef());
            System.out.println("File: " + url.getFile());
            System.out.println("Authority: " + url.getAuthority());
            System.out.println("Port: " + url.getPort());

//            URLConnection urlConnection = url.openConnection();
//
//            System.out.println(urlConnection);

            /**
             * 抓取返回数据流
             */
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(url.openStream()));

            String o = null;
            while ((o = br.readLine())!=null){
                System.out.println(o);
            }

            br.close();


            /**
             * 显示返回header信息
             */
//            System.out.println("Date: " + urlConnection.getDate());

//            Map<String,List<String>> h = urlConnection.getHeaderFields();
//
//            Set<String> ens = h.keySet();
//
//            for (String s: ens
//                 ) {
//                System.out.print(s + ": ");
//                System.out.println(h.get(s));
//            }


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
