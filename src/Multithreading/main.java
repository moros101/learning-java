package Multithreading;

import java.util.Date;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.*;

public class main {

    public static void main(String[] args) {

        System.out.println("Thread name: " + Thread.currentThread().getName());

        // either impement Runnable Interface or extend Thread class
        // Runnable methods -> init, run, sleep, start, stop, interrupt

        MultithreadingLearning runnableObj =  new MultithreadingLearning();
        Thread thread1 = new Thread(runnableObj);
        thread1.start();
        System.out.println("Finish Main thread: " + Thread.currentThread().getName());

        // Makes sure only 1 thread goes inside a particular block of code
        MonitorLockExample obj = new MonitorLockExample();

        Thread t1 = new Thread(() -> {obj.task1();});
        Thread t2 = new Thread(() -> {obj.task2();});
        Thread t3 = new Thread(() -> {obj.task3();});

        t1.start();
        t2.start();
        t3.start();


        System.out.println("Main method start");

        SharedResource sharedResource = new SharedResource();

        // producer thread
        Thread producerThread = new Thread(() -> {
            try {
                Thread.sleep(15000);
            } catch (Exception e) {
                // throw some exception
            }
            sharedResource.addItem();
        });

        // consumer thread
        Thread consumerThread = new Thread(() -> {
            sharedResource.removeItem();
        });

        // Thread is in runnable state
        producerThread.start();
        consumerThread.start();

        System.out.println("Main method end");

        // Synchronized lock - Monitor lock -  wait & notify

        // Custom locks

        // Reentrant
        ReentrantLock reentrantLock = new ReentrantLock();

        // ReadWrite
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

        // Stamped - optimistic functionality
        StampedLock stampedLock = new StampedLock();
        long stamp = stampedLock.tryOptimisticRead();

        // Semaphore - for 2 or more threads
        Semaphore semaphore = new Semaphore(2);

        // Condition
        // await = wait
        // signal = notify
        Condition condition = reentrantLock.newCondition();
//        condition.await();
//        condition.signal();

        // Concurrency
        // 1. Lock based Mechanism
        // 2. Lock free mechanism - CAS Operation ( Compare and Swap ) => just like optimistic
        // AtomicInteger
        // AtomicBoolean
        // AtomicLong
        // AtomicReference




    }
}
