package IV.OOP.InterfaceClass;

public class Main {
    public static void main(String[] args) {
        FlyCar flyCar = new FlyCar();
        flyCar.runOnStreet();
        flyCar.fly();

        Car car = new FlyCar();
        car.runOnStreet();
    }
}
