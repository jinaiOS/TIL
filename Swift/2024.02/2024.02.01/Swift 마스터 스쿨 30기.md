# Swift 마스터 스쿨 30기 2024.02.01

# inout 파라미터

- 함수 내에서 변수를 직접 수정하도록
- 상수, 리터럴 전달 불가
- 파라미터 기본값 선언 불가
- 가변 파라미터 선언 불가

```swift
var num1 = 123
var num2 = 456

func swapNumb(a: inout Int, b: inout Int) {
    a = b // num1 = num2
}

swapNumb(a: &num1, b: &num2)
```
