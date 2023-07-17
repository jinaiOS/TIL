# TIL
# 기본 데이터 타입과 큐&스택, 배열

## Int와 UInt

* Int: +, - 부호를 포함한 정수
    * 2,147,483,648 ~ 2,147,483,647 사이 숫자를 표현
* UInt: Int 중 - 부호를 포함하지 않는 0을 포함한 양의 정수

## Float와 Double: 소수점을 표현하는 데이터 타입

* Float: 32비트의 부동소수 표현
* Double: 64비트의 부동소수 표현
    * 두 개 다 적합한 상황이면 Double 사용

## Bool: 참 true와 거짓 false 을 표현할 수 있는 데이터 타입

## String: 문자열을 표현하는 데이터 타입

* 여러 줄의 문자열을 쓰고 싶다면 큰따옴표 세 개 사용

## Character: 하나의 문자를 표현하는 데이터 타입

* 유니코드에서 지원하는 모든 언어 및 특수기호 사용 가능

### 특수문자
* \n: 줄바꿈 문자
* \\: 문자열 내에서 백슬래시를 표현하고자 할 때 사용
* \”: 문자열 내에서 큰따옴표를 표현하고자 할 때 사용
* \t: 탭 문자. 키보드의 탭키를 눌렀을 때와 같은 효과
* \0: 문자열이 끝났음을 알리는 null 문자

## Tuple: 여러 값을 하나로 그룹화한 값, 저장된 데이터의 묶음

## Any. AnyObject, nil

* Any: 모든 데이터 타입 사용 가능
    * Any 데이터 형을 대입하려면 반드시 형 변환이 필요
* AnyObject: 인스턴스만 할당 가능
* nil: 없음

## Queue

* First-In-First-Out (FIFO)
* 먼저 들어온 값을 먼저 내보내는 구조

## Stack

* Last-In-First-Out (LIFO)
* 먼저 들어온 값을 가장 마지막에 내보내는 구조

## Array: 배열

# 세트, 딕셔너리, 열거형

## Set

* 집합
* 항목의 순서가 중요하지 않거나 항목이 한 번만 표시되도록 해야 하는 경우 Array 대신 집합 사용
* 세트 안에 있는 모든 값은 고유(unique)해야하므로 중복을 허용하지 않음
* sorted() 메서드를 통해 정렬된 배열 반환
    * 합집합: union
    * 교집합: intersection
    * 차집합: subtracting
    * 대칭 차집합: symmetricDifference

## Dictionary

* 순서 없이 key와 값의 쌍으로 구성되는 컬렉션 타입
    * key는 중복될 수 없음
    * 모든 key는 같은 타입
    * 모든 value는 같은 타입
    * key와 value는 다른 타입 가능

## Enum

* 기본 열거형
    * 항목 그 자체가 고유값, 한 줄로 표현 가능
    * ex. enum Fruit { case banana, tomato, melon, strawberry }
* 원시 값(rawValue)
    * 올바르지 않다면 nil 반환
* 연관 값
    * 소괄호로 묶어 표현
    * ex. enum Fruit { case banana(count: Int) }
* 항목 순회
    * ex. enum Fruit: CaseIterable { case banana, tomato, melon, strawberry }
    * let allCases: [Fruit] = Fruit.allCases
    * print(allCases)
        * -> // Fruit.banana, Fruit.tomato, Fruit.melon, Fruit.strawberry
* 순환 열거형
    * 열거형 항목의 연관 값이 열거형 자신의 값이고자 할 때 사용
    * ex. indirect enum
* 비교 가능한 열거형
    * Comparable 프로토콜을 준수하는 연관 값만 갖거나 연관 값이 없는 열거형은 Comparable 프로토콜을 채택하면 각 케이스 비교 가능
    * 앞에 위치한 케이스가 더 작은 값이 됨
