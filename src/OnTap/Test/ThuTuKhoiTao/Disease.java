package OnTap.Test.ThuTuKhoiTao;

public class Disease {
    {
        System.out.println("A");
    }
    public Disease(){
        System.out.println("B");
    }
}

class Cancer extends Disease{
    static {
        System.out.println("C");
    }
    public Cancer(){
        System.out.println("D");
    }
    {
        System.out.println("E");
    }
    static {
        System.out.println("F");
    }
}

class Fever extends Cancer{
    public static void main(String[] args) {
        System.out.println("G");
        new Fever();
        System.out.println("H");
    }
}

//C,F,G,A,B,E,D,H
//Staic block sẽ được tạo trước
//Sau đó đến G trong main => Fever => H
//Trong Fever thì Thứ tự tạo ra có class cha là Disease => Cancer
//TRong class Disease thì các hàm {} sẽ được tạo trước sau đó mới đến contructor