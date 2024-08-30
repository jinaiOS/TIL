package chapter_13;

public class ImplicitCasting2 {
    public static void main(String[] args) {
        // ** 사칙 연산 Casting
        //65.1
        //200
        //3
        int myInt = 10;
        double myDouble = 55.1;
        double result1 = myInt + myDouble;
        System.out.println(result1);

        int myInt2 = 10;
        long myLong = 20L;
        long result2 = myLong * myInt2;
        System.out.println(result2);

        // "/"
        int number1 = 10;
        int number2 = 3;

        int result3 = number1 / number2;
        System.out.println(result3);
    }
}
