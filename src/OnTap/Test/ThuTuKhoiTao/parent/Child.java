package OnTap.Test.ThuTuKhoiTao.parent;

import static OnTap.Test.ThuTuKhoiTao.parent.Mother.verify;

public class Child {
    static {
        System.out.print("4");
    }

    String c = verify("0");

    static String cstatic = verify("9");

    Child() {
        super();
        System.out.print("3");
    }
}
