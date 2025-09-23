package Multithreading;

public class SharedResource {

    boolean itemAvailable = false;

    // synchronized put the monitor lock
    public synchronized void addItem(){
        itemAvailable = true;
        System.out.println("Items added by: " + Thread.currentThread().getName() + " adn invoking all threads which are waiting.");
        notifyAll();
    }

    public synchronized void removeItem(){
        System.out.println("Remove method invoked by " + Thread.currentThread().getName());

        while(!itemAvailable){
            try {
                System.out.println("Thread " + Thread.currentThread().getName() + " waiting for item available");
                wait(); // it releases the monitor lock
            } catch (InterruptedException e) {
                // handle exception here
            }
        }
        System.out.println("Items removed by: " + Thread.currentThread().getName());
        itemAvailable = false;
    }
}
