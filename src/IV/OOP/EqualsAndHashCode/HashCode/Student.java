package IV.OOP.EqualsAndHashCode.HashCode;

import java.util.HashSet;
import java.util.Set;

public class Student {
    private String id;
    private String name;
    private String email;
    private int age;

    public Student(String id) {
        this.id = id;
    }

    public Student(String id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String toString() {
        String studentInfo = "Student " + id;
        studentInfo += ": " + name;
        studentInfo += " - " + email;
        studentInfo += " - " + age;
        return studentInfo;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Student) {
            Student another = (Student) obj;
            if (this.id.equals(another.id)) {
                return true;
            }
        }
        return false;
    }

    //Nếu ko ghi đè phương thức hashCode.
    //Tập Set gọi các phương thức equals() và hashCode() trên mỗi đối tượng được thêm vào để đảm bảo không có sự trùng lặp.
    // Trong trường hợp của chúng ta, lớp Student chỉ ghi đè phương thức equals(). Và phương thức hashCode() thừa kế từ lớp
    // Object trả về các địa chỉ bộ nhớ của mỗi đối tượng không nhất quán với phương thức equals(). Do đó, đối tượng Set xử
    // lý đối tượng student1 và student2 thành hai phần tử khác nhau.
    public int hashCode(){
        return id.hashCode();
    }

    public static void main(String[] args) {
        Student student1 = new Student("123", "Cong", "cong@gmail.com", 22);
        Student student2 = new Student("123", "Cong", "cong@gmail.com", 22);
        Student student3 = new Student("456", "Dung", "dung@gmail.com", 18);

        Set<Student> setStudents = new HashSet<Student>();
        setStudents.add(student1);
        setStudents.add(student2);
        setStudents.add(student3);

        // in các phần tử của set ra màn hình
        for (Student student : setStudents) {
            System.out.println(student);
        }
    }
}
