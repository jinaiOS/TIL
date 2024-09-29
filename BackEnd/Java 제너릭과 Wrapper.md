# Java 제너릭과 Wrapper
## Wrapper

- 기본 데이터 타입(primitive type)을 객체로 감싸는 클래스
- null 선언 가능

```java
public class WrapperClassTest {
    public static void main(String[] args) {
        // Integer
        Integer integer1 = new Integer(20); // int -> Integer boxing
        Integer integer2 = new Integer(30);

        int int1 = integer1.intValue(); // unboxing, Integer -> int

        Integer integer3 = 20; // AutoBoxing, new Integer(20);
        int int2 = integer3; // AutoUnboxing

        System.out.println(integer1);
        System.out.println(int1);
        System.out.println(integer3);
        System.out.println(int2);

        // 연산자
        System.out.println(integer1 + integer2);
        System.out.println(integer1 + int1);

        // Character
        Character character = new Character('X'); // X charType -> character boxing
        char ch1 = character.charValue(); // Character -> char unboxing

        Character character1 = 'x';
        char ch2 = character1;

        System.out.println(character);
        System.out.println(ch1);

        Character[] characters = {'a', 'b', 'c'};
        char[] chars = {'a', 'b', 'c'};

        String str = String.valueOf(characters);
        String str2 = String.valueOf(chars);

        // [Ljava.lang.Character;@3cb5cdba
        // abc
        System.out.println(str);
        System.out.println(str2);

        // Boolean Type
        Boolean boolean1 = new Boolean(true); // true boolean -> Boolean
        boolean b1 = boolean1.booleanValue(); // unboxing

        Boolean boolean2 = false;
        boolean b2 = boolean2;

        System.out.println(boolean1 & boolean2);
        System.out.println(boolean1 | boolean2);

        if (b1) {

        }
        if (boolean1) {
            
        }
    }
}
```

### 존재하는 이유

- 객체지향 프로그래밍 실현 & 자료구조 일관성 유지
- Java 라이브러리 사용 지원
- Generic 프로그래밍 지원

## Generic

- 안전하게 같은 코드를 여러 참조형에 사용하여 코드 재사용성 올리는 프로그램 기법
- 타입: 타입을 파라미터로 가지는 클래스와 인터페이스를 말함
- 클래스 또는 인터페이스 이름 뒤에 “<>” 부호가 붙고 사이에 타입 파라미터 위치
- `Java Static` 은 적용x
    - Static: 클래스 로드 시점
    - Generic: 인스턴스 생성 시점
- 두 개 이상도 가능

```java
public class GeneralPrint<T> {
    private T material;

    public void printMyInfo() {
        System.out.println(material + "를 출력합니다.");
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    public T getMaterial() {
        return material;
    }
}
```

```java
public class PrintSituation {

    public static void main(String[] args) {
        // 1. 기획: String을 출력하는 프린터 만들어주세요~
        GeneralPrint<String> print = new GeneralPrint<String>();
        print.setMaterial("설계도");

        String material = print.getMaterial();
        print.printMyInfo();

        // 2. 기획: Integer을 출력하는 프린터 만들어주세요~
        GeneralPrint<Integer> print2 = new GeneralPrint<Integer>();
        print2.setMaterial(1235);

        Integer intMaterial = print2.getMaterial();
        print2.printMyInfo();

        // 3. 기획: Boolean을 출력하는 프린터 만들어주세요~
        GeneralPrint<Boolean> print3 = new GeneralPrint<Boolean>();
        print3.setMaterial(true);

        Boolean booleanMaterial = print3.getMaterial();
        print3.printMyInfo();

        GeneralPrint print4 = new GeneralPrint();
        print4.setMaterial("설계도");

        String material4 = (String) print.getMaterial();
        print4.printMyInfo();
    }
}
```

### 자료형 제한하기

- extends 로 타입을 좁히자

```java
public class Point<T extends Number, V extends Number> {
    private T x;
    private V y;

    public Point(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }

    public Double calculateDistance() {
        // (x**2 + y**2) ^ 1/2
        Double num1 = this.x.doubleValue();
        Double num2 = this.y.doubleValue();

        return Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2));
    }
}
```
