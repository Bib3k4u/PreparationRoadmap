package DecoratorPattern.Beverages;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        Description = "House Blend Coffee";
    }
    public double cost() {
        return .89;
    }
}
