package com.company;

public class FirstThread extends Thread{
    public void run(){
        System.out.println("Thread 1");
    }

    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread();
        firstThread.start();
    }
}
