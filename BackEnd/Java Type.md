# Java Type
# 컴퓨터가 보는 Java 타입

- 변수 사이즈 정하기 (= 박스 사이즈 정하기)
- RAM에 변수 저장
- RAM에 0과 1로 저장
- RAM 내부: Data = 0 | 1
- 8Bit = 1Byte
- RAM 시각에서 short myShort 선언하면 8Bit 두 줄을 사용한다
- 2진법으로 정수 나타낼 수 있는 정수범위 2의 7승 앞에는 부호임
- -128~+127

# Java 타입 별 범위

```java
package chapter_13;

public class IntegerRange {
    public static void main(String[] args) {
        // Byte 범위: -128 ~ 127
        // Short 범위: -32768 ~ 32767
        byte myByte = 120;
        short myShort = 23312;
        long myLong = 12232323344340L;
        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myLong);
    }
}
```

```java
package chapter_13;

public class FloatRange {
    public static void main(String[] args) {
        float myFloat = 1231232.2132f;
        double myDouble = 123123123123123123123123212.21232134134132d;
        System.out.println(myFloat);
        System.out.println(myDouble);
    }
}
```

# Java 타입 변환

- 자동 현 변환이 가능한 방향
    - 정수형 데이터 타입: byte → short → int → long
    - 실수형 데이터 타입: float → double
- 덜 정밀한 자료형 → 더 정밀한 자료형
- 작은 바이트 크기 → 큰 바이트 크기

## 묵시적 형 변환

```java
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
```

```java
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
```

## 명시적 형 변환 (= 강제 캐스팅)

- 자료 손실 주의! - 값을 버리고 옴

```java
package chapter_13;

public class ExplicitCasting {
    public static void main(String[] args) {
        // 더 정밀한 타입 -> 덜 정밀한 타입
        // 5
        float myFloat = 5.55f;
        int myInt = (int) myFloat;
        System.out.println(myInt);

        // Size 큰 -> Size 작은
        // 88
        int myInt2 = 600;
        byte myByte = (byte) myInt2;
        System.out.println(myByte);

        // 연산 "+"
        // 9
        // 8
        double myDouble = 5.5;
        double myDouble2 = 3.7;

        int result = (int) (myDouble + myDouble2);
        int result2 = (int) myDouble + (int) myDouble2;
        System.out.println(result);
        System.out.println(result2);
    }
}
```
