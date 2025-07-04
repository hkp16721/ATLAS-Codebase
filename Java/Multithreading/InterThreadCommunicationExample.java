package Multithreading;

import java.util.List;

class SharedResource {
    private boolean ready = false;

    synchronized void produce() {
        try {
            while (ready) {
                wait();
                System.out.println("produce wait done");
            }
            System.out.println("Producing...");
            ready = true;
            notify(); //Use to notify other thread
            System.out.println("Notify to consume");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void consume() {
        try {
            while (!ready) {
                wait();
                System.out.println("Consume wait done");
            }
            System.out.println("Consuming...");
            ready = false;
            notify();
            try{Thread.sleep(5000);}catch (InterruptedException e){e.printStackTrace();};
            System.out.println("Notify to produce");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class InterThreadCommunicationExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
//        List<String> arr = List.of("1","2","3","4","5"); // testing :: method reference
//        arr.forEach(System.out::printf);
        Thread producer = new Thread(resource::produce);
        System.out.println("Calling consumer");
        Thread consumer = new Thread(resource::consume);
        System.out.println("Starting thread");

        producer.start();
        consumer.start();
    }
}

