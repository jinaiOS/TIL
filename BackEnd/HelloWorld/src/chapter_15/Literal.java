package chapter_15;

public class Literal {
    public static void main(String[] args) {
        // 10 - 2진법 (2 + 8)
        int num = 0b1010;
        System.out.println(num);

        // 2752 - 16진법 (12 + 16 + 10 * 16^2)
        int num2 = 0xAC0;
        System.out.println(num2);

        // 522000.0
        double myDouble = 5.22E5;
        System.out.println(myDouble);

        // 0.00255
        double myDouble2 = 2.55E-3;
        System.out.println(myDouble2);

        // null
        String str = null;
        System.out.println(str);
    }
}
