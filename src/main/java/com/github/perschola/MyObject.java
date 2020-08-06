package com.github.perschola;

public class MyObject implements Runnable {
    @Override
    public void run() {

//        --part 3--
//        System.out.println(Thread.currentThread().getName());
//        for (int i = 1; i <= 5; i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(i);


//        --part4--
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Thread name: " + Thread.currentThread().getName());
            System.out.println("Thread priority: " + Thread.currentThread().getPriority());
            System.out.println("===========================");
        }
    }
}
