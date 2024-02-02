# Swift 마스터 스쿨 30기 2024.01.30

# Parameters / Argument

## Argument Label

```swift
func printName(first name: String) {
	print(name)
}

printName(first: "")
```

- 함수를 사용할 때 더 명확하게 요구하는 지 알려줄 수 있음!

## 와일드 카드 패턴

```swift
func addPrintFunc(_ firstNum: Int)
```

- 명확할 때!

## 가변파라미터 Variadic Parameters

```swift
func arithmeticAverage(_ numbers: Double...)
```

- 하나의 파라미터에 2개 이상의 아규먼트 전달 가능!

## 기본값(default) 정하는 것 가능

```swift
func numFunction(num1: Int = 5)
```

- 아규먼트값이 항상 필요한 것이 아닐 수 있음!
