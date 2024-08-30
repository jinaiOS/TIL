# Java 반복문
## 반복문 서론 및 while 문

### while 문

- 조건식의 결과가 참인 동안 반복적으로 실행하고자 하는 명령문
- 조건식의 결과를 변경하는 명령문
- 추후 나갈 수 있게 설정해야 한다

```java
public class WhileLoop {
    public static void main(String[] args) {
        // 1-10 까지 다 더하는 while loop
        // 모든 수를 더한 값은 55 입니다.
        int sum = 0;
        int num = 0;

        while (num < 10) {
            num = num + 1;
            sum = sum + num;
        }
        String result = String.format("모든 수를 더한 값은 %d 입니다.", sum);
        System.out.println(result);
    }
}
```

### do-While 문

```java
int sum = 0;
int num = 0;
int i = 0;

do { // 먼저 실행함
    sum = sum + 1;
    i = i + 1;
} while (i < 10);
```

## 반복 대입 | 증감 연산자

### 반복 대입

- += : 기존 변수 값에 값을 더함
- -= : 기존 변수 값에 값을 뺌
- *= : 기존 변수 값에 값을 곱함
- /= : 기존 변수 값에 값을 나눔

### 증감 연산자

- ++피연산자 : 다른 연산을 수행하기 전에 피연산자의 값을 1 증가시킴
- - -피연산자 : 다른 연산을 수행하기 전에 피연산자의 값을 1 감소시킴
- 피연산자++ : 다른 연산을 수행하기 후에 피연산자의 값을 1 증가시킴
- 피연산자- - : 다른 연산을 수행하기 후에 피연산자의 값을 1 감소시킴

```java
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
```

## 반복문 for

```java
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
```
