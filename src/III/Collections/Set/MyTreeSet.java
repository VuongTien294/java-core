package III.Collections.Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(2);
        set.add(1);
        set.add(10);
        set.add(40);

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println((Integer) iterator.next());
        }

        //TreeSet vs Object. So sánh thứ tự tên của Student theo bảng chữ các
        TreeSet<Student> treeSet = new TreeSet<Student>();
        // create students object
        Student student1 = new Student("Cong", 17, "Hanoi");
        Student student2 = new Student("Dung", 16, "Haiphong");
        Student student3 = new Student("Ngon", 18, "Hanoi");
        Student student4 = new Student("Hanh", 19, "Danang");
        Student student5 = new Student("Cong", 20, "Hue");
        // add students object to treeSet
        treeSet.add(student1);
        treeSet.add(student2);
        treeSet.add(student3);
        treeSet.add(student4);
        treeSet.add(student1);
        treeSet.add(student5);
        // show treeSet
        for (Student student : treeSet) {
            System.out.println(student.toString());
        }
    }
}
