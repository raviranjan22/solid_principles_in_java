package com.syntaxadda.ocp.afterrefactor;

// ShapeAreaCalculator class responsible for calculating the total area of shapes
class ShapeAreaCalculator {
    public double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0.0;
        for (Shape shape : shapes) {
            totalArea += shape.area();
        }
        return totalArea;
    }
}
