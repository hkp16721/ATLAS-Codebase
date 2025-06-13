package DataStructure;
import java.util.ArrayList;
import java.util.Objects;

public class ArrayList01 {
    public static void main(String[] args) {
        Object[] obj = {1,"Hemant","you",'e'};
        for(Object o:obj){
            System.out.println(o);
        }
        ArrayList ar= new ArrayList<>();
        ar.add("Hemant");
        ar.add(2);
        ar.add(new String("Meher"));

        System.out.println((ar.get(1).getClass().getName()));
    }
}
