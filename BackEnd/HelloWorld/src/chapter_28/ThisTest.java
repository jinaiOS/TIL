package chapter_28;

public class ThisTest {
    // Person 인스턴스: name: 강철종, gender: unknown, age: -1
    // Person 인스턴스: name: 이민호, gender: Male, age: -1
    // Person 인스턴스: name: 아이유, gender: Female, age: 30
    // chapter_28.Person@3cbbc1e0
    // chapter_28.Person@35fb3008
    // chapter_28.Person@7225790e
    public static void main(String[] args) {
        Person person1 = new Person("강철종");
        Person person2 = new Person("이민호", "Male");
        Person person3 = new Person("아이유", "Female", 30);

        person1.showMyself();
        person2.showMyself();
        person3.showMyself();

        person1.returnMyself();
        person2.returnMyself();
        person3.returnMyself();

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
