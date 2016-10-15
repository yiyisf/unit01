package com.yiyi.test.Collection;

/**
 * Created by liuzhe on 2016/7/4.
 */
public abstract class Test1<T, T1> {
    T name;
    abstract void print(T t);
}

/**
 *子类无指定，父类亦无指定，默认Object
 *
 */
class S1 extends Test1{
    @Override
    void print(Object o) {

    }
}

/**
 * 子类擦除
 * 子类指定(可与父类不同)，父类不指定
 * 重写的方法只能使用Object
 * @param <T>
 */
class S2<T2> extends Test1{
    @Override
    void print(Object o) {

    }
}

/**
 * 子类不指定，父类指定
 * 重写的方法是用父类指定的类型
 */
class S3 extends Test1<String , Integer>{

    @Override
    void print(String s) {

    }
}