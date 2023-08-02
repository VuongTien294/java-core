package III.Collections.Set;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MyHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(20);
        set.add(3);
        set.add(4);
        set.add(1);
        set.add(10);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println((Integer) iterator.next());
        }
    }

}
