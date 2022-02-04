package com.company.rinaldoDev;

public class Threads_1 {
    public static void main(String[] args) {
        //Thead atual
        Thread t=Thread.currentThread();
        System.out.println(t.getName());

        Thread t1=new Thread(new MeuRunnable());
        t1.start();

    }
}
