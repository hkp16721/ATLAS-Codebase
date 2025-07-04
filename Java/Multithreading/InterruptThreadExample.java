package Multithreading;
class InterruptibleThread extends Thread {
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {//  condition line 18 is true //Line 22 - condition set to false
                System.out.println("Thread is running");
                Thread.sleep(100);
            }
            System.out.println("While loop ended");
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted");

        }
    }
}

public class InterruptThreadExample {
    public static void main(String[] args) {
        InterruptibleThread thread = new InterruptibleThread();
        thread.start();

        try {
            Thread.sleep(500);
            thread.interrupt(); //
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

