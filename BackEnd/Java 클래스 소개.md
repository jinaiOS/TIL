# Java 클래스 소개
## 클래스 소개

```java
public class Fish {
    // 속성
    String sex; // "Male", "Female"
    boolean havingPoison; // true 독이 있고, false 독이 없고,
    String startSpawningDate; // 산란 시작 시간
    String endSpawningDate; // 산란 종료 시간
    String leavingSea; // 사는 속성

    // 행위
    void eat(String food) {
        System.out.printf("나, 물고기는 %s를 먹고 있습니다.\n", food);
    }
    void swim(int meter) {
        System.out.println("나는 헤엄칩니다 미터: " + meter);
    }
    void makeCrowd(Fish otherfish) {
        System.out.println("나는 다른 물고기와 무리짓습니다.");
    }
    void sleep() {}
}
```

## 이름 짓기 규약

```java
int HelloMyWorld; // 파스칼 케이스
int helloMyWorld; // 카멜 케이스
int hello_my_world; // 스네이크 케이스
int HELLO_MY_WORLD; // 스크리밍 케이스
int hello-my-world; // 케밥 케이스 (java 안 됨)
```

- 파스칼 케이스: 클래스 이름
- 카멜 케이스: 인스턴스 변수, 메서드 이름
- 스크리밍 케이스: 상수 이름

## 클래스로 교실 구현하기

```java
public class Subject {
    String subjectName;
    String subjectCode;
}
```

```java
public class Student {
    // 속성
    String schoolName;
    int classYear; // 몇 학년
    int classroomNumber; // 몇 반
    int studentNumber; // 몇 번

    // 기본 정보
    String name;
    String gender;

    // 행위
    void study(Teacher teacher, String subjectName) {
        String teacherName = teacher.name;
        System.out.printf("학생: 저는 %s 선생님에게 %s 과목을 배웁니다.", teacherName, subjectName);
    }
}
```

```java
public class Teacher {
    // 학교 정보
    String schoolName;

    // 과목
    Subject subject;

    // 기본 정보
    String name;
    String gender;

    // 행위
    void teach(Student student, String subjectName) {
        String studentName = student.name;
        System.out.printf("선생: 저는 %s 학생에게 %s 과목을 가르칩니다.", studentName, subjectName);
    }
}
```
