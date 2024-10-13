package SolidPrinciples.SolidPrinciplesRevision.GoodExample.OpenClosedPrinciple;

public class Rectangle implements Shape {
    private double length;
    private double breadth;

    @Override
    public double calculateArea() {
        return length* breadth;
    }
}
