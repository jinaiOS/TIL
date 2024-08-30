package chapter_17;

public class StarbucksCoupon {
    public static void main(String[] args) {
        // 스타벅스 쿠폰 이벤트 신청할 수 있게 됐습니다.
        boolean clearCondition1 = true;
        boolean clearCondition2 = true;
        boolean clearCondition3 = true;
        boolean clearCondition4 = true;

        if (clearCondition1 && clearCondition2 && clearCondition3 && clearCondition4) {
            System.out.println("스타벅스 쿠폰 이벤트 신청할 수 있게 됐습니다.");
        } else {
            System.out.println("아니요, 내돈내산 하겠습니다.");
        }
    }
}
