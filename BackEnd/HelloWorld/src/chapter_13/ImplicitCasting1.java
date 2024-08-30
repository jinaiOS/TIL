package chapter_13;

public class ImplicitCasting1 {
    public static void main(String[] args) {
        // 덜 정밀한 자료형 -> 더 정밀한 자료형
        int myInt = 5;
        float myFloat = myInt;
        System.out.println(myFloat);

        // 사이즈가 작은 type -> 사이즈가 더 큰 type
        int myInt2 = 10;
        long myLong = myInt2;
        System.out.println(myLong);
    }
}
