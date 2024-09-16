# Java 객체의 상속
## 객체의 상속이란

- `자식 특성은 부모 특성 물려받는다
- 자식 행위는 부모 행위를 물려받는다
- 코드 재사용성 up, 유지 보수성 up

## protected, 메소드 오버 라이딩

- 부모 클래스의 기존 행위를 수정하고 싶을 때

```java
@Override
void eat(String food) {
    System.out.printf("나, 물고기는 %s를 아주 열심히 먹고 있습니다.\n", food);
}
```

```java
public class SeaSituation {
    // 독성여부: true
    // 나, 물고기는 새우를 먹고 있습니다.
    // 나, 물고기는 새우를 아주 열심히 먹고 있습니다.
    public static void main(String[] args) {
        Fish fish1 = new Fish();
        fish1.setSex("Male");
        fish1.setLeavingSea("동해");
        fish1.setHavingPoison(false);

        FishChild fish2 = new FishChild();
        fish2.setSex("Female");
        fish2.setLeavingSea("서해");
        fish2.setHavingPoison(false);

        fish2.becomeDanger();
        System.out.println("독성여부: " + fish2.isHavingPoison());

        fish1.eat("새우");
        fish2.eat("새우");
    }
}
```

## Java super 사용법

### 부모 클래스를 가리키는 예약어: super

- base class ← derived class
- superclass ← subclass
- parent class ← child class
- 부모 생성자 호출

```java
Fish() {
    System.out.println("부모 물고기가 만들어지고 있습니다.");
}

public Fish(String sex, boolean havingPoison, String startSpawningDate, String endSpawningDate, String leavingSea) {
    this.sex = sex;
    this.havingPoison = havingPoison;
    this.startSpawningDate = startSpawningDate;
    this.endSpawningDate = endSpawningDate;
    this.leavingSea = leavingSea;
}
```

```java
FishChild() {
    super(); // 부모 물고기가 만들어지고 있습니다.
    System.out.println("자식 물고기가 생성되고 있습니다.");
}

FishChild(String sex, boolean eatable, String leavingSea) {
    super(sex, false, "2022", "2022", leavingSea);
    this.eatable = eatable;
}
```

- 자식 필드로 인해 shadowing 주의

## Java 묵시적 형 변화

- 작은 타입은 큰 타입으로 묵시적 변환 가능
- 업 캐스팅

```java
// 타입선언: 부모, 인스턴스화: 자식
// 타입선언: 부모, 인스턴스화: 부모
// 타입선언: 자식, 인스턴스화: 자식
// 타입선언: 자식, 인스턴스화: 부모 => 묵시적 변환 x
Fish fish1 = new Fish();
fish1.eat("새우");

Fish fish2 = new FishChild();
fish2.eat("새우");

FishChild fish3 = new FishChild();
fish3.eat("새우");

//        FishChild fish4 = new Fish();
//        fish4.eat("새우");
```
