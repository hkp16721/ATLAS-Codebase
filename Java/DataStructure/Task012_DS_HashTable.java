package DataStructure;
import java.sql.Struct;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Task012_DS_HashTable{
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<>(); //won't accept null in both key and value
        ht.put("Anitha", 101);
        ht.put("Kavitha", 102);
        ht.put("Meera", 102);
        ht.put("Anitha",102);
//        ht.put(null,102);
//        ht.put("Anitha",null);
        // use  get method of Ht
        for (Map.Entry<String, Integer> e : ht.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
        System.out.println("\n-----------------Without Sync-----------------------\n");
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Anitha", 101);
        hm.put("Kavitha", 102);
        hm.put("Meera", null);
        hm.put("Anitha1",null);
        hm.put(null,201);
        hm.put(null,206);
        for (Map.Entry<String, Integer> e : hm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
        System.out.println("\n-----------------With Sync-----------------------\n");
        Map<String, Integer> hm1 = Collections.synchronizedMap(new HashMap<>());
        hm1.put("Anitha", 101);
        hm1.put("Kavitha", 102);
        hm1.put("Meera", null);
        hm1.put("Anitha1",null);
        hm1.put(null,201);
        hm1.put(null,206);
        for (Map.Entry<String, Integer> e : hm1.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        //-----------------------Hashmap with fixed capacity--------------------------//
        HashMap<String, Integer> newMap = new HashMap<>(10);
        newMap.put("hemant",1);
        newMap.put("Sumant",3);
        newMap.put("Anshul",14);
        newMap.put("Vijay",23);
        for(Map.Entry<String, Integer> e:newMap.entrySet()) {
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
}

