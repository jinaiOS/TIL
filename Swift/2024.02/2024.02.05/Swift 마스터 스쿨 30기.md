# Swift 마스터 스쿨 30기 2024.02.05

# 배열

## 삽입

```swift
a.insert("H", at: 0)
a.insert(contentsOf: ["a", "b"], at: 0)
```

## 교체

```swift
a[0...2] = ["a", "b", "c"]
a[0...1] = []
a.replaceSubrange(0...2, with: ["a", "b", "c"])
```

## 추가

```swift
a += ["a"]
a.append("a")
a.append(contentsOf: ["a", "b"])
```

## 삭제

```swift
a.removeFirst() // 맨 앞에 요소 삭제
a.removeFirst(2)

a.removeLast() // 맨 뒤에 요소 삭제
a.removeLast(2)

a.removeAll() // 배열 요소 모두 삭제
a.removeAll(keepingCapacity: true) // 안의 데이터만 삭제 - 저장공간은 보관
```

## 정렬

```swift
a.sort() // 배열을 직접 정렬 - 오름차순, 리턴x
a.sorted() // 오름차순

a.reverse() // 배열을 직접 정렬 - 내림차순, 리턴x
a.reversed() // 내림차순

a.sorted().reversed()

a.shuffle() // 랜덤으로 직접 바꿈
a.shuffled() // 랜덤 섞음
```

## enumerated

- 번호표가 붙은 named 튜플 형태로 한 개씩 전달

# Dictionary

- 키 값 중복 x 밸류 중복 o
- 동일한 타입 데이터만 담을 수 있음
- 키 값은 hashable 해야 함
    - 고정된 길이의 값이면서 유일한 값
    - input으로 쓰일 수 있어야 함
    - 검색 속도가 중요한 경우 사용

## 빈 값

```swift
let empty = [:]
let empty = Dictionary<Int, String>()
let empty = [Int: String]()
```

## 기능

```swift
a.count
a.isEmpty
a.randomElement() // named tuple 리턴
```

```swift
dic = ["a":"apple", "b":"banana"]

dic["a"] // String?

if let a = dic["a"] { } // 옵셔널 바인딩

dic.keys
dic.values
dic["c"] = "circle" // 동일한 키 없으면 추가

dic.updateValue("City", forKey: "C") // 새로운 요소가 추가되면 nil
dic = ["a", "a"] // 전체 교체

dic["a"] = nil // 삭제
dic.removeValue(forKey: "a") // 삭제된 값 리턴

dic.removeAll()
dic.removeAll(keepingCapacity: true)
```

## 비교

- 순서 상관 없음

# Set

- 배열과 구분 위해 반드시 타입 선언 해야 함
- Hashable - 중복 x
    - 검색 속도가 중요한 경우 사용
- 집합의 개념을 이용할 경우 사용

```swift
var set: Set = [1, 2, 3, 4]
```

## 빈 Set

```swift
let empty: Set<Int> = []
let empty = Set<Int>()
```

## 기능

```swift
set.count
set.isEmpty
set.contains(1)
set.randomElement()
```

## 업데이트

```swift
set.update(with: 1) // 요소 추가

set.remove("a") // 삭제한 요소 리턴
set.removeAll()
set.removeAll(keepingCapacity: true)
```

## 집합

```swift
/// 부분 집합
b.isSubset(of: a) // true 부분
b.isStrictSubset(of: a) // false 진부분

/// 상위 집합
a.isSuperset(of: b) // true 상위
a,isStrictSuperset(of: b) // false 상위

/// 서로소 여부
b.isDisjoint(with: a)

/// 합집합
a.union(b)
a.formUnion(b) // 원래 set 변경

/// 교집합
a.intersection(b)
a.formIntersection(b)

/// 차집합
a.subtracting(b)
a.formSubtracting(b)

/// 대칭차집합
a.symmetricDifference(b)
a.formSymmetricDifference(b)
```

# Enum

- 한정된 사례(case)

```swift
enum Weekday {
	case monday
	case tuesday
	case wednesday
	case thursday
	case friday
	case saturday
	case sunday
}

enum CompassPoint {
	case north, south, east, west
}
```
