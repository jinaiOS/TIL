package chapter_36;

public class InterfaceTest2 {
    public static void main(String[] args) {
        // Drone
        // <정보> 현재 이 사물은 날고 있습니다.
        // 비행기 ID(AB1233)가 납니다.
        Flyable drone = new Drone();
        Flyable airplane = new Airplane("AB1233");

        drone.fly();
        airplane.fly();

        if (drone instanceof Drone) {
            // <정보> 현재 이 사물은 공중에 있습니다.
            // 이 드론은 사진을 찍고 있습니다.
            Drone drone2 = (Drone) drone;
            drone2.takePicture();
        }
    }
}
