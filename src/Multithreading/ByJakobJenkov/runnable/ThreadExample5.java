package Multithreading.ByJakobJenkov.runnable;

public class ThreadExample5 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Lambda running");
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " running...");
            System.out.println("Lambda finished");
        };

        Thread thread1 = new Thread( runnable, "Thread one" );
        thread1.start();
        Thread thread2 = new Thread( runnable, "Thread two" );
        thread2.start();

    }
}
