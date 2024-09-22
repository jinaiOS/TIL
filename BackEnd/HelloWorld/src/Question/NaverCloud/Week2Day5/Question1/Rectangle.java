package Question.NaverCloud.Week2Day5.Question1;

public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    // 대각선 길이 계산
    public double calculateDiagonal() {
        return Math.sqrt(width * width + height * height);
    }

    @Override
    int getDimension() {
        return 2;
    }

    @Override
    double calculatePerimeter() {
        return 2 * (width + height);
    }

    @Override
    double calculateArea() {
        return width * height;
    }
}
