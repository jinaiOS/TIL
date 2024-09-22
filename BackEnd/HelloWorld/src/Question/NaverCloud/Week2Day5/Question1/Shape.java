package Question.NaverCloud.Week2Day5.Question1;

public abstract class Shape {
    String color = "기본색";

    String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract int getDimension();

    abstract double calculatePerimeter();

    abstract double calculateArea();
}
