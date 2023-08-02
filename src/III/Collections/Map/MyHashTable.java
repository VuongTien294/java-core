package III.Collections.Map;

import java.util.Hashtable;
import java.util.Set;

public class MyHashTable {
    public static void show(Hashtable<Integer, String> hashtable) {
        Set<Integer> keySet = hashtable.keySet();
        for (Integer key : keySet) {
            System.out.println(key + " " + hashtable.get(key));
        }
    }
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();
        // add elements to hashtable
        hashtable.put(10,"HTML");
        hashtable.put(3, "C++");
        hashtable.put(1, "Java");
        hashtable.put(2, "PHP");
        hashtable.put(4, "Python");
        // show hashtable
        show(hashtable);
        // remove element
        hashtable.remove(2);
        // show hashtable after remove
        System.out.println("After remove:");
        // show hashtable
        show(hashtable);
    }


}
