package chapter_18;

public class Operator {
    public static void main(String[] args) {
        // +=, *=
        // 50
        int myInt = 5;
        myInt *= 10;
        System.out.println(myInt);

        // 단항 연산자 ++
        // 10
        // 9
        int myInt2 = 10;
        System.out.println(myInt2--);
        System.out.println(myInt2);
    }
}
