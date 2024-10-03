package DecoratorPattern.Beverages;

public class Decaf extends Beverage {
    public Decaf() {
        Description = "De caf Coffee";
    }
    public double cost() {
        return 1.05;
    }
}
