# Java 문자열
# Java 인코딩/디코딩

## 문자 인코딩/디코딩

- 인코딩: 문자 → 특정 코드 값(= 숫자)
- 디코딩: 특정 코드 값(= 숫자) → 문자

## 문자 부호 체계 (= 문자 세트)

- ASCII(= ANSI): 8Bit, 128개
- Unicode(= UTF): 16Bit
    - 현재는 유니코드 사용
- Java char는 Unicode 기반

# Java String 출력

- 65~90: A~Z
- 96~122: a~z
- String 각 문자 = Unicode 적용

## Java 특수문자 출력

- ￦t: 탭만큼 띄어짐
- ￦n: 줄 바꿈
- ￦’: 작은 따옴표
- ￦”: 큰 따옴표
- ￦￦: 역슬래쉬
- !@#$%^&*(): 기타

```java
package chapter_14;

public class Encoding {
    public static void main(String[] args) {
        // 'Z' -> int
        // Z
        // 90
        char ch1 = 'Z';
        System.out.println(ch1);
        System.out.println((int) ch1);

        // int -> char
        // 참고: 65 ~ 90: A-Z, 96 ~ 122: a~z
        // 66
        // B
        int num = 66;
        System.out.println(num);
        System.out.println((char) num);

        // 대소 비교
        // true
        char smallA = 'a';
        char largeA = 'A';

        boolean result = smallA > largeA;
        System.out.println(result);

        // 가
        char hangul = '\uAC00';
        System.out.println(hangul);

        // 특수 "\t", "\n", "\'"
        //
        //
        //
        // '
        char special1 = '\t';
        System.out.println(special1);

        char special2 = '\n';
        System.out.println(special2);

        char special3 = '\'';
        System.out.println(special3);
    }
}
```

```java
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
```
