package FactoryPattern;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new ShapeFactory().getShape("Circle");
        shape1.draw();
        Shape shape2 = new ShapeFactory().getShape("Rectangle");
        shape2.draw();
    }
}
