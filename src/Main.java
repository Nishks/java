import FinalExample.ConsumeTask;
import FinalExample.ProduceTask;
import FinalExample.SharedResource;
import MonitorLock.MonitorLockExample;
import MonitorLock.MonitorThreadRunnable;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Going inside main method: " + Thread.currentThread().getName());
//
//        // implements runnable functional interface
//        Multithread obj = new Multithread();
//        Thread thread = new Thread(obj);
//        thread.start();
//
//        // Extends Thread class
//        ExtendFromThread ext = new ExtendFromThread();
//        ext.start();
//
//        // main method finished
//        System.out.println("Finish main method: " + Thread.currentThread().getName());


        // Monitor Lock
//        MonitorLockExample obj = new MonitorLockExample();
//
//        MonitorThreadRunnable runnable = new MonitorThreadRunnable(obj);
////        Thread t1 = new Thread(() -> {obj.task1();});
//        Thread t1 = new Thread(runnable);
//        Thread t2 = new Thread(() -> {obj.task2();});
//        Thread t3 = new Thread(() -> {obj.task3();});
//
//        t1.start();
//        t2.start();
//        t3.start();

        // All function of thread
        System.out.println("Main method start");

        SharedResource sharedResource  = new SharedResource();

        // producer thread
        Thread producerThread = new Thread(new ProduceTask(sharedResource));
        // consumer thread
        Thread consumerThread = new Thread(new ConsumeTask(sharedResource));

        // thread is in "RUNNABLE state"
        producerThread.start();
        consumerThread.start();

        System.out.println("Main method end");
    }
}