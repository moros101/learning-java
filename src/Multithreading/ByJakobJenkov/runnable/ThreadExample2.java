package Multithreading.ByJakobJenkov.runnable;

public class ThreadExample2 {

    public static class MyThread extends Thread {
        public void run() {
            System.out.println("My thread running");
            System.out.println("My thread finished");
        }
    }
    public static void main(String[] args) {
        MyThread mythread = new MyThread();
        mythread.start();
    }
}
