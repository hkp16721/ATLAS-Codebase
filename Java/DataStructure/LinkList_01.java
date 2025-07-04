package DataStructure;
import java.util.LinkedList;
public class LinkList_01 {
    private LinkedList<Integer> mainIntList;
    LinkList_01(){
        mainIntList = new LinkedList<>();
    }
    void insertItem(int val){
        mainIntList.add(val);
    }
    void updateItem(int index, int val){
        mainIntList.add(index, val);
    }
    void removeItem(String status, int value){
        if(status.equals("First")){
            mainIntList.removeFirst();
            System.out.println("Number First Eliminated");
        }
        if(status.equals("Last")){
            mainIntList.removeLast();
            System.out.println("Number last eliminated");
        }
        if(status.equals("Index")){
            mainIntList.remove(value);
            System.out.printf("Player at index %d is eliminated",value);
            System.out.println();
        }
        if(status.equals("Value")){
            mainIntList.remove(Integer.valueOf(value));
        }
    }
    int getItem(String location, int index){
        return switch (location) {
            case "First" -> mainIntList.getFirst();
            case "Last" -> mainIntList.getLast();
            case "Index" -> mainIntList.get(index);
            default -> 0;
        };
    }
    int getSize(){
        return mainIntList.size();
    }
    void display(){
        for(int i:mainIntList){
            System.out.print(i+" ");
        }
    }
    Object[] convertArray(){
        return mainIntList.toArray();
    }

    public static void main(String[] args) {
        LinkList_01 list = new LinkList_01();
        for(int i=0;i<10;i++){
            list.insertItem(i);
        }
        System.out.println("First item : " + list.getItem("First",1));
        list.removeItem("Index",2);
        System.out.println("Size of team is  : " + list.getSize());
        list.updateItem(4,6);
        list.display();

    }

}
