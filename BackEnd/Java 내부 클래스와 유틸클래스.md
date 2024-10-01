# Java 내부 클래스와 유틸클래스
## 기존 Java 클래스 아쉬운 점

- 클래스 이용하려면, 매번 인스턴스화 → Java static 적극 활용
- 여러 클래스/메소드 유사한 걸 표시하려면 상속 → 내부 클래스 문법 활용(일반 중첩 클래스, 정적 중첩 클래스)
- 클래스 한 번만 이용할 건데, 새로 클래스 정의 → 내부 클래스 문법 활용(지역 중첩 클래스, 익명 중첩 클래스)

## Java 유틸클래스 만들기

- 간단하고, 재사용 가능한 메서드 제공하는 정적인 클래스
- 불필요하게 인스턴스화 불필요
    - Math, Arrays

```java
public class StringUtils {
    public static boolean isEmpty(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    public static class CharChecker {
        public static int countChar(String str, char targetChar) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == targetChar) {
                    count++;
                }
            }
            return count;
        }

        public static boolean containsChar(String str, char targetChar) {
            return countChar(str, targetChar) >= 1;
        }
    }
}
```

```java
public class StringUtilTest {
    public static void main(String[] args) {
        String str = "Hello, World!";
        char target = 'o';

        // 1. 문자열이 비어 있는지 확인
        boolean isEmpty = StringUtils.isEmpty(str);
        System.out.println(isEmpty);

        // 2. 문자열을 반대로 뒤집기
        String str2 = StringUtils.reverse(str);
        System.out.println(str2);

        // 3. 주어진 문자열에서 특정 문자의 개수 세기
        int CountChar = StringUtils.CharChecker.countChar(str, target);
        System.out.println(CountChar);

        // 4. 주어진 문자열에 특정 문자가 있는지 확인
        boolean containChar = StringUtils.CharChecker.containsChar(str, target);
        System.out.println(containChar);
    }
}
```

## Java 내부 클래스 사용하기

- static 여부 & 선언된 위치로 나누어짐

### 일반 중첩클래스(Inner Class)

- Outer 인스턴스화 필요
- 외부 클래스 인스턴스와 연관

```java
public class OuterClass {
    private int outerData;

    public OuterClass(int outerData) {
        this.outerData = outerData;
    }

    public class InnerClass {
        private int InnerData;

        public InnerClass(int innerData) {
            InnerData = innerData;
        }

        void display() {
            System.out.println(outerData);
            System.out.println(InnerData);
        }
    }
}
```

### 정적 중첩클래스(static nested class)

- static
- 외부 클래스 인스턴스와 독립적

```java
public class OuterStaticClass {
    private static int outerData;

    public OuterStaticClass(int outerData) {
//        this.outerData = outerData;
    }

    public static class InnerClass {
        private int innerData;

        public InnerClass(int innerData) {
            this.innerData = innerData;
        }

        void display() {
            System.out.println(outerData);
            System.out.println(innerData);
        }
    }
}
```

### 지역 중첩클래스(= local class)

- 메서드 내부 접근 가능, 여러 번 인스턴스화 가능

```java
public class LocalTest {
    public static void main(String[] args) {
        class LocalWalk implements Walkable {

            @Override
            public void walk() {
                System.out.println("walk");
            }
        }

        LocalWalk localWalk = new LocalWalk();
        localWalk.walk();
    }
}
```

### 익명 중첩클래스

- 한 번만 인스턴스화 가능
- 이후 배울 람다식의 근간

```java
public class LocalTest {
    public static void main(String[] args) {
        int i = 100;

        // 익명 클래스
        Walkable anonymousWalk = new Walkable() {
            @Override
            public void walk() {
                System.out.println("i: " + i);
                System.out.println("anonymous walk");
            }
        };

        anonymousWalk.walk();
    }
}
```
