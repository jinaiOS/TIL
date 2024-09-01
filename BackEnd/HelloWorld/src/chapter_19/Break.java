package chapter_19;

public class Break {
    public static void main(String[] args) {
        // 모든 수를 더한 값은 45
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            if (i == 10) {
                break;
            }
            sum += i;
        }
        System.out.printf("모든 수를 더한 값은 %d", sum);
    }
}
