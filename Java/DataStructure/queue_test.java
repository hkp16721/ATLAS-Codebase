package DataStructure;
import java.util.LinkedList;

class queue<T>{
    private int size;
    private LinkedList<T> lt = new LinkedList<>();
    public queue(int size){
        this.size=size;
    }
    public boolean is_full(){
        return (lt.size() == this.size);
    }

    public void enqueue(T element){
        if(is_full()){
            System.out.println("Queue is full");
            throw new IndexOutOfBoundsException("Queue is full");
        }
        else {
            lt.addLast(element);
            System.out.println("Item enqueues ");
        }
    }
    public void dequeue(){
        System.out.println("removed first inserted "+lt.getFirst());
        lt.removeFirst();
    }
    public void display(){
        System.out.println(lt);
    }
    public void peek(){
        System.out.println(lt.getFirst());
    }

}

public class queue_test {
    public static void main(String[] args) {
        queue q = new queue(4);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        //q.enqueue(50);
        q.display();
        q.dequeue();
        q.display();
        q.peek();

    }

}
