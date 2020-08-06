package com.github.perschola;

public class MyObject implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
