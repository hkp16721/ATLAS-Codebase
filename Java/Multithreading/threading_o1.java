package Multithreading;

class RunnebleDemo implements Runnable{
    private Thread t;
    private String threadname;

    public RunnebleDemo(String name){
        this.threadname = name;
        System.out.println("thread "+threadname+"is running");
    }

    @Override
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println("Running"+threadname+", "+i);
                Thread.sleep(5000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Thread "+ threadname + " is exiting");
    }

    public void start(){
        System.out.println("thread "+ threadname + "Starting");
        if(t==null){
            t = new Thread(this, threadname);
            t.start();
        }
    }
}

public class threading_o1{
    public static void main(String[] args) {
        RunnebleDemo r1 = new RunnebleDemo("thread 01");
        r1.start();
        RunnebleDemo r2 = new RunnebleDemo("thread-o2");
        r2.start();
    }

}
