package chapter_19;

public class Gugudan {
    public static void main(String[] args) {
        // 구구단
        int dan;
        int hang;

        for(dan = 2; dan <= 9; dan++) {
            for(hang = 2; hang <= 9; hang++) {
                int result = dan * hang;
                System.out.printf("%d * %d = %d\n", dan, hang, result);
            }
            System.out.println();
        }
    }
}