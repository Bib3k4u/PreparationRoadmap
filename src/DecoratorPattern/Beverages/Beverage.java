package DecoratorPattern.Beverages;

public abstract class Beverage {
    String Description = "Unknown Beverage";

    public String getDescription(){
        return Description;
    }
    public abstract double cost();
}
