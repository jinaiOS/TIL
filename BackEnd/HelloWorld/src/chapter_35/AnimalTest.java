package chapter_35;

public class AnimalTest {
    public static void main(String[] args) {
        // 동물이 빼빼로 을 먹습니다.
        // 새가 벌레 을 부리로 쪼아 먹고 있습니다.
        // 물고기가 모이 을 주둥이로 먹습니다.
//        Animal animal = new Animal();
        Animal animal2 = new Bird();
        Animal animal3 = new Fish();
        Animal animal4 = new Person();
        Animal animal5 = new Dog();

        feed(animal2, "벌레");
        feed(animal3, "모이");
        feed(animal4, "김밥");
        feed(animal5, "고기");

    }

    public static void feed(Animal animal, String food) {
        animal.eat(food);
    }
}
