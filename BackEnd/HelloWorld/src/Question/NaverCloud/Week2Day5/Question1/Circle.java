package Question.NaverCloud.Week2Day5.Question1;

public class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateDiameter() {
        double diameter = 2 * radius;
        return diameter;
    }

    @Override
    int getDimension() {
        return 2;
    }

    @Override
    double calculatePerimeter() {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    @Override
    double calculateArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}
