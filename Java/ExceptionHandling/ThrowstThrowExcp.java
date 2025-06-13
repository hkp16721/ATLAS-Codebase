package ExceptionHandling;
import java.util.Scanner;

class NameNotInList extends Exception{
    public NameNotInList(String message){
        super(message);
    }
}

public class ThrowstThrowExcp {
    static  void name(String name) throws NameNotInList{
        String[] nameList = {"Hemant","Sumit","Meher","Sarabjit"};
        boolean found=false;
        for(String nam:nameList){
            if(nam.equals(name)){
                found=true;
                System.out.println("You are already registered");
                break;
            }
        }
        if(!found){
            throw new NameNotInList("You are not registered");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String you = sc.nextLine();
        try{
            name(you);
        }
        catch (NameNotInList e){
            System.out.println(e.getMessage());
        }
    }
}
