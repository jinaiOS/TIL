# Swift 마스터 스쿨 30기 2024.01.31

# 함수 사용시 주의점

## 함수 파라미터로 선언하는 값은 let!

- 값 변경 불가

## 함수 내에서 선언한 변수의 Scope(범위)

- 함수 밖에서 변수를 사용할 수 없다!

## return 타입

- 리턴 타입이 없는데 return 사용하면 그냥 함수 벗어남을 의미

## Nested Functiions 함수 중첩 사용

- 함수 안에 함수 작성 가능
- 함수를 제한적으로 사용하고 싶을 때

```swift
func chooseFuction(backward: Bool, value: Int) -> Int {
    func stepForward(input: Int) -> Int {
        return input + 1
    }

    func stepBackward(input: Int) -> Int {
        return input + 1
    }

    if backward {
        return stepBackward(input: 3)
    } else {
        return stepForward(input: value)
    }
}
```

# 함수 표기법(지칭)

- 함수를 변수에 담는 등, 개발자 문서 읽을 때

## 파라미터가 없는 경우

- () 삭제

```swift
doSomething
```

## 아규먼트 레이블이 있는 경우

```swift
numberPrint(n: )
```

## 파라미터가 여러개인 경우, 콤마 없이

```swift
doSomething(back: value:)
```

## 아규먼트 레이블이 생략된 경우

```swift
doSomething(_:)
```

# 함수 타입의 표기

```swift
var func1: (Int) -> () = numberPrint(n: )

var func2: (Int, Int) -> () = addPrint(n: )
```

# 함수의 오버로딩(overloading)

- 같은 이름의 함수에 매개변수(파라미터)를 다르게 선언, 하나의 함수로 여러 개 사용 가능
- ex. print()

```swift
func doSomething(value: Int) { }

func doSomething(value: Double) { }

func doSomething(value: String) { }

doSomething(value: 3)
doSomething(value: 3.5)
doSomething(value: "3")
```

# Scope(범위)

- 함수, if, for문 등에 해당
- 변수는 코드에서 먼저 선언이 되어야 함!
- 하위 스코프는 접근 불가
