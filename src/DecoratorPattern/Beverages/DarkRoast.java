package DecoratorPattern.Beverages;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        Description = "Dark Roast Coffee";
    }
    public double cost() {
        return .99;
    }
}
