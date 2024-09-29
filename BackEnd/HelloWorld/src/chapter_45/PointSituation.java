package chapter_45;

public class PointSituation {
    public static void main(String[] args) {
        Point<Integer, Integer> point1 = new Point(1, 2);
        Point<Integer, Double> point2 = new Point(2, 3.44);
        Point<Double, Double> point3 = new Point(1.5, 2.33);

        System.out.println(point1.calculateDistance());
        System.out.println(point2.calculateDistance());
        System.out.println(point3.calculateDistance());

//        Point<String, Integer> point4 = new Point("Cat", 5);
//
//        // null
//        System.out.println(point4.calculateDistance());
    }
}
