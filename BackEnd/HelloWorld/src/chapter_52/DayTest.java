package chapter_52;

public class DayTest {
    public static void main(String[] args) {
        Day monday = Day.MONDAY;

        // MONDAY
        // 월요일
        System.out.println(monday);
        System.out.println(monday.getKoreanName());

        Day day = Day.SATURDAY;
        switch (day) {
            case MONDAY:
                System.out.println("한 주의 시작입니다. " + day.getKoreanName());
                break;
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println("오늘은 평일입니다. " + day.getKoreanName());
                break;
            case FRIDAY:
                System.out.println("오늘만 지나면 주말입니다. " + day.getKoreanName());
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("오늘은 주말입니다. " + day.getKoreanName());
                break;
        }
    }
}
