package DataStructure;
import java.util.Scanner;
class Node {
    Object data;
    Node next;

    public Node(Object value) {
        this.data = value;
        this.next = null;
    }
}

class LinkedLists {
    private Node head;
    int size = 0;
    public LinkedLists() {
        this.head = null;
    }

    public void insertAtEnd(Object value) {
        if(this.size==10){
            throw new IndexOutOfBoundsException();
        }
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        ++size;
    }
    public void deleteByValue(Object value) {
        if (head == null) {
            return;
        }
        if (head.data.equals(value)) {
            head = head.next;
            return;
        }

        Node temp = head;
        while (temp.next != null && !temp.next.data.equals(value)) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
        --size;
    }


    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class LinkListTestCase {
    public static void main(String[] args) {
        LinkedLists list = new LinkedLists();
        Scanner sc = new Scanner(System.in);
        System.out.println("Add whatever you want to add, END to stop");
        while (true){

            Object obj = sc.nextLine();
            if(obj.equals("END")){
                break;
            }
            list.insertAtEnd(obj);
        }
//        list.insertAtEnd(10);
//        list.insertAtEnd("Hemant");
//        list.insertAtEnd(true);

        System.out.print("Linked List: ");
        list.display();
        System.out.println("Size before deleting "+list.size);
        System.out.println("Let me know what you want to delete from above");
        Object toDelete = sc.nextLine();
        list.deleteByValue(toDelete);
        System.out.print("After Deleting 20: ");
        list.display();

        System.out.println("Size of list is "+ list.size);


    }
}