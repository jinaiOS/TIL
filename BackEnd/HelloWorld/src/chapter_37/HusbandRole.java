package chapter_37;

public interface HusbandRole {
    void takeCareWife(Wife wife);

    String getName();

    default void sayLoveEveryDay() {
        System.out.println("우리 가족 사랑합니다~");
    }
}
