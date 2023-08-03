package IV.OOP.AbstractClass;

public class Main {
    public static void main(String[] args) {
        MotoBike bike = new Honda();
        bike.start();

        MotoBike bike1 = new Suzuki();
        bike1.start();

    }
}
