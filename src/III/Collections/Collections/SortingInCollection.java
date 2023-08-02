package III.Collections.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingInCollection {
    //Lớp Collections trong java cung cấp các phương thức static để sắp xếp các phần tử của collection.
    // Nếu các phần tử collection thuộc kiểu Set hoặc Map, chúng ta có thể sử dụng TreeSet hoặc TreeMap.
    // Nhưng chúng ta không thể sắp xếp các phần tử của List. Collections cung cấp phương thức sort() để phân sắp xếp các phần tử của List.


    public static void main(String args[]) {
        // create list
        List<String> list = new ArrayList<String>();
        // add elements to list
        list.add("Java");
        list.add("C");
        list.add("C++");
        list.add("PHP");
        list.add("Python");

        //Sắp xếp tăng dần
        // sort list
        Collections.sort(list);
        // show list
        for (String element : list) {
            System.out.println(element);
        }

        //Sắp xếp giảm dần
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); //Nếu đổi thành o1, o2 sẽ trở lại thành tăng dần
            }
        });
        // show list
        for (String element : list) {
            System.out.println(element);
        }


        //Sắp xếp đối tượng
        // create list students
        List<Student> listStudents = new ArrayList<Student>();
        // add students to list
        listStudents.add(new Student(2, "Hoa", 19, "Hanoi"));
        listStudents.add(new Student(1, "Vinh", 19, "Hanoi"));
        listStudents.add(new Student(3, "Phu", 20, "Hanoi"));
        listStudents.add(new Student(4, "Quy", 22, "Hanoi"));
        // sort list student
        Collections.sort(listStudents);
        // show list students
        for (Student student : listStudents) {
            System.out.println(student.toString());
        }

        List<Teacher> teacherList = new ArrayList<Teacher>();
        // add students to list
        teacherList.add(new Teacher(2, "Hoa", 19, "Hanoi"));
        teacherList.add(new Teacher(1, "Vinh", 19, "Hanoi"));
        teacherList.add(new Teacher(3, "Phu", 20, "Hanoi"));
        teacherList.add(new Teacher(4, "Quy", 22, "Hanoi"));
        // sort list student
        Collections.sort(teacherList);
        // show list students
        for (Teacher teacher : teacherList) {
            System.out.println(teacher.toString());
        }
    }
}
