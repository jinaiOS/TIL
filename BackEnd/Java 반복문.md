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

## 이중 반복문

```java
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
```

```java
public class starTriangle {
    public static void main(String[] args) {
        // *
        // **
        // ***
        // ****
        // *****
        // ******
        // *******
        // ********
        // *********
        int row;
        int column;

        for(row = 1; row <= 9; row++) {
            for(column = 1; column <= row; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```

## 반복문 제어

### continue

```java
public class OddNumberTotal {
    public static void main(String[] args) {
        // 0~100까지 홀수를 더한 값은 2500
        int total = 0;

        for(int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
            total += i;
        }
        System.out.printf("0~100까지 홀수를 더한 값은 %d", total);
    }
}
```

```java
public class ThreeSixNineGame {
    public static void main(String[] args) {
        // 1,2,짝,4,5,짝,7,8,짝,10,11,짝,13,14,짝,16,17,짝,19,20,짝,22,23,짝,25,26,짝,28,29,짝,
        for (int num = 1; num <= 30; num++) {
            if (num % 3 == 0) {
                System.out.print("짝,");
                continue;
            }
            System.out.printf("%d,", num);
        }
    }
}
```

### break

```java
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
```

```java
public class EndlessLoop {
    public static void main(String[] args) {
        // tip: 분 단위로 하면 계산할 예정.
        // 아 공부하기 싫다, 30분 부터 해야지.
        // 미친 08분이네
        // 아.. 공부하기 싫다 30분부터 해야지
        // 헐 34분이잖아
        // 그럼 그냥 정각되면 해야겠다.
        // 지금 시간은 9 정각이네!
        // 미친 08분이네
        // 아.. 공부하기 싫다 30분부터 해야지
        // 헐 34분이잖아
        // 그럼 그냥 정각되면 해야겠다.
        // 지금 시간은 10 정각이네!
        final int WAKE_UP_TIME = 8 * 60;
        final int END_DAY = 24 * 60;

        int now = WAKE_UP_TIME;

        System.out.println("아 공부하기 싫다, 30분 부터 해야지.");
        while (now < END_DAY) {
            now ++;
            int hour = now / 60;

            if (now % 60 == 0) {
                System.out.printf("지금 시간은 %d 정각이네!\n", hour);
            }
            if (hour == 10) {
                break;
            }
            if (now % 60 == 34) {
                System.out.println("헐 34분이잖아");
                System.out.println("그럼 그냥 정각되면 해야겠다.");
            }
            if (now % 60 == 8) {
                System.out.println("미친 08분이네");
                System.out.println("아.. 공부하기 싫다 30분부터 해야지");
            }
        }
    }
}
```
