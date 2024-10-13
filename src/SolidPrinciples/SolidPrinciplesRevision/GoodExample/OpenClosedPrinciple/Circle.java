package SolidPrinciples.SolidPrinciplesRevision.GoodExample.OpenClosedPrinciple;

public class Circle implements Shape{
    double radius;
    int PI = 22/7;

    public double calculateArea(){
        return 2 * PI * radius;
    }
}
