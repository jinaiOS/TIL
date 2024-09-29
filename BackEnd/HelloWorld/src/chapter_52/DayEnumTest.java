package chapter_52;

import java.util.Arrays;

public class DayEnumTest {
    public static void main(String[] args) {
        // 각각 enum 값 정의
        // ordinal, compareTo, values
        Day monday = Day.MONDAY;
        Day sunday = Day.SUNDAY;
        Day thursday = Day.THURSDAY;

        // 1
        // 0
        // 4
        System.out.println(monday.ordinal());
        System.out.println(sunday.ordinal());
        System.out.println(thursday.ordinal());

        // 1
        // -3
        System.out.println(monday.compareTo(sunday));
        System.out.println(monday.compareTo(thursday));

        // [SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY]
        Day[] days = Day.values();
        System.out.println(Arrays.toString(days));
    }
}
