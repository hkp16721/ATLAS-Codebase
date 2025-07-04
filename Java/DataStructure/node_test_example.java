package DataStructure;

class node{
    int data;
    node next;

    node(int value){
        this.data = value;
        this.next = null;
    }
}
class linkliststest{
    private node head;
    public linkliststest(){
        this.head = null;
    }
    public void  insertAtEnd(int value){
        node n = new node(value);
        if(head == null){
            this.head = n;
        }
        else{
            node tmp = head;
            while(tmp.next!=null){
                tmp =tmp.next;
            }
            tmp.next = n;
        }
    }
    public void printlst(){
        node latest = head;
        while(latest!=null){
            System.out.print(latest.data + " ");
            latest = latest.next;
        }
    }
}

public class node_test_example {
    public static void main(String[] args) {
        linkliststest lt = new linkliststest();
        lt.insertAtEnd(10);
        lt.insertAtEnd(20);
        lt.insertAtEnd(30);
        lt.insertAtEnd(40);
        lt.printlst();
    }
}
