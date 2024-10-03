package DecoratorPattern.Beverages;

public class Espresso extends Beverage {
    public Espresso() {
        Description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
