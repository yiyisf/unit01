package com.yiyi.test.Collection;

/**
 * Created by liuzhe on 2016/7/3.
 */
public class Test<T, T1> {
    private T id;
    private T1 name;

    public Test(T id, T1 name) {
        this.id = id;
        this.name = name;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public T1 getName() {
        return name;
    }

    public void setName(T1 name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Test<Integer, String > t = new Test<>(10, "test");

        t.getId();
        System.out.println(t.getName());
    }
}


