# Java 메소드
## Java의 함수(메소드)란?

- 여러 명령어의 집합
- 어떤 입력 값에 대해 결과값이 나오는 믹서기
- 코드 재사용성 용이

### Java 함수 용어 사전

- 함수의 입력값
    - = 파라미터, 함수 인수, 함수 매개변수, 함수 아규먼트 (= Argument)
- 함수의 출력값
    - = 반환 값, 리턴 값, 결과값, 함수가 돌려주는 값
- 함수 = 메소드 포함하는 개념
    - java의 경우 모든 함수가 메소드
    - javascript, python은 아님

## 여러 Java 메소드 만들기

```java
public class Scores {
    public static void main(String[] args) {
        // A class 학생들 점수
        int studentAClass1 = 50;
        int studentAClass2 = 30;
        int studentAClass3 = 45;

        // B class 학생들 점수
        int studentBClass1 = 60;
        int studentBClass2 = 65;
        int studentBClass3 = 66;

        // Average
        double averageAClass = calculateAverage(studentAClass1, studentAClass2, studentAClass3);

        // B class
        double averageBClass = calculateAverage(studentBClass1, studentBClass2, studentBClass3);

        // A 학급의 평균 점수는 41.67, B 학급의 평균 점수는 63.67
        System.out.printf("A 학급의 평균 점수는 %.2f, B 학급의 평균 점수는 %.2f", averageAClass, averageBClass);
    }

    static double calculateAverage(int studentScore1, int studentScore2, int studentScore3) {
        int sumClass = studentScore1 + studentScore2 + studentScore3;
        return sumClass / (double) 3;
    }
}
```

### 리턴 값 없을 때 void

```java
public class MethodExamples {
    // 일반적인 입력값, 출력값도 있는 경우
    // 둘 다 하나인 경우
    static int toUnicode(char ch) {
        return (int) ch;
    }

    static int sumAndMultiplyFour(int a, int b) {
        return (a + b) / 4;
    }

    public static void main(String[] args) {
        // 65
        char ch = 'A';
        int decode = toUnicode(ch);
        System.out.println(decode);

        // 3
        int myInt1 = 10;
        int myInt2 = 5;
        int result = sumAndMultiplyFour(myInt1, myInt2);
        System.out.println(result);

        // Hello
        String res = sayHello();
        System.out.println(res);

        // 함수 안에서 실행합니다. printHello
        printHello("printHello");
        
        // Hi
        printHi();
    }

    // 인자값이 없을 수 있다, 출력값은 있음
    static String sayHello() {
        return "Hello";
    }

    // 인자값이 있는데, 출력값은 없음
    static void printHello(String str) {
        System.out.printf("함수 안에서 실행합니다. %s\n", str);
    }

    // 인자값도 없고, 출력값도 없음
    static void printHi() {
        System.out.println("Hi");
    }
}
```
