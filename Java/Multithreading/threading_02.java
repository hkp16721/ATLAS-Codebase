package Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
//    private static int count = 0;
    private int count = 0;
    private final Lock lock = new ReentrantLock();

//    public static synchronized void increment() {
    public void increment(){
//        synchronized (this) {
//            System.out.println(count);
//            count++;
//        }
        lock.lock();
        try {
            count++;
        } finally {
            lock.unlock();
        }

    }

    public int getCount() {
        return count;
    }
}

class ThreadDemo1 extends Thread {
    Counter counter;

    ThreadDemo1(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            counter.increment();
        }
    }
}

public class threading_02 {
    public static void main(String[] args) {
        Counter counter = new Counter();
        ThreadDemo1 t1 = new ThreadDemo1(counter);
        ThreadDemo1 t2 = new ThreadDemo1(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            System.out.println("T1 counter "+ t1.counter.getCount());
            t2.join();
            System.out.println("T2 counter " + t2.counter.getCount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}
