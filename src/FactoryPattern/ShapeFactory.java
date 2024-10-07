package FactoryPattern;

import java.util.Objects;

//Creating a Factory class to generate objects of concrete classes based on the provided input
public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(Objects.equals(shapeType, "Circle")){
            return new Circle();
        }
        if(Objects.equals(shapeType, "Rectangle")){
            return new Rectangle();
        }
        return null;
    }
}
