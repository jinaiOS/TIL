package chapter_51;

public class TryCatchFinallyTest {
    public static void main(String[] args) {
        System.out.println("메인 메소드가 실행됩니다.");

        try {
            Integer myInt = 10;
            Integer data = 100 / myInt;

            System.out.println(data);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("무조건 실행되는 영역");
        }

        System.out.println("메인 메소드가 종료됩니다.");
    }
}
