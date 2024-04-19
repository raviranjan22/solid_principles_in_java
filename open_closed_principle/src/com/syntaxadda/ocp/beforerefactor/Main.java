package com.syntaxadda.ocp.beforerefactor;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Rectangle(2, 5), new Circle(7)};
        ShapeAreaCalculator totalArea = new ShapeAreaCalculator();
        System.out.println("Total Area = "+totalArea.calculateTotalArea(shapes));
    }
}
