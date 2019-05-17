package com.mycompany.app;

/**
 * Hello world!
 *
 */
class Multithread implements Runnable
{
    public void run ()
    {
        try {
            System.out.println ("Thread " + Thread.currentThread().getId() + " is running");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

public class ThreadingFun
{
    ThreadingFun() 
    { 
        int n = 8; // Number of threads 
        for (int i=0; i<n; i++) 
        { 
            Thread object = new Thread(new Multithread()); 
            object.start(); 
        } 
    }
}