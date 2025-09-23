package Multithreading;

public class ConsumeTask implements Runnable {
    SharedResource sharedResource;

    ConsumeTask(SharedResource resource) {
        this.sharedResource = resource;
    }

    @Override
    public void run() {
        System.out.println("ConsumeTask is running");
        sharedResource.removeItem();
    }
}
