# Java 자기 자신을 가르키는 “this”
## Java this 사용법

### this 인스턴스 클래스 멤버 지칭할 수 있다

- 주의
    - 클래스 자체 멤버 값x
    - 인스턴스의 멤버 값o

```java
public class BirthDay {
    //
    private int year;
    private int month;
    private int day;
    
    public void setYear(int year) {
        this.year = year;
    }
    
    private void printHi() {
        System.out.println("Hi");
    }
    
    BirthDay(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.printHi();
    }
}
```

### this로 다른 생성자를 지정할 수 있다.

- 기본값을 주는 방식으로 사용
- 바로 하위의 생성자일 필요는 없다.

```java
public class Person {
    //
    private String name;
    private String gender;
    private int age;

    public void showMyself() {
        System.out.printf("Person 인스턴스: name: %s, gender: %s, age: %d\n", name, gender, age);
    }

    public Person(String name) {
        this(name, "unknown");
    }

    public Person(String name, String gender) {
        this(name, gender, -1);
    }

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
```

```java
public class ThisTest {
    // Person 인스턴스: name: 강철종, gender: unknown, age: -1
    // Person 인스턴스: name: 이민호, gender: Male, age: -1
    // Person 인스턴스: name: 아이유, gender: Female, age: 30
    public static void main(String[] args) {
        Person person1 = new Person("강철종");
        Person person2 = new Person("이민호", "Male");
        Person person3 = new Person("아이유", "Female", 30);

        person1.showMyself();
        person2.showMyself();
        person3.showMyself();
    }
}
```

### this는 인스턴스 자신의 생성주소 알려줌

- Heap의 메모리 주소값

```java
public Person returnMyself() {
    return this;
}

// chapter_28.Person@3cbbc1e0
// chapter_28.Person@35fb3008
// chapter_28.Person@7225790e
```
