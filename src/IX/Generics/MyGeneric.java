package IX.Generics;

public class MyGeneric<T> {
    T obj;

    void add(T obj){
        this.obj = obj;
    }

    T get(){
        return obj;
    }

    public static void main(String[] args) {
        MyGeneric<Integer> m1 = new MyGeneric<Integer>();
        m1.add(2);
        System.out.println(m1.get());

        // use String
        MyGeneric<String> m2 = new MyGeneric<String>();
        m2.add("Hello");
        System.out.println(m2.get());
    }
}
