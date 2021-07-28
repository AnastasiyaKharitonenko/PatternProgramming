package FactoryPattern;

public class FactoryPatternApp {

    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("круг");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("прямоугольник");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("квадрат");
        shape3.draw();

    }
}
