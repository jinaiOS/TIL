# TIL
# 프로퍼티: 클래스, 구조체, 열거형과 관련한 값 와 출력, 메서드

## 저장 프로퍼티(Stored Properties)

    * 단순히 값을 저장하는 프로퍼티
    * let키워드를 이용해서 상수 혹은 var키워드를 이용해서 변수로 선언해 사용
    * 구조체를 상수로 선언하면(let) 그 구조체 인스턴스의 프로퍼티를 변경할 수 없음
        * 구조체가 아니라 클래스는 let으로 선언하더라도 프로퍼티가 변경 가능
    * 지연저장 프로퍼티(Lazy Stored Properties)
        * 프로퍼티의 선언 앞에 lazy를 붙이면 됨
        * 반드시 var로 선언
        
## 계산된 프로퍼티(Computed Properties)

    * 저장 프로퍼티를 뿐 아니라 추가적으로 클래스, 구조체, 열거형은 계산된 프로퍼티를 선언 가능
    * getter와 optional한 setter를 제공해 값을 탐색하고 간접적으로 다른 프로퍼티 값을 설정할 수 있는 방법을 제공
    * Setter의 인자 이름을 아래와 같이 set(newCenter)라고 명시했지만, 만약 이렇게 (newCenter)라고 인자 이름을 지정하지 않으면 인자 기본 이름인 newValue를 사용 가능
    * 읽기 전용 계산된 프로퍼티(Read-Only Computed Properties)
        * getter만 있고 setter를 제공하지 않는 계산된 프로퍼티를 읽기전용 계산된 프로퍼티
        * 보통 읽기전용(read-only)이라 함은 한번 값이 정해지면 변하지 않기 때문에 let으로 선언하는 것이 맞으나 계산된 프로퍼티는 읽기전용(read-only)이라 하더라도 계산 값에 따라 값이 변할 수 있기 때문에 var로 선언
        
## 프로퍼티 옵저버(Property Observers)

    * willSet : 값이 저장되기 바로 직전에 호출 됨
        * willSet에서는 새 값의 파라미터명을 지정할 수 있는데, 지정하지 않으면 기본 값으로 newValue를 사용합니다.
    * didSet : 새 값이 저장되고 난 직후에 호출 됨
        * didSet에서는 바뀌기 전의 값의 파라미터명을 지정할 수 있는데, 지정하지 않으면 기본 값으로 oldValue를 사용합니다.
