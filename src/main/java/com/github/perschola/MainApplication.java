package com.github.perschola;

public class MainApplication {
    public static void main(String[] args) {
        Thread thread1 = (new Thread(new MyObject()));
        Thread thread2 = (new Thread(new MyObject()));
        Thread thread3 = (new Thread(new MyObject()));

        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
