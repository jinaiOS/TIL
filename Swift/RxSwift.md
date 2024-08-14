# RxSwift
Reactive Programming in Swift

반응형 프로그래밍을 swift로 하는 것!

- 데이터의 흐름 및 변경사항을 전파하는 데 중점을 둔 프로그래밍 패러다임

# 애플에서 제공하는 기본 비동기 API

- NotificationCenter, delegate pattern, Grand Central Dispatch, Closures, Combine

# Observable

- 관찰 가능한 데이터 시퀀스
- 데이터 시퀀스: 시간에 따라 변경될 수 있는 값들의 연속
- 이벤트 값을 방출(emit) 할 수 있고, 값을 구독하여 관찰하고 반응할 수 있다.
- Observer가 실시간으로 어떤 이벤트에 반응하고 UI를 업데이트하거나 들어오는 데이터를 처리하고 활용할 수 있게 한다.

## 특징

1. 이벤트를 발생시키는 소스: 데이터의 소스로 작용
2. 데이터의 연속적인 스트림: 시간에 따라 데이터를 방출하는 스트림
3. Subscription: Observer가 구독할 수 있는 데이터 소스

## 생명주기

1. 생성(생명주기의 시작)
    1. 사용자가 버튼을 누르면 Observable 생성 → 버튼의 탭 이벤트를 감지하는 데이터 소스로서 작동
    2. 주의할 점: 생성했다고 해서 데이터가 생성되거나, 명령이 동작하는 게 아님
2. 구독(Subscription)
    1. Observer에 의해 구독 됨
    2. Observer에서 생성하는 데이터 스트림을 전달하기 시작하는 지점
    3. 구독한 이후에 버튼의 탭 이벤트를 Observer에게 전달하기 시작
3. 이벤트 발생
    1. 사용자가 버튼을 누르면 이벤트를 감지하고 Observer에게 이벤트 방출
    2. Observable이 생성한 데이터 스트림 중 하나의 이벤트
4. 완료(Completion) 또는 에러(Error)
    1. 이벤트를 방출한 후에 완료되거나 에러가 발생할 수 있음
    2. 스트림 끝나는 조건 → onCompletion() 또는 onError()
5. 해제(Dispose)
    1. Observer가 더 이상 이벤트를 받고 싶지 않거나, 필요하지 않을 때 구독을 해제함
    2. 생명 주기 마무리

```swift
import UIKit
import RxSwift

class ViewController: UIViewController {
    let disposeBag = DisposeBag()
    let button = UIButton(type: .system)
    
    override func viewDidLoad() {
        super.viewDidLoad()

        // 버튼 탭을 감지하는 Observable 생성
        let tapObservable = Observable<Void>.create { observer in
            self.button.addTarget(self, action: #selector(self.buttonTapped), for: .touchUpInside)
            
            // Dispose 처리
            return Disposables.create()
        }
        
        // Observable 구독
        tapObservable.subscribe(onNext: { _ in
            print("Button tapped!") // 이벤트 발생
        }).disposed(by: disposeBag)
    }
    
    @objc func buttonTapped() {
        // 버튼이 탭되면 Observer에게 이벤트를 전달
        print("Button tapped!") // 이벤트 발생
    }
}
```

# MVVM과 같이 쓰면 장점

1. 양방향 데이터 바인딩
    1. ViewModel의 상태가 변경되면 자동으로 연결된 뷰가 업데이트
2. 비동기 작업 처리
    1. ViewModel에서 비동기 작업을 수행하고 그 결과를 뷰에 반영할 수 있음
3. 데이터 변환 및 조작
    1. ViewModel에서 받아온 데이터를 필요한 형태로 가공하거나 필터링하여 뷰에 적합한 형태로 변환할 수 있음
4. 리액티브 프로그래밍의 특징
    1. 코드의 가독성과 유지 보수성 향상
