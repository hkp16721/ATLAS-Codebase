package DataStructure;
import java.util.Scanner;

class Node1 {
    Object data;
    Node1 next;
    Node1 prev;

    public Node1(Object value) {
        this.data = value;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    private Node1 head;
    private Node1 tail;
    int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertAtEnd(Object value) {
        if (this.size == 10) {
            throw new IndexOutOfBoundsException("List is full. Max size is 10.");
        }
        Node1 newNode = new Node1(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void insertAtBeginning(Object value) {
        if (this.size == 10) {
            throw new IndexOutOfBoundsException("List is full. Max size is 10.");
        }
        Node1 newNode = new Node1(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void deleteByValue(Object value) {
        if (head == null) {
            System.out.println("List is empty, nothing to delete.");
            return;
        }

        Node1 current = head;

        if (head.data.equals(value)) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            size--;
            System.out.println("Value '" + value + "' deleted.");
            return;
        }

        while (current != null && !current.data.equals(value)) {
            current = current.next;
        }


        if (current == null) {
            System.out.println("Value '" + value + "' not found in the list.");
            return;
        }


        if (current == tail) {
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
            size--;
            System.out.println("Value '" + value + "' deleted.");
            return;
        }

        if (current.next != null) {
            current.next.prev = current.prev;
        }
        if (current.prev != null) {
            current.prev.next = current.next;
        }
        size--;
        System.out.println("Value '" + value + "' deleted.");
    }


    public void displayForward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node1 temp = head;
        System.out.print("Forward: NULL <-> ");
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.next != null) {
                System.out.print(" <-> ");
            }
            temp = temp.next;
        }
        System.out.println(" <-> NULL");
    }

    public void displayBackward() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }
        Node1 temp = tail;
        System.out.print("Backward: NULL <-> ");
        while (temp != null) {
            System.out.print(temp.data);
            if (temp.prev != null) {
                System.out.print(" <-> ");
            }
            temp = temp.prev;
        }
        System.out.println(" <-> NULL");
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
}

public class DoublyLinkList {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Doubly Linked List Operations ---");
        System.out.println("Enter items to add to the list (type 'END' to stop adding):");
        while (true) {
            Object obj = sc.nextLine();
            if (obj.equals("END")) {
                break;
            }
            try {
                list.insertAtEnd(obj);
            } catch (IndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
                break;
            }
        }

        System.out.println("\n--- Current List ---");
        list.displayForward();
        list.displayBackward();
        System.out.println("Current Size: " + list.getSize());

        if (!list.isEmpty() && list.getSize() < 10) {
            System.out.println("\nEnter an item to insert at the beginning:");
            Object beginningItem = sc.nextLine();
            list.insertAtBeginning(beginningItem);
            System.out.println("\n--- List after inserting at beginning ---");
            list.displayForward();
            list.displayBackward();
            System.out.println("Current Size: " + list.getSize());
        }

        if (!list.isEmpty()) {
            System.out.println("\nEnter value to delete from the list:");
            Object toDelete = sc.nextLine();
            list.deleteByValue(toDelete);
            System.out.println("\n--- List after deletion ---");
            list.displayForward();
            list.displayBackward();
            System.out.println("Current Size: " + list.getSize());
        } else {
            System.out.println("\nList is empty, cannot perform deletion.");
        }

        System.out.println("\n--- Testing Edge Cases ---");
        DoublyLinkedList emptyList = new DoublyLinkedList();
        System.out.println("Empty List check:");
        emptyList.displayForward();
        emptyList.deleteByValue("test");

        System.out.println("\nSingle Item List check:");
        emptyList.insertAtEnd("Single");
        emptyList.displayForward();
        emptyList.deleteByValue("Single");
        emptyList.displayForward();

        sc.close();
    }
}