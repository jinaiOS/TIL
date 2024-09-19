package Question.NaverCloud.Week2Day4;

class Circle extends Shape {
    private static final double PI = 3.14;
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    public void printCircleInfo() {
        System.out.println("도형의 색상: " + color);
        System.out.println("도형의 면적: " + getArea());
        System.out.println("원의 반지름: " + radius);
    }
}
