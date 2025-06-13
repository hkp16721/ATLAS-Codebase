package DataStructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.lang.Integer;

public class collection18 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        for(int i=0; i<10;i++){
            myList.add(i);
        }
        Iterator<Integer> it = myList.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println("values:" + i);

        }
        myList.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        });
    }
}
