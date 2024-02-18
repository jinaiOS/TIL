# Swift 마스터 스쿨 30기 2024.02.17

# Computed Properties

```swift
var age: Int {
  get {
    return 2021 - birth
  }
  set {
    self.birth = 2021 - newValue
  }
}

age      // get
age = 20 // set
```

- newValue - 문법적 약속
- 읽기만 가능하면 get 생략 가능
- var 로만 선언 가능

# Type Properties

- static, class

```swift
class Person {
  static var name: String = "jina"
  var age: Int

  init(age: Int) {
    self.age = age
  }
}

let person = Person(age: 23)
person.age
Person.name
```

# 저장 타입 속성

- 기본적으로 지연 속성

```swift
class Circle {
  static var count = 0
  var radius: Double

  init(radius: Double) {
    self.radius = radius
    Circle.count += 1
  }
}

var circle = Circle(radius: 2)
Circle.count // 1

var circle1 = Circle(radius: 2)
Circle.count // 2

/// 실제 사용 예시
Int.max // 최고
Int.min // 최소

Double.pi // 파이
```

# 계산 타입 속성

```swift
static var multiPi: Double {
  return pi * 2
}
```

# Property Observer 속성 감시자

- 저장 속성이 변하는 시점을 관찰
- willSet - 메모리 변경 직전
- didSet - 메모리 변경 직후
- 일반적으로 둘 중 하나만 구현
- 저장 속성만 가능하다 생각하면 됨
- 계산 속성 - 상속해서 재정의하는 경우만 가능

```swift
class Profile {
  var name: String = "jina"
  var statusMessage: String = "기본 상태메세지" {
    willSet {
      print("메세지가 \(statusMessage)에서 \(newValue)로 변경될 예정입니다.")
    }
    didSet {
      print("메세지가 \(oldValue)에서 \(statusMessage)로 변경되었습니다.")
    }
  }

  init(message: String) {
    self.statusMessage = message
  }
}

let p = Profile(message: "hi")
// 메세지가 기본 상태메세지에서 hi로 변경될 예정입니다.
// 메세지가 기본 상태메세지에서 hi로 변경되었습니다.
```

# Methods

## Instance Methods

- overloading(오버로딩) 적용(동일한 함수명을 가져도 됨)

### Class

```swift
class Dog {
  var count = 0

  func sit() {
    count += 1
  }
}

let dog = Dog() // Dog 클래스의 인스턴스 생성
dog.sit() // 인스턴스 메소드 호출
```

### struct

- 수정하려면 mutating 키워드를 붙여야 속성 수정이 가능

```swift
struct Dog {
  var count = 0

  mutating func sit() {
    count += 1
  }
}

var dog = Dog() // Dog 구조체의 인스턴스 생성
dog.sit() // 인스턴스 메소드 호출
```

## Type Methods

```swift
class Person {
  static var name: String = "jina"
  var age: Int

  init(age: Int) {
    self.age = age
  }

  static func letmeKnow() {
    print(name)
  }
}

Person.letmeKnow()
```

### 타입 메서드의 상속 - class

- 재정의

```swift
class SomeClass {
  class func someTypeMethod() {
    print("타입과 관련된")
  }
}

SomeClass.someTypeMethod()

class SomeThingClass: SomeClass {
  override class func someTypeMehtod() {
    print("타입과 관련된 함수")
  }
}
```

## Subscripts

- 대괄호를 이용해서 접근가능하도록 하는

```swift
array[0]
dictionary["A"]
```

### 직접 구현

```swift
class SomeData {
  var datas = ["Apple", "Swift"]
  subscript(index: Int) -> String {
    get {
      return datas[index]
    }
    set {
      datas[index] = newValue
    }
  }
}
var data = SomeData()
data[0] // "Apple"
```

```swift
struct TimeTable {
  let multiplier = 3

  subscript(index: Int) -> Int {
    return multiplier * index
  }
}

let timeTable = TimeTable()
timeTable[2]  // 6
timeTable[24] // 72
```

```swift
struct Matrix {
  let data = [["1", "2", "3"], ["4", "5", "6"], ["7", "8", "9"]]

  subscript(row: Int, column: Int) -> String? {
    if row >= 3 || column >= 3 {
      return nil
    }
    return data[row][column]
  }
}

var mat = Matrix()
mat[0, 1]! // "1"
```

## Type Subscripts

```swift
enum Planet: Int {
  case mercury = 1, venus, earth, mars, jupiter, saturn, uranus, neptune
  static subscript(n: Int) -> Planet {
    return Planet(rawValue: n)!
  }
}
let mars = Planet[4]
print(mars) // mars
```

# Int, String = 구조체로 구현됨

# 접근제어 (Access Control)

- private 키워드를 통해 은닉화 할 수 있다
- 코드 감출 수 있음
- 코드 영역을 분리 시켜 효율적 관리 가능
- 컴파일 시간 줄어듬!

# 싱글톤 (Singleton) 패턴

- 유일하게 한 개만 존재하는 객체가 필요한 경우
- lazy 하게 동작

```swift
class Singleton {
  static let shared = Singleton()
}

Singleton.shared
```

```swift
class Singleton {
  static let shared = Singleton()

  private init() { }
}

let object = Singleton() // 불가능 error 뜸
```

```swift
UIScreen.main
UserDefaults.standard
UIApplication.shared
FileManager.default
NotificationCenter.default
```
