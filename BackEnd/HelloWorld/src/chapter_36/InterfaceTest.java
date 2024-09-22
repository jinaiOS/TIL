package chapter_36;

public class InterfaceTest {
    public static void main(String[] args) {
        // 476
        System.out.println(Flyable.atmosphereLimit);

        // Flyable
        Flyable bird = new Bird();
        Flyable airplane = new Airplane("ABB");

        // 새가 날고 있습니다.
        // 비행기 ID(ABB)가 납니다.
        bird.fly();
        airplane.fly();

        // Walkable
        Walkable person = new Person();
        Person person2 = new Person();
        person2.setName("아이유");

        Walkable robot = new Robot("RB1233");

        // 사람이 걷고 있습니다.
        // 로봇ID RB1233가 걷고 있습니다.
        person.walk();
        robot.walk();

        if (robot instanceof Robot) {
            // 로봇이 인간 아이유을 돕습니다.
            Robot robot2 = (Robot) robot;
            robot2.helpPerson(person2);
        }
    }
}
