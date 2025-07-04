package DataStructure;

import java.util.NoSuchElementException;

class CircularNode {
    int data;
    CircularNode next;

    public CircularNode(int data) {
        this.data = data;
        this.next = null;
    }
}


class CircularLinkedList {
    private CircularNode head;
    private CircularNode tail;
    private int size;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }


    public boolean isEmpty() {
        return head == null;
    }


    public int size() {
        return size;
    }


    public void add(int data) {
        CircularNode newNode = new CircularNode(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
        size++;
    }


    public void display() {
        if (isEmpty()) {
            System.out.println("Circular Linked List: List is empty.");
            return;
        }

        System.out.print("Circular Linked List: ");
        CircularNode current = head;
        int count = 0;
        do {
            System.out.print(current.data);
            current = current.next;
            count++;
            if (current != head) {
                System.out.print(" -> ");
            }

            if (count > size * 2 && size > 0) {
                System.out.print(" -> (Loop detected/truncated display)");
                break;
            }
        } while (current != head);

        System.out.println(" -> (Head)");
    }


    public void addFirst(int data) {
        CircularNode newNode = new CircularNode(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        size++;
    }

    public int removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("List is empty. Cannot remove from an empty list.");
        }
        int data = head.data;
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            tail.next = head;
        }
        size--;
        return data;
    }
}

public class CircularLinkedLists {
    public static void main(String[] args) {
        CircularLinkedList myList = new CircularLinkedList();

        System.out.println("Is list empty? " + myList.isEmpty());
        myList.display();

        System.out.println("\nAdding elements to the list:");
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);
        myList.display();
        System.out.println("List size: " + myList.size());

        System.out.println("\nAdding an element at the beginning:");
        myList.addFirst(5);
        myList.display();
        System.out.println("List size: " + myList.size());

        System.out.println("\nRemoving the first element:");
        int removedData = myList.removeFirst();
        System.out.println("Removed: " + removedData);
        myList.display();
        System.out.println("List size: " + myList.size());

        System.out.println("\nRemoving another first element:");
        removedData = myList.removeFirst();
        System.out.println("Removed: " + removedData);
        myList.display();
        System.out.println("List size: " + myList.size());


        System.out.println("\nClearing the list:");
        while (!myList.isEmpty()) {
            myList.removeFirst();
        }
        myList.display();
        System.out.println("List size: " + myList.size());
        System.out.println("Is list empty? " + myList.isEmpty());
    }
}
