package OnTap.Test.ThuTuKhoiTao.parent;

public class Mother {
    String p = verify("4");
    static String pstatic = verify("3");

    static {
        System.out.print("8");
    }

    static String verify(String s) {
        System.out.print(s);
        return s;
    }

    Mother() {
        System.out.print("3");
    }
}
