# Java static과 변수 유효범위
## static 이란

- 클래스의 멤버가 인스턴스에 속하지 않고 클래스 자체에 속함을 의미
- 클래스의 모든 인스턴스가 공유하며, 특정 인스턴스에 종속x
- 하나의 인스턴스에서 값을 변경하면, 다른 모든 인스턴스에서도 변경된 값

## static 변수 / 메소드

= 정적 변수

### static 의미

- 프로그램 실행 시, 정적 생성(인스턴스 생성 전 정의 되어 있음)

### static 변수 = 클래스 변수

- 클래스로 바로 호출 가능

### static 메소드

- getter 필요

```java
 // 정적 메소드
public static int getSerialNum() {
    return serialNum;
}

public static void setSerialNum(int num) {
    serialNum = num;
}
```

## 변수 유효범위

### Java 변수 종류

- 클래스(static) 변수
    - static int number
    - 함수가 호출될 때 생성되고 함수가 끝나면 소멸됨
- 인스턴스(멤버) 변수
    - private int number
    - 인스턴스가 생성될 때 힙에 생성되고, 가비지 컬렉터가 메모리를 수거할 때 소멸
- 로컬(지역) 변수
    - String number
    - 함수가 호출될 때 생성되고 함수가 끝나면 소멸
