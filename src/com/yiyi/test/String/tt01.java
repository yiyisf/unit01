package com.yiyi.test.String;

/**
 * Created by liuzhe on 2016/7/11.
 */
public class tt01 {
    public static void main(String[] args) {
        String s = "1000 Ohm - You're - The One";

        String[] temp = s.split(" - ", 2);

        for (String s1 : temp) {
            System.out.println(s1);
        }
    }
}
