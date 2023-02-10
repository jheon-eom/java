package effective.ch02.item01;

public class Shape {

    private double width;
    private double height;

    // Private constructor to prevent direct instantiation of the Shape class
    private Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Static factory method to create a Shape object
    public static Shape createRectangle(double width, double height) {
        return new Shape(width, height);
    }

    // Static factory method to create a square Shape object
    public static Shape createSquare(double side) {
        return new Shape(side, side);
    }

    // Getters for the width and height
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }

}
