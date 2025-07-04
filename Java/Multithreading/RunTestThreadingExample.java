package Multithreading;
class Test extends Thread{
    public void run(){
        System.out.println("thread started.");
    }
}

public class RunTestThreadingExample {
    public static void main(String args[]){

        Test t1 = new Test();
//        t1.run();
        Thread t2 = new Thread();
//        t2.start();
        t2.run();
    }
}

