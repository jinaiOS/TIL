package chapter_18;

public class ForLoop {
    public static void main(String[] args) {
        int age = 20;
        String result;

        if (age > 18) {
            result = "청소년 관람불가";
        } else if (age > 14) {
            result = "15세 이상 관람가";
        } else if (age > 11) {
            result = "12세 이상 관람가";
        } else if (age > -1) {
            result = "전체 관람가";
        } else {
            result = "유아 관람불가";
        }

        System.out.println(result);
    }
}
