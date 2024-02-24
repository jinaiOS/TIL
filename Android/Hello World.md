# Hello World
```kotlin
fun main() {
    println("Hello World")
}
```

- fun: 함수 선언
- main function은 프로그램 시작할 때 함수
- 함수의 본문은 중괄호 안에
- println(): 주어진 문자열을 출력하고, 그 다음에 줄바꿈 문자
- print(): 함수는 주어진 문자열을 출력하지만, 줄바꿈을 추가x

## Variables

```kotlin
val popcorn = 5 // read-only
var customers = 10 // mutable variables

customers = 8
println(customers)
```

## **String templates**

```kotlin
val customers = 10

println("There are $customers customers")
println("There are ${customers + 1}")
```
