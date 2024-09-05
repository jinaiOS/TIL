# Java 클래스와 객체
## Java 인스턴스 만들기

- 실체 화
- {클래스형}{변수이름} = new {생성자};
- Player player1 = new Player();

```java
public class InstanceTest {
    public static void main(String[] args) {
        // Bob
        // Male
        // School
        Student student1 = new Student();
        student1.name = "Bob";
        student1.gender = "Male";
        student1.schoolName = "School";
        student1.classYear = 1;
        student1.classroomNumber = 3;
        student1.studentNumber = 20;

        System.out.println(student1.name);
        System.out.println(student1.gender);
        System.out.println(student1.schoolName);

        // Alice
        // Female
        // School
        Student student2 = new Student();
        student2.name = "Alice";
        student2.gender = "Female";
        student2.schoolName = "School";
        student2.classYear = 1;
        student2.classroomNumber = 3;
        student2.studentNumber = 15;

        System.out.println(student2.name);
        System.out.println(student2.gender);
        System.out.println(student2.schoolName);

        Student student3 = new Student();
        Student student4 = new Student();

        // Tom
        // Female
        // School
        // Korean
        Teacher teacher = new Teacher();

        teacher.name = "Tom";
        teacher.gender = "Female";
        teacher.schoolName = "School";

        // subject 선행해서 만들어줌
        Subject koreanSubject = new Subject();
        koreanSubject.subjectName = "Korean";
        koreanSubject.subjectCode = "AB001";

        teacher.subject = koreanSubject;
        System.out.println(teacher.name);
        System.out.println(teacher.gender);
        System.out.println(teacher.schoolName);
        System.out.println(teacher.subject.subjectName);
    }
}
```

## 클래스 생성자

### Java 디폴트 생성자

- 클래스 이름 + ()
- 기본적으로 생성
- 모든 변수는 기본값으로 설정

```java
// null
// null
// 0

Student student1 = new Student();
System.out.println(student1.name);
System.out.println(student1.gender);
System.out.println(student1.studentNumber);
```

### Java 생성자 오버로드

- 반복되는 초기화 구문 방지

```java
// 생성자
Student() {

}

public Student(String schoolName, int classYear, int classroomNumber, int studentNumber, String name) {
    this.schoolName = schoolName;
    this.classYear = classYear;
    this.classroomNumber = classroomNumber;
    this.studentNumber = studentNumber;
    this.name = name;
}
```

```java
Student student1 = new Student("happy", 1, 12, 20, "jina");
```

```java
Teacher() {

}

public Teacher(String pName, String pGender, String pSubjectName, String pSubjectCode) {
    name = pName;
    gender = pGender;

    Subject newSubject = new Subject();
    newSubject.subjectName = pSubjectName;
    newSubject.subjectCode = pSubjectCode;

    subject = newSubject;
}
```

```java
Teacher teacher = new Teacher("Tom", "Female", "korean", "AB001");
```

## 실행 클래스

- 메인 메소드가 있는 메소드
- 로직 실행 가능한 실행 클래스

```java
public class ClassroomDay {
    public static void main(String[] args) {
        Student student1 = new Student("school", 1, 2, 3, "jina");
        Student student2 = new Student("school", 1, 3, 8, "Alice");
        Student student3 = new Student("school", 1, 4, 2, "Novah");
        Student student4 = new Student("school", 1, 1, 15, "Brooks");

        Teacher teacher = new Teacher("James", "Female", "Korean", "001");

        String subjectName = "국어";

        // 선생: 저는 jina 학생에게 국어 과목을 가르칩니다.
        // 학생: 저는 James 선생님에게 국어 과목을 배웁니다.
        // 선생: 저는 Alice 학생에게 국어 과목을 가르칩니다.
        // 학생: 저는 James 선생님에게 국어 과목을 배웁니다.
        // 선생: 저는 Novah 학생에게 국어 과목을 가르칩니다.
        // 학생: 저는 James 선생님에게 국어 과목을 배웁니다.
        // 선생: 저는 Brooks 학생에게 국어 과목을 가르칩니다.
        // 학생: 저는 James 선생님에게 국어 과목을 배웁니다.
        teacher.teach(student1, subjectName);
        student1.study(teacher, subjectName);

        teacher.teach(student2, subjectName);
        student2.study(teacher, subjectName);

        teacher.teach(student3, subjectName);
        student3.study(teacher, subjectName);

        teacher.teach(student4, subjectName);
        student4.study(teacher, subjectName);
    }
}
```

## 일반 클래스

- 메인 메소드가 없는 메소드
- 객체가 설계된 일반 클래스
