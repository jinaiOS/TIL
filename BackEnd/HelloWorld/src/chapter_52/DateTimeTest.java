package chapter_52;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeTest {
    public static void main(String[] args) {
        // 현재 시간 출력하기
        LocalDateTime now = LocalDateTime.now();
        // 2024-09-29T19:46:31.500002
        System.out.println(now);

        // 특정 일/월/년 가져오기, 요일
        LocalDate past = LocalDate.of(2022, 12, 30);
        // 2022-12-30
        // FRIDAY
        System.out.println(past);
        System.out.println(past.getDayOfWeek());

        // 날짜 포맷 바꾸기
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dateStr = past.format(dateTimeFormatter);

        // 2022-12-30
        // 30/12/2022
        System.out.println(past);
        System.out.println(dateStr);
    }
}
