package DataStructure;

import java.util.*;
public class collection19 {
    public static void main(String[] args) {
        List a1 = new ArrayList();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(5);
        System.out.println(a1);

        List l2 = new LinkedList();
        l2.add("hemant");
        l2.add("hemt");
        l2.add("hemt");
        l2.add("hema");
        l2.add("mant");
        System.out.println(l2);

        Set l3 = new HashSet();
        l3.add(1);
        l3.add(13);
        l3.add(16);
        l3.add(13);
        System.out.println(l3);

        Map m1 = new HashMap();
        m1.put("hem",8);
        m1.put("hema",34);
        m1.put("hemn",45);
        m1.put("hemt",55);
        System.out.println(m1);
        System.out.println(m1.get("hem"));
    }

}
