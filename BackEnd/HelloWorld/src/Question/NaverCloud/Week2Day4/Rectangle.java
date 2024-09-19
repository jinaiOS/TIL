package Question.NaverCloud.Week2Day4;

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    public void printRectangleInfo() {
        System.out.println("도형의 색상: " + color);
        System.out.println("도형의 면적: " + getArea());
        System.out.println("사각형의 가로 길이: " + width);
        System.out.println("사각형의 세로 길이: " + height);
    }
}
