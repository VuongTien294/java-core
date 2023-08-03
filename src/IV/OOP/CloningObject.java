package IV.OOP;

public class CloningObject implements Cloneable{
    private int id;
    private String name;

    public CloningObject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //throw ra Exception nếu có lỗi xảy ra
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); //trả về phương thức clone của lớp cha
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        CloningObject cloningObject = new CloningObject(1, "Tiến");
        CloningObject cloningObject2 = (CloningObject) cloningObject.clone();
        System.out.println(cloningObject.id +" "+cloningObject.name);
        System.out.println(cloningObject2.id +" "+cloningObject2.name);
    }

}
