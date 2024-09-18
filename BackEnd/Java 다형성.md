# Java 다형성
## Java OOP 다형성

- 하나의 타입이나 메소드가 여러 타입이나 메소드들을 가지거나 실행하는 능력

```java
public class AnimalTest {
    public static void main(String[] args) {
        // 동물이 빼빼로 을 먹습니다.
        // 새가 벌레 을 부리로 쪼아 먹고 있습니다.
        // 물고기가 모이 을 주둥이로 먹습니다.
        Animal animal = new Animal();
        Animal animal2 = new Bird();
        Animal animal3 = new Fish();

        feed(animal, "빼빼로");
        feed(animal2, "벌레");
        feed(animal3, "모이");

    }

    public static void feed(Animal animal, String food) {
        animal.eat(food);
    }
}
```

## Java 다운 캐스팅

- 업 캐스팅의 반대작용
- 부모 클래스에서 자식 클래스로 형 변환
    - 단, 인스턴스의 그대로 돌아가야 함
- 인스턴스 확인하는 방법
    - instanceOf → boolean 반환

```java
public class AnimalCasting {
    public static void main(String[] args) {
        // 동물이 잠을 자고 있습니다.
        // 사람이 자고 있습니다.
        // 사람이 자고 있습니다.
        // 물고기가 잠을 자고 있습니다.
        // 새가 잠을 자고 있습니다.
        // 사람이 자고 있습니다.
        // 물고기가 잠을 자고 있습니다.
        // 물고기가 잠을 자고 있습니다.
        // 새가 잠을 자고 있습니다.
        // 동물이 잠을 자고 있습니다.
        // ----------------------------
        // 동물 클래스이거나 지원하지 않는 객체입니다.
        // 사람이 걷고 있습니다.
        // 사람이 걷고 있습니다.
        // 물고기가 수영을 하고 있습니다.
        // 새가 날고 있습니다.
        // 사람이 걷고 있습니다.
        // 물고기가 수영을 하고 있습니다.
        // 물고기가 수영을 하고 있습니다.
        // 새가 날고 있습니다.
        // 동물 클래스이거나 지원하지 않는 객체입니다.
        Animal[] animals = {
                new Animal(), new Person(), new Person(), new Fish(), new Bird(), new Person(), new Fish(), new Fish(), new Bird(), new Animal()
        };

        sleepTogether(animals);

        System.out.println("----------------------------");

        doSomethingSeparately(animals);
    }

    static void sleepTogether(Animal[] animals) {
        for (Animal animal : animals) {
            animal.sleep();
        }
    }

    static void doSomethingSeparately(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal instanceof Bird) {
                Bird bird = (Bird) animal;
                bird.fly();
            } else if (animal instanceof Fish) {
                Fish fish = (Fish) animal;
                fish.swim();
            } else if (animal instanceof Person) {
                Person person = (Person) animal;
                person.walk();
            } else {
                System.out.println("동물 클래스이거나 지원하지 않는 객체입니다.");
            }
        }
    }
}
```

## Java final 키워드

- 변화 제어하기
- 상속, 오버라이딩 막기
