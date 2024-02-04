# Swift 마스터 스쿨 30기 2024.02.04

# 함수와 튜플

- 함수는 원칙적으로 리턴값 하나! 그러나 튜플을 사용하면 묶음 값으로 반환 가능

# Print 함수

```swift
func print(_ items: Any..., separator: String = " ", terminator: String = "\n")

// seprator: 글자를 나누는
// terminator: 글자를 끝내는
```

# API (Application Programming Interface)

- 애플 - print, stride, “ “.count, …
- 서버와 통신 - 오픈 api, …

# Optionals

- nil - 실제 값이 없음은 아님, 값이 없음을 의미하는 키워드
- 옵셔널 타입끼리 연산 불가
- enum으로 되어 있는 것이다! nil과 Int case로 나누어진 것

```swift
var name: String

print(name) // 에러
```

```swift
let num: Int? // 간편 표기
let num: Optional<Int> // 정식 문법
```

## 추출하는 법

### 강제 추출(Forced Unwrapping)

- 값이 있다는 것이 확실할 때

```swift
str!
```

### if 문으로 nil이 아닌 것 확인

```swift
if str != nil {
	print(str!)
}
```

### 옵셔널 바인딩

```swift
if let s = str {
	print(s)
}

guard let s = str else { return }
print(s)
```

### Nil-Coalescing

```swift
var name = name1 ?? "jina"
```

### 접근 연산자 사용 시 → 옵셔널 체이닝

```swift
jina?.name?.age
```

### IUO 타입 (Implicity Unwrapped Optionals)

- 스토리보드와 outlet 연결 시 주로 활용

```swift
var name: String! = "jina"
```

# Collection

## Array

- 순서 o - 중복 값 가능
- 배열에는 동일한 타입의 데이터만 가능

```swift
let empty: [Int] = []
let empty = Array<Int>()
let empty = [Int]()

// (): 함수의 실행 - 생성자라는 함수 실행

array.count
array.isEmpty
array.contains(1)
array.randomElement()
array.sawpAt(0, 1) // 순서 바꿈

array[0] // subscript 문법
array.first // 빈 배열이면 nil
array.last
array.startIndex // 0
array.endIndex // 배열에서 벗어나지 않으려면 endIndex - 1
array[array.startIndex]
array.firstIndex(of: "jina") // 앞에서부터 찾을 때 "jina" 앞에서부터 몇 번째 있는지
```

## Dictionary

- 순서 x
- 키와 값 한 쌍

## Set

- 순서 x
