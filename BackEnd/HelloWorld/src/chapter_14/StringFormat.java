package chapter_14;

public class StringFormat {
    public static void main(String[] args) {
        // String
        // Happy
        // 123
        String str1 = "Happy";
        String str2 = String.valueOf(123);

        System.out.println(str1);
        System.out.println(str2);

        // String 1
        // 문자 서식: Happy, HAPPY
        // 대문자로 변환
        String result;

        result = String.format("문자 서식: %s, %S", str1, str1);
        System.out.println(result);

        // Int
        // 정수 서식: 00010
        // 다섯 자리수로 변환
        int myInt = 10;
        result = String.format("정수 서식: %05d", myInt);

        System.out.println(result);

        // Float
        // 실수 서식: 12.545454, 12.5, 12.55, 12.545
        // 소숫 자리 변환 - 반올림
        float myFloat = 12.545454f;
        result = String.format("실수 서식: %f, %.1f, %.2f, %.3f", myFloat, myFloat, myFloat, myFloat);

        System.out.println(result);
    }
}
