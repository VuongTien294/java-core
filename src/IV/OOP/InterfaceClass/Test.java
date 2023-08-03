package IV.OOP.InterfaceClass;

//tạo interface có 4 phương thức
interface A {
    void a();
    abstract void b();
    public void c();
    public abstract void d(); //trong interface mặc định là publec vs abstarct rồi nên viết ntn sẽ thành thừa
}

// tạo abstract class cung cấp cài đặt cho một phương thức của interface A
abstract class B implements A {
    public void c() {
        System.out.println("I am c");
    }
    //Nếu 1 class abstarct implement 1 interface thì nó ko cần phải kế thừa 1 hay tất cả các phương thức
}

// tạo subclass của abstract class B, cung cấp cài đặt cho các phương thức còn lại
class M extends B {
    @Override
    public void a() {
        System.out.println("I am a");
    }
    @Override
    public void b() {
        System.out.println("I am b");
    }
    @Override
    public void d() {
        System.out.println("I am d");
    }
    //Nếu 1 class bình thường extends 1 class abstract đã implement 1 interface trước đó.Thì nó sẽ phải override lại các phương thức mà abstract cha chưa định nghĩa
}

class C implements A{
    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

    @Override
    public void d() {

    }
}

public class Test {
    public static void main(String args[]) {
        A a = new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}
