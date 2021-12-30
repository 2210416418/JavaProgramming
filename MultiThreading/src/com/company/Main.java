package com.company;


import java.util.*;

import java.io.*;


public class Main {



    int balance;


    public static void main(String[] args) throws Exception {

        Main z = new Main();


        Thread t1 = new Thread(new Runnable() {

            public void run() {

                for (int i = 1; i <= 1000; i++) {


                    z.gainCalories();

                }


            }

        });


        Thread t2 = new Thread(new Runnable() {

            public void run() {

                for (int i = 1; i <= 1000; i++) {

                    z.burnCalories();

                }


            }

        });


        t1.start();

        t2.start();


        t1.join();

        t2.join();


        System.out.println("Balance is: " + z.balance);

    }



    public synchronized void gainCalories() {
        System.out.println("Calories Gained - " + balance);
        balance++;

    }


    public synchronized void burnCalories() {

        System.out.println("Calories Burned - " + balance);

        balance--;

    }



}