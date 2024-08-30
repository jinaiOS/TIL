package chapter_13;

public class ExplicitCasting {
    public static void main(String[] args) {
        // 더 정밀한 타입 -> 덜 정밀한 타입
        // 5
        float myFloat = 5.55f;
        int myInt = (int) myFloat;
        System.out.println(myInt);

        // Size 큰 -> Size 작은
        // 88
        int myInt2 = 600;
        byte myByte = (byte) myInt2;
        System.out.println(myByte);

        // 연산 "+"
        // 9
        // 8
        double myDouble = 5.5;
        double myDouble2 = 3.7;

        int result = (int) (myDouble + myDouble2);
        int result2 = (int) myDouble + (int) myDouble2;
        System.out.println(result);
        System.out.println(result2);
    }
}
