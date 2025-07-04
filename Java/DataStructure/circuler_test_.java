package DataStructure;

class node2 {
    int data;
    node2 next;

    node2(int value) {
        this.data = value;
        this.next = null;
    }
}

class circulertest1 {
    private node2 head;
    private node2 tail;

    public circulertest1() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtEnd(int value) {
        node2 n = new node2(value);

        if (head == null) {
            this.head = n;
            this.tail = n;
            n.next = head;
        } else {
            tail.next = n;
            n.next = head;
            this.tail = n;
        }
    }

    public void printlst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        node2 latest = head;
        do {
            System.out.print(latest.data + " ");
            latest = latest.next;
        } while (latest != head);
        System.out.println();
    }
}

public class circuler_test_ {
    public static void main(String[] args) {
        circulertest1 t = new circulertest1();
        t.insertAtEnd(1);
        t.insertAtEnd(2);
        t.insertAtEnd(3);
        t.printlst();

        t.insertAtEnd(4);
        t.printlst();
    }
}