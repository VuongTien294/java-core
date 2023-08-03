package IV.OOP.InterfaceClass;

public class FlyCar implements Plane, Car{
    @Override
    public void runOnStreet() {
        System.out.println("Fly car run on street");
    }

    @Override
    public void fly() {
        System.out.println("Fly car fly in the sky");
    }
}
