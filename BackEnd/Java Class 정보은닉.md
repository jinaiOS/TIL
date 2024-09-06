# Java Class 정보은닉
## 정보 은닉화

- 객체들도 정보 관계가 있다
- public(전체) → protected(자손 클래스) → default(같은 패키지) → private(같은 클래스)

### 필요한 이유

- 코드 보완성 증가
- 코드 유지보수성 증가
- 객체지향 캡슐화 실천

## Java의 접근제어자

```java
public class ClassA {
    // public
    public String publicStr;

    // private
    private String privateStr;

    // default
    String defaultStr;

    public void methodPublic() {}

    private void methodPrivate() {}

    void methodDefault() {}

    void testPrivate() {
        String str = privateStr;
        methodPrivate();
    }
}
```

```java
public class ClassAA {
    void testPublic(ClassA classA) {
        String str = classA.publicStr;
        classA.methodPublic();
    }

    // error
    void testPrivate(ClassA classA) {
        String str = classA.privateStr;
        classA.methodPrivate();
    }

    public void testDefault(ClassA classA) {
        String str = classA.defaultStr;
        classA.methodDefault();
    }
}
```

```java
public class ClassB {
    public void testPublic(ClassA classA) {
        String str = classA.publicStr;
        classA.methodPublic();
    }

    // error
    void testPrivate(ClassA classA) {
        String str = classA.privateStr;
        classA.methodPrivate();
    }

    // error
    public void testDefault(ClassA classA) {
        String str = classA.defaultStr;
        classA.methodDefault();
    }
}
```

## Java의 필드 접근자 메소드

### getter

```java
public class Subject {
    private String subjectName;
    private String subjectCode;

    void setSubjectName(String pSubjectName) {
        subjectName = pSubjectName;
    }

    void setSubjectCode(String pSubjectCode) {
        subjectCode = pSubjectCode;
    }
}
```
