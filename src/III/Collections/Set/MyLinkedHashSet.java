package III.Collections.Set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class MyLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(2);
        set.add(1);
        set.add(10);
        set.add(40);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println((Integer) iterator.next());
        }
    }
}
