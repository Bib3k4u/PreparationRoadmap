package DecoratorPattern.Condiment;

import DecoratorPattern.Beverages.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;
    public abstract String getDescription();
}
