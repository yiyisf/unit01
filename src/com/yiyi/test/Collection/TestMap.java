package com.yiyi.test.Collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by liuzhe on 2016/7/4.
 */
public class TestMap {

    public static void main(String[] args) {

        Map<String, Dog> m = new HashMap<>();
        Dog d = new Dog();
        d.setCount(1);

        m.put("1", d);

        m.get("1").setCount(2);

        System.out.println(m.get("1").getCount());

    }

}
