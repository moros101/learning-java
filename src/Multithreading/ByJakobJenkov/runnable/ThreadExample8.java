package Multithreading.ByJakobJenkov.runnable;


import static java.lang.Thread.sleep;

public class ThreadExample8 {
    public static void main(String[] args) {
        Runnable runnable = () -> {
//            while(true) {
//                try {
//                    sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                System.out.println("Running");
//            }
            for(int i=0; i<10; i++) {
                try {
                    sleep(1000);
                    System.out.println("Running");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread thread = new Thread( runnable );
        thread.setDaemon(true);
        thread.start();
        try {
            sleep(3100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
