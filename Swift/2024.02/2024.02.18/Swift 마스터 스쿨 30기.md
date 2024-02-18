# Swift 마스터 스쿨 30기 2024.02.18

# 상속(Inheritance) - Subclassing

- 저장 속성을 추가하거나 메서드를 변형시켜서 사용
- 다중 상속은 지원하지 않음
- 클래스만 지원
- final 상속 금지 키워드
- override 재정의 키워드(저장 속성은 재정의 불가)

```swift
class Person { // Base class, Parent class, Super class
    var id = 0
    var name = "jina"
    var email = "abc@gmail.com"
}

class Student: Person { // Child class, Sub class
    var studentId = 0
}

class Undergraduate: Student {
    var major = "회계"
}

var person = Undergraduate()
person.studentId   // Student 클래스의 속성에 접근
person.id          // Person 클래스의 속성에 접근
```

## UIKit 상속 구조

- 굉장히 많은 상속 구조로 이루어짐

## 재정의(Overriding)

- overloading: 함수에서 하나의 이름에 여러 함수 대응
- overriding: 재정의

```swift
class Aclass {
    func doSomething() {
        print("Do Something")
    }
}

class Bclass: Aclass {
    override func doSomething() {
        super.doSomething() // 상위 클래스의 함수 호출
        print("Do Something. Do another job")
    }
}
```

### 속성의 재정의

1. 저장 속성의 재정의
    1. 원칙적으로 안 됨
    2. 계산 속성으로 재정의 가능 - 기능 축소 불가
    3. 속성 감시자를 추가 가능
2. 계산 속성의 재정의
    1. 기능 축소 불가
    2. 읽기 전용
        1. 읽기/쓰기 전용으로 재정의 가능
        2. 속성 감시자 추가 불가
    3. 읽기/쓰기 전용
        1. 읽기만 가능한 속성으로 재정의 불가
        2. 속성 감시자 추가 가능

```swift
class Vehicle {
    var currentSpeed = 0.0

    var halfSpeed: Double {
        get {
            return currentSpeed / 2
        }
        set {
            currentSpeed = newValue * 2
        }
    }
}

class Bicycle: Vehicle {
    var hasBasket = false
1.
    override var currentSpeed: Double {
        get {
            return super.currentSpeed
        }
        set {
            super.currentSpeed = newValue
        }
    }
2.
    override var currentSpeed: Double {
        willSet {
            print("값이 \\(currentSpeed)에서 \\(newValue)로 변경 예정")
        }
        didSet {
            print("값이 \\(oldValue)에서 \\(currentSpeed)로 변경 예정")
        }
    }
3.
    override var halfSpeed: Double {
        get {
            return super.currentSpeed / 2
        }
        set {
            super.currentSpeed = newValue * 2
        }
    }
4.
    override var halfSpeed: Double {
        willSet {
            print("값이 \\(halfSpeed)에서 \\(newValue)로 변경 예정")
        }
        didSet {
            print("값이 \\(oldValue)에서 \\(halfSpeed)로 변경 예정")
        }
    }
}

```

### 메서드의 재정의

```swift
class Bicycle: Vehicle {
    // 1. super.makeNoise()를 호출한 후 추가적인 행동을 정의
    override func makeNoise() {
        super.makeNoise()
        print("자전거가 지나간다고 소리친다.")
    }

    // 2. 추가적인 행동을 정의한 후 super.makeNoise()를 호출
    override func makeNoise() {
        print("자전거가 지나간다고 소리친다.")
        super.makeNoise()
    }

    // 3. 부모 클래스의 메소드를 오버라이드하지만, super.makeNoise() 호출 없이 새로운 동작만 정의
    override func makeNoise() {
        print("자전거가 지나간다고 소리친다.")
    }

    // 4. 서브스크립트 오버라이드
    override subscript(index: Int) -> String {
        get {
            if index > 4 {
                return "777"
            }
            return super[index]
        }
        set {
            super[index] = newValue
        }
    }
}
```
