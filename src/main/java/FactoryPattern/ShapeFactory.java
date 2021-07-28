package FactoryPattern;

public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("круг")) {
            return new Circle();

        } else if (shapeType.equalsIgnoreCase("прямоугольник")) {
            return new Rectangle();

        } else if (shapeType.equalsIgnoreCase("квадрат")) {
            return new Square();
        }
        return null;
    }
}


