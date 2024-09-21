# Java 추상화
- 현 상황에서 불필요한 정보들을 없애고, 정말 필요한 특징만 모아 놓는 것
    - 객체, 클래스 모델링
    - 비즈니스 로직 모델링
- 클래스들 공통적인 속성, 행위를 정의하여 코드 중복 줄이고 다형성 실현
    - 추상 클래스
    - 인터페이스

## 추상 클래스

- 실재 하지 않지만, 하위의 공통적인 속성, 행위를 기준으로 정의한 개념

### 특징

- 인스턴스화 불가
- 추상 메소드 구현 의무 부여

```java
public abstract class Animal {
    // 속성
    protected String gender;

    // 행위
    public abstract void eat(String food);

    public abstract void sleep();
}
```

```java
public class Dog extends Animal {

    @Override
    public void eat(String food) {
        System.out.printf("개는 %s 을 단단한 이빨로 물어 먹습니다.\n", food);
    }

    @Override
    public void sleep() {
        System.out.println("개는 잠을 잔다.");
    }
}

```
