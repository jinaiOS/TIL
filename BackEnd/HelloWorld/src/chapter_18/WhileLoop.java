package chapter_18;

public class WhileLoop {
    public static void main(String[] args) {
        // 1-10 까지 다 더하는 while loop
        // 모든 수를 더한 값은 55 입니다.
        int sum = 0;
        int num = 0;
        int i = 0;

        while (num < 10) {
            num = num + 1;
            sum = sum + num;
        }
        String result = String.format("모든 수를 더한 값은 %d 입니다.", sum);
        System.out.println(result);
    }
}
