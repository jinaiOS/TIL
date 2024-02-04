# TIL
# 옵셔널

* 값이 있을 수도 없을 수도 있는 상황에서 사용

## 옵셔널 사용

* 옵서녈 변수 또는 상수가 아니면 nil을 할당할 수 없음
* 정말 값이 없을 때만 nil 사용
* Optional<String> = String?
* 옵셔널은 두 가지 가능성을 나타냅니다.
    * 값이 있고 옵셔널로 래핑(wrapping)해놓은 값을 언래핑(unwrapping)하여 해당 값에 액세스할 수 있음
    * 값이 전혀 없음

## 옵셔널 바인딩

* 빈값인지 존재하는지 검사한 후, 존재하는 경우 그 값을 다른 변수에 대입시켜 바인딩하는 것을 의미
* if let / if var, guard let / guard var을 써서 옵셔널 값을 추출해 새로운 변수에 바인딩
* if let vs guard let 차이점
    * if let은 if문의 코드 구현부 내에서만 상수 사용이 가능합니다.(지역 변수)
    * guard let 은 guard문을 통과한 상수를 guard문 밖에서 사용이 가능합니다.(전역변수)

## 옵셔널 강제 언래핑

* 강제 언래핑(Force unwrapping)은 !를 써서 강제로 옵셔널 추출
* 프로그램이 비정상적으로 종료될 수도 있으므로 반드시 nil이 아닌 것이 확실한 상황에서 사용

## 옵셔널 체이닝

* 옵셔널을 연쇄적으로 사용하는 것
* . 을 통해 내부 프로퍼티나 메서드에 연속적으로 접근할 때 옵셔널 값이 있으면 옵셔널 체이닝으로 접근 가능