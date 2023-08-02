package III.Collections.Collections;

public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private int age;
    private String address;

    public Student() {
    }

    public Student(int id, String name, int age, String address) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // getter & setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student@id=" + id + ",name=" + name
                + ",age=" + age + ",address=" + address;
    }

    @Override
    public int compareTo(Student student) {
        return this.getId() > student.getId() ? 1 : -1;
    }
}
