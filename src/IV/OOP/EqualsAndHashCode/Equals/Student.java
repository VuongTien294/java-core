package IV.OOP.EqualsAndHashCode.Equals;

import java.util.Arrays;
import java.util.List;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        String studentInfo = "Student " + id;
        studentInfo += ": " + name;
        return studentInfo;
    }

    //Khi ta muốn so sánh 2 object giống nhau khi tất cả các trường của nó giống nhau
    public boolean equals(Object obj){
        if(obj instanceof Student){
            Student castStudent = (Student) obj;
            if(this.id == castStudent.id && this.name.equals(castStudent.name)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "Tiến");
        Student student2 = new Student(2, "Huyền");
        Student student3 = new Student(1, "Tiến");

        System.out.println(student1.equals(student3));
        System.out.println(student1.equals(student2));


        List<Student> list = Arrays.asList(student1, student2, student3);
        Student student4 = new Student(1, "Tiến");
        System.out.println(list.contains(student4));
    }
}
