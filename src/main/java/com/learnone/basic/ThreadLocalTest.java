package com.learnone.basic;

public class ThreadLocalTest {

    static ThreadLocal threadLocal = new ThreadLocal();

    static public void main(String[] args){

        threadLocal.set(10);

        System.out.println("--线程取值1："+threadLocal.get());

        new Thread (new Runnable(){
            @Override
            public void run(){
                System.out.println("--线程取值1："+threadLocal.get());
            }
        }).start();


    }
}
