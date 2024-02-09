# Swift 마스터 스쿨 30기 2024.01.29

# 삼항 연산자(Ternary Conditional Operator)

```swift
var name = a > 0 ? "징니" : "낭니"
```

# 범위 연산자

```swift
1...10
```

- 내림차순 형식으로 표기 불가 / 변환은 가능
- 실수 형식의 범위도 가능

## 폐쇄 범위 연산자(Closed Range Operator)

```swift
1...10 // ClosedRange<Int>
1... // PartialRangeFrom<Int>
...10 // PartialRangeThrough<Int>
```

## 반폐쇄 범위 연산자(Half-Open Range Operator)

```swift
1..<10 // Range<Int>
..<10 // PartialRangeUpTo<Int>
```

## 패턴 매칭 연산자

- 범위 연산자와 함께 쓰임!

```swift
a...b ~= age
```

# 반복문

## for문

- 반복 횟수를 미리 알고 있거나 범위 이용

### 와일드 카드 패턴 _ 언더바: 생략

```swift
for _ in 1...10 {

}
```

### 내림차순

```swift
.reversed() // 숫자 뒤집기
```

### 홀수 또는 홀수만 뽑기(stride)

```swift
for numb in stride(from: 1, to: 15, by: 2) {

} 
// 성큼성큼 걷는다! 2씩 고로 이건 홀수 뽑기다 15 포함 x
// to 대신에 through도 쓸 수 있는데 이건 포함!
```

- 중괄호 밖의 값은 접근 가능! ↔ 내부 값은 밖에서 접근 불가

## while문

- 조건에 따라 변할 때

### repeat-While문

```swift
i = 9

while i <= 9 {
	i += 1
} // 9

repeat {
	i += 1
} while i <= 9 // 10 미세한 차이 발생~~
```

## 제어 전송문(Control Transfer Stattement)

### continue

```swift
for num in 1...20 {
	if num % 2 == 0 {
		continue // 지속함
	}
	print(num) // 지속하면 여기 안 탐 1 3 5 7 9 ...
}
```

### break

```swift
for num in 1...20 {
	if num % 2 == 0 {
		break // 하나하고 멈춤
	}
	print(num) // 1
}
```

### Labeled Statements

```swift
OUTER: for num in 1...20 {
	INNER: for num in 1...20 {
		if num % 2 == 0 {
			continue OUTER // outer로!
		}
		print(num) // 1
	}
}
```

# 함수

## 파라미터(매개변수/인자)

- a: Int, b: Int - 함수 정의에 입력값으로 사용되는 변수

## 인수(아규먼트)

- a: 5, a: 7 - 실제 값

## void (비어있는)

```swift
func sayHello() -> Void {

}

func sayHello() -> () {

}

func sayHello() {

}
```
