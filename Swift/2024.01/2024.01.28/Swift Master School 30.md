# Swift 마스터 스쿨 30기 2024.01.28

# 연산자(Operator)

## 단항연산자(Unary Operator)

- -a, +a

## 이항연산자(Binary Operator)

- a + b, a ≥ b

## 삼항연산자(Ternary Operator)

- a ? b : c

# 기본 연산자

## 할당 연산자(Assignment Operator)

- 오른쪽의 값을 왼쪽에 대입

## 산술 연산자(Arithmetic Operator)

- 사칙 연산 등
- + - * / %
- %는 int 일 때만

## 복합 할당 연산자(Compound Assignment Operators)

- +=, -=, *=, /=, %=

## 비교 연산자(Comparison Operators)

- ==, ≠, >, ≥, <, ≤

## 논리 연산자(Logical Operators)

- ! - Logical NOT Operator
- && - Logical AND Operator
- || - Logical OR Operator

## 접근 연산자

- .

# 프로그래밍의 기본 원리

순차, 조건, 반복 + 데이터

# Value Binding

```swift
switch num {
  case let x: // let x = num
    print(q)
  default:
    break
}

switch num {
  case var x: // var x = num
    x = 9
  default:
    break
}
```
# Tuples
## Named Tuples

https://www.inflearn.com/course/스위프트-문법-마스터-스쿨
