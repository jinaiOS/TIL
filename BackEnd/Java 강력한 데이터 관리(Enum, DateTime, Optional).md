## Java Enum

- 특정 타입이 몇 가지 한정된 값을 가지는 타입 = 열거형 타입
- `SCREAMING_SNAKE_CASE` 사용
- enum의 각각 요소는 독립된 특수한 클래스로 구분되는 인스턴스
- 가독성 향상
    - 표현 직관적
- 안정성 향상
    - 허용 가능한 값 제한 → 유형 안전 제공

```java
// sunday, monday, tuesday, wednesday, thursday, friday, saturday
public enum Day {
    SUNDAY("일요일"),
    MONDAY("월요일"),
    TUESDAY("화요일"),
    WEDNESDAY("수요일"),
    THURSDAY("목요일"),
    FRIDAY("금요일"),
    SATURDAY("토요일");

    private final String koreanName;

    Day(String koreanName) {
        this.koreanName = koreanName;
    }

    public String getKoreanName() {
        return koreanName;
    }
}
```

```java
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
```

```java
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
```

```java
public enum Gender {
    FEMALE("female", "여자"),
    MALE("male", "남자"),
    UNKNOWN("unknown", "미정");

    private String englishTerm;
    private String koreanTerm;

    Gender(String englishTerm, String koreanTerm) {
        this.englishTerm = englishTerm;
        this.koreanTerm = koreanTerm;
    }

    public static Gender valueOfTerm(String str) {
        for(Gender gender: values()) {
            if (str.equals(gender.englishTerm) || str.equals(gender.koreanTerm)) {
                return gender;
            }
        }
        return UNKNOWN;
    }
}
```

## Java Optional

### Java NPE(= Null Point Exception) 처리 어려움

- 참조형은 모두 null로 초기화
- null로 된 값 메소드나 필드 참조 시 NPE 발생
- catch 문 사용자 정의 예외 던짐
- catch 문 기본값 사용

### Java Optional

- null 방지 메소드 지원하는 Wrapper 클래스
- `ElseThrow` 이용하여 사용자 정의 예외 던지기
- `ElseGet` 이용하여 기본값 사용하기

```java
public class OptionalDefaultTest {
    public static void main(String[] args) {
        String str = "abc";
        Optional<String> optionalS = Optional.ofNullable(str);

        int length = optionalS.orElseGet( () -> "" )
                .length();

        System.out.println(length);
    }
}
```

```java
public class OptionalThrowTest {
    public static void main(String[] args) {
        String str = "abcdef";
        Optional<String> stringOptional = Optional.ofNullable("hello");

        int length = stringOptional.orElseThrow(() -> {
            throw new CustomException("CustomException");
        }).length();

        System.out.println(length);
    }
}
```

## Java DateTime

- 기존 방식(= String)의 문제점

### Java 날짜/시간 API (= 라이브러리)

- 가독성, 명확성, 안전성 up
- 현재 날짜/시간 가져오기, 특정 일/월/년 가져오기, 날짜 포맷 변환하기

```java
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
```
