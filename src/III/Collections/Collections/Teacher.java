package III.Collections.Collections;

public class Teacher implements Comparable<Teacher>{
    private int id;
    private String name;
    private int age;
    private String address;

    public Teacher() {
    }

    public Teacher(int id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

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
        return "Teacher@id=" + id + ",name=" + name
                + ",age=" + age + ",address=" + address;
    }

    @Override
    public int compareTo(Teacher teacher) {
        return this.getName().compareTo(teacher.getName());
    }
}
