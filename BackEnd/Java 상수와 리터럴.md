# Java 상수와 리터럴
## Java 상수

- 상수는 닫힌 상자 - 변할 수 없는 수

### 심볼릭 상수

- final
- 대문자 + “_” 조합 선언

```java
public class SymbolicConstant {
    public static void main(String[] args) {
        // error
        final int MY_INT = 5;
        MY_INT = 3;

        final double MY_DOUBLE;
        MY_DOUBLE = 5.0;
    }
}
```

```java
package mission;

public class ChuncheonTicket3 {
    public static void main(String[] args) {
        /**
         * Q) 서로 다른 3명의 손님이 왔다. 3명은 반값 할인 적용 대상인가? 아닌가?
         * 나이가 65세 이상이고, 국적이 ＂한국”이면 반값으로 줄 예정이다.
         * Alice(나이: 70, 나라: 미국)
         * Kim (나이: 65, 나라: 한국)
         * Yoo (나이: 42, 나라: 한국)
         */
        final int SENIOR_AGE_STANDARD = 65;

        int ageOfAlice = 70;
        String countryOfAlice = "USA";
        Boolean resultOfAlice = ageOfAlice >= SENIOR_AGE_STANDARD && countryOfAlice == "Korea";

        int ageOfKim = 65;
        String countryOfKim = "Korea";
        Boolean resultOfKim = ageOfKim >= SENIOR_AGE_STANDARD && countryOfKim == "Korea";

        int ageOfYoo = 42;
        String countryOfYoo = "Korea";
        Boolean resultOfYoo = ageOfYoo >= SENIOR_AGE_STANDARD && countryOfYoo == "Korea";

        System.out.println("Alice는 적용 대상자인가?");
        System.out.println(resultOfAlice);
        System.out.println("Kim는 적용 대상자인가?");
        System.out.println(resultOfKim);
        System.out.println("Yoo는 적용 대상자인가?");
        System.out.println(resultOfYoo);
    }
}
```

## Java 리터럴(literal)

- 우항의 값 = 데이터 그 자체

### 여러 진수법의 정수 리터럴 표기

- 2진수: 맨 앞에 0b를 붙인다
- 8진수: 맨 앞에 0을 붙인다.
- 16진수: 맨 앞에 0x 또는 0X를 붙인다

### 기타 리터럴 표기

- Double 타입의 10진수 가수 및 진수 표기
    - E와 양수 붙이면 10의 승 곱한다
    - E와 음수 붙이면 10의 승 나눈다
- null 리터럴
    - 아무 것도 참조되지 않았다

```java
package chapter_15;

public class Literal {
    public static void main(String[] args) {
        // 10 - 2진법 (2 + 8)
        int num = 0b1010;
        System.out.println(num);

        // 2752 - 16진법 (12 + 16 + 10 * 16^2)
        int num2 = 0xAC0;
        System.out.println(num2);

        // 522000.0
        double myDouble = 5.22E5;
        System.out.println(myDouble);

        // 0.00255
        double myDouble2 = 2.55E-3;
        System.out.println(myDouble2);

        // null
        String str = null;
        System.out.println(str);
    }
}
```
