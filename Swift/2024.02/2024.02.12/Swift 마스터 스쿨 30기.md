# Swift 마스터 스쿨 30기 2024.02.12

# 클래스와 구조체 - Custom Type

- 객체 지향 프로그래밍

## 클래스

- 클래스 내의 변수 - 속성 (property)
- 클래스 내의 함수 - 메서드 (method)
- 클래스 인스턴스 - 객체
- 상속 가능
- 의미있는 데이터를 묶음으로 만드는 것 → (모델링) 상태 정보를 담는 바구니

## 구조체

- 값형식
- 상속 불가

# 힙과 스택

- 힙은 비어있는 곳에 들어감
- 스택은 차례대로 올라감

# 초기화

- 인스턴스를 만들 때 사용하는 특별한 메서드
- 모든 속성을 초기화 해야 함
- 오버로딩 지원

```swift
class Dog {
		init(n: String, w: Double) {
				name = n
				weight = w
		}
}

var dog = Dog(n: "jina", w: 7.0)
```

# Indentity Operators(식별  연산자)

- 두 개의 참조가 같은지 비교
- ===, ≠=
