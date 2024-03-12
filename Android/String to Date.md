# String to Date
```kotlin
import java.text.SimpleDateFormat
import java.util.Date

val dateString = "2023-03-10"
val format = SimpleDateFormat("yyyy-MM-dd")
val date: Date? = format.parse(dateString)
println(date)
```

# 두 날짜 비교

```kotlin
import java.text.SimpleDateFormat
import java.util.*

fun main() {
    val dateString = "2023-03-17 15:00:00"
    val format = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    
    // 문자열을 Date 객체로 변환
    val targetDate: Date = format.parse(dateString)
    
    // 현재 날짜와 시간
    val now = Calendar.getInstance()

    // 목표 날짜 설정
    val calendarTarget = Calendar.getInstance()
    calendarTarget.time = targetDate
    
    // 두 날짜 사이의 차이 계산 (밀리초 단위)
    val diff = calendarTarget.timeInMillis - now.timeInMillis
    
    // 밀리초를 일수로 변환 (밀리초 -> 초 -> 분 -> 시간 -> 일)
    val days = diff / (24 * 60 * 60 * 1000)
    
    println("남은 일수: $days 일")
}
```
