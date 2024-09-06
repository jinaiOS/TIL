package chapter_28;

public class Person {
    //
    private String name;
    private String gender;
    private int age;

    public void showMyself() {
        System.out.printf("Person 인스턴스: name: %s, gender: %s, age: %d\n", name, gender, age);
    }

    public Person(String name) {
        this(name, "unknown");
    }

    public Person(String name, String gender) {
        this(name, gender, -1);
    }

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //
    public Person returnMyself() {
        return this;
    }
}
