package Multithreading;

public class ProduceTask implements Runnable{

    SharedResource sharedResource;

    ProduceTask(SharedResource resource) {
        this.sharedResource = resource;
    }

    @Override
    public void run() {
        System.out.println("Producer thread: " + Thread.currentThread().getName());
        try{
            Thread.sleep(15000);

        } catch (Exception e) {
            // exception goes here
        }
        sharedResource.addItem();
    }



}
