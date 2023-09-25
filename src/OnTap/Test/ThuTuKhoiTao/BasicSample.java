package OnTap.Test.ThuTuKhoiTao;

public class BasicSample {
}

class ComplexSample{
    BasicSample createSample(){
        BasicSample bs = new BasicSample();
        return bs;
    }

    public static void main(String[] args) {
        ComplexSample cs = new ComplexSample();
        BasicSample bs = cs.createSample();
        System.out.println(bs);
        bs = new BasicSample();
        System.out.println(bs);
        System.out.println("End");
    }
}