# Java 예외 처리
## Java 오류와 예외

### 오류와 예외 차이

- Error: 통제 불가능
    - 실행 컴퓨터 자체 문제(cpu, memory 등)
    - JVM 기인한 문제(Stack Overflow Error, Virtual Machine Error, Out of Memory Error)
- Exception: 통제 가능(= 예외 처리)
    - Check Exception: 무조건 처리 해야하는 예외
    - Uncheck Exception: 무조건 처리하지 않아도 되는 예외

## Java try-catch문 다루기

- try: 로직 진행
- catch: 예외 발생 시 진행
- 예외 발생 시, stackTrace 출력 가능

```java
public class TryCatchTest1 {
    public static void main(String[] args) {
        System.out.println("메인 메소드 실행합니다.");

        try {
            int i = 0;
            int data = 50 / i;
            System.out.println("data: " + data);
        } catch (ArithmeticException e) {
            System.out.println("0으로는 나눌 수가 없습니다.");
            System.out.println("data: " + 0);
            e.printStackTrace();
        }

        System.out.println("메인 메소드 종료합니다.");
    }
}
```

```java
public class TryCatchTest2 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");
        stringList.add("Python");
        stringList.add(null);
        stringList.add("C++");

        // HELLO
        // WORLD
        // JAVA
        // PYTHON
        // NullPointerException
        // C++
        // IndexOutOfBoundsException
        for (int i = 0; i < stringList.size() + 5; i++) {
            try {
                String str = stringList.get(i);
                System.out.println(str.toUpperCase());
            } catch (NullPointerException e) {
                System.out.println("NullPointerException");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("IndexOutOfBoundsException");
                break;
            }
        }
    }
}
```

```java
public class TryCatchTest3 {
    public static void main(String[] args) {
        try {
            FileInputStream fs = new FileInputStream("src/chapter_50/test.txt");
            int i;
            while((i=fs.read()) !=-1) {
                System.out.write(i);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
```

- 상위 클래스 Exception 사용
    - catch 순서에 따라 결과가 다를 수 있음

### try-catch-finally

- finally는 어떤 상황이든 종료될 때 거침
- 리소스 해제
- autocloseable 인터페이스 지원하면 자동으로 됨
    - try () 안에 동작

## throw로 예외처리 미루기

- main 메소드 미루기 → 예외처리 x
- 직접 던지기
    - 함수 리턴 값과 상관없음
    - if 문과 함께 쓰임
    - 예외 미루기와 함께 쓰임

## 사용자 정의 예외 처리하기

- RuntimeException 상속
- 생성자로 message를 재정의

```java
public class PositiveNumberException extends RuntimeException {
    public PositiveNumberException(String message) {
        super(message);
    }
}
```

```java
public class PTMember {
    private String ID;
    private String name;
    private Integer heigth;
    private Integer weight;
    private String gender;

    public PTMember(String name, Integer heigth, Integer weight, String gender) {
        if (heigth <= 0) throw new PositiveNumberException("키는 0 이하일 수 없습니다.");
        if (weight <= 0) throw new PositiveNumberException("몸무게는 0 이하일 수 없습니다.");
        this.name = name;
        this.heigth = heigth;
        this.weight = weight;
        this.gender = gender;
    }

    public void setID(String ID) {
        if (ID == null) throw new IDFormatException("ID는 null이 될 수 없습니다.");
        if (ID.length() < 8 && ID.length() > 20) throw new IDFormatException("ID는 8자 이하 및 20자 이상이 될 수 없습니다.");
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "PTMember{" +
                "ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                ", heigth=" + heigth +
                ", weight=" + weight +
                ", gender='" + gender + '\'' +
                '}';
    }
}
```

```java
public class PTMemberTest {
    public static void main(String[] args) {
        PTMember member = new PTMember("민철", 170, 70, "Male");

        member.setID(null);
        // Exception in thread "main" chapter_51.exceptions.PositiveNumberException: 키는 0 이하일 수 없습니다.
        // Exception in thread "main" chapter_51.exceptions.IDFormatException: ID는 null이 될 수 없습니다.
        System.out.println(member);
    }
}
```
