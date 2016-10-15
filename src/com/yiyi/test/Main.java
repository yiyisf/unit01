package com.yiyi.test;

import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        
        InputStreamReader inr = null;
        try {
            inr = new InputStreamReader(System.in);

            System.out.println("输出q退出。。。");

            char c;
            do {
                c = (char) inr.read();
                System.out.print(c);
            } while (c != 'q');
        } finally {
            if (inr != null) {
                inr.close();
            }
        }
    }
}
