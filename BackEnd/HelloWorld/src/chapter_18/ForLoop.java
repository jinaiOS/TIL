package chapter_18;

public class ForLoop {
    public static void main(String[] args) {
        // 1 ~ 10까지 다 더 할건데, for-loop
        // 55
        // 55
        int sum = 0;
        int sum2 = 0;
        int num2 = 0;

        for (int num=1; num<=10; num++) {
            sum += num;
        }

        for (; num2<=10;) {
            sum2 += num2;
            num2++;
        }

        System.out.println(sum);
        System.out.println(sum2);
    }
}
