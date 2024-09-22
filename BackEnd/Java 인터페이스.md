# Java 인터페이스
- 인간이나, 사물, 시스템 간에 커뮤니케이션이 가능하도록 설계한 상호 작용 방식

## 유저 인터페이스(= UI)

- 유저 ↔ 사물, 시스템
- GUI(= graphical User Interface), Application

## 시스템 인터페이스

- 사물, 시스템 ↔ 사물, 시스템
- API(= application Programming Interface), Java 프로그래밍 인터페이스

## Java OOP에서의 인터페이스

- 자바 객체간 커뮤니케이션이 가능하도록 기능 구현을 설계(= 메소드)하는 추상화 문법
- `interface` 인스턴스 선언
- `implements` 인스턴스 구현
- 변수는 자동으로 `static final`
- 함수는 자동으로 `public abstract`
- 메소드 구현의무 부여

```java
public interface Flyable {
    // 속성
    long atmosphereLimit = 476; // 대기권

    void fly();
}
```

```java
public interface Walkable {
    void walk();
}
```

```java
public class InterfaceTest {
    public static void main(String[] args) {
        // 476
        System.out.println(Flyable.atmosphereLimit);

        // Flyable
        Flyable bird = new Bird();
        Flyable airplane = new Airplane("ABB");

        // 새가 날고 있습니다.
        // 비행기 ID(ABB)가 납니다.
        bird.fly();
        airplane.fly();

        // Walkable
        Walkable person = new Person();
        Person person2 = new Person();
        person2.setName("아이유");

        Walkable robot = new Robot("RB1233");

        // 사람이 걷고 있습니다.
        // 로봇ID RB1233가 걷고 있습니다.
        person.walk();
        robot.walk();

        if (robot instanceof Robot) {
            // 로봇이 인간 아이유을 돕습니다.
            Robot robot2 = (Robot) robot;
            robot2.helpPerson(person2);
        }
    }
}
```

### 인터페이스 디폴트 메소드

- 메소드 구현 의무 x

### 인터페이스 정적 메소드

- 인터페이스 static 메소드
- 인터페이스.메소드로 사용

```java
public interface Flyable {
    // 속성
    long atmosphereLimit = 476; // 대기권

    default void fly() {
        System.out.println("<정보> 현재 이 사물은 날고 있습니다.");
    }

    static void printLanding() {
        System.out.println("<정보> 현재 이 사물은 공중에 있습니다.");
    }
}
```

```java
public class Drone implements Flyable {
    // 속성
    private String droneID;
    private long remainingFuelAmount;
    private long remainingFileStorage;

    public void takePicture() {
        Flyable.printLanding();
        System.out.println("이 드론은 사진을 찍고 있습니다.");
    }
}
```

```java
public class InterfaceTest2 {
    public static void main(String[] args) {
        // Drone
        // <정보> 현재 이 사물은 날고 있습니다.
        // 비행기 ID(AB1233)가 납니다.
        Flyable drone = new Drone();
        Flyable airplane = new Airplane("AB1233");

        drone.fly();
        airplane.fly();

        if (drone instanceof Drone) {
            // <정보> 현재 이 사물은 공중에 있습니다.
            // 이 드론은 사진을 찍고 있습니다.
            Drone drone2 = (Drone) drone;
            drone2.takePicture();
        }
    }
}
```

# 인터페이스, 추상클래스 정리

- Interface
    - 특정 역할, 직업
    - ~ 할 수 있는, ~하는
- Abstract class
    - 상위 분류 개념
    - ~에 속하는, ~ 상위 개념인
