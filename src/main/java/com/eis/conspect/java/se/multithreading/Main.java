package com.eis.conspect.java.se.multithreading;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();

        Thread thread2 = new Thread(new MyThread1());
        thread2.start();

        Runnable thread3 = () -> IntStream.rangeClosed(1, 10).forEach(x -> System.out.println(Thread.currentThread().getName() + " " + x));
        thread3.run();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        IntStream.rangeClosed(1, 10).forEach(x -> System.out.println(Thread.currentThread().getName() + " " + x));
    }
}

class MyThread1 implements Runnable {
    @Override
    public void run() {
        IntStream.rangeClosed(1, 10).forEach(x -> System.out.println(Thread.currentThread().getName() + " " + x));
    }
}
