package DecoratorPatternRevision;

public class Main {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println();

        Car luxurySportCar = new SportsCar(new LuxuryCar(new BasicCar()));
        luxurySportCar.assemble();


    }
}
