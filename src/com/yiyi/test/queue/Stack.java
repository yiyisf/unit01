package com.yiyi.test.queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by liuzhe on 2016/7/4.
 */
public class Stack<E> {
//    容器
    private Deque<E> eDeque = new ArrayDeque<>();
//定义容器的容量
    private int cap;

    public Stack(int cap) {
        this.cap = cap;
    }

//    压栈
    public Boolean push(E e){
        if (eDeque.size() >= cap){
            return false;
        }
        return eDeque.offerLast(e);
    }

//    弹栈
    public E pop(){
        return eDeque.pollLast();
    }

//    获取

    public E get(){
        return eDeque.peekLast();
    }

//    获取size
    public int getSize(){
        return eDeque.size();
    }

    public static void main(String[] args) {
        Stack<String> s = new Stack<>(10);

        s.push("01");
        s.push("02");
        s.push("03");
        s.push("04");

        System.out.println(s.getSize());

        System.out.println(s.get());

        System.out.println(s.getSize());

        System.out.println(s.pop());

        System.out.println(s.getSize());
    }

}
