package com.github.perschola;

public class MainApplication {
    public static void main(String[] args) {
        (new Thread(new MyObject())).run();
        (new Thread(new MyObject())).start();
        (new Thread(new MyObject())).start();
    }
}
