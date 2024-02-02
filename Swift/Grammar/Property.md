# TIL
# Property란?

클래스, 구조체 또는 열거형과 관련된 **값**입니다

또, 이 프로퍼티는 **저장 프로퍼티, 연산 프로퍼티, 타입 프로퍼티**로 나눌 수 있습니다.

# 저장 프로퍼티(Stored Properties)

단순히 값을 저장하는 프로퍼티를 뜻합니다
var 키워드를 사용하면 변수 저장 프로퍼티, let 키워드를 사용하여 상수 저장 프로퍼티가 됩니다

클래스와 구조체에서만 사용 가능

※ 변수 : 어떤 상황의 가변적 요인
※ 상수 : 정하여진 수량

```
struct FixedLengthRange {
    var firstValue: Int // 저장 프로퍼티
    let length: Int // 저장 프로퍼티
}
var rangeOfThreeItems = FixedLengthRange(firstValue: 0, length: 3)
// 범위 값은 0, 1, 2 입니다.
rangeOfThreeItems.firstValue = 6
// 범위 값은 6, 7, 8 입니다.

```

firstValue와 length 저장 프로퍼티에 값을 저장한 것을 볼 수 있습니다

class에서 let 상수는 값을 변경할 수 없지만! struct에서는 가능합니다

이유는 클래스 인스턴스는 참조 타입 이기 때문

## 지연 저장 프로퍼티(Lazy Stored Properties)

값이 처음으로 사용 되기 전에는 계산되지 않는 프로퍼티
**lazy** 키워드를 붙여서 선언합니다

지연 저장 프로퍼티는 값이 처음에 없기에 반드시 **var** 키워드를 사용해야 합니다

```swift
class DataImporter {
    /*
        DataImporter는 외부 파일에서 데이터를 가져오는 클래스입니다.
         이 클래스는 초기화 하는데 매우 많은 시간이 소요된다고 가정하겠습니다.
     */
    var filename = "data.txt"
    // 데이터를 가져오는 기능의 구현이 이 부분에 구현돼 있다고 가정
}

class DataManager {
    lazy var importer = DataImporter()
    var data = [String]()
    // 데이터를 관리하는 기능이 이 부분에 구현돼 있다고 가정
}

let manager = DataManager()
manager.data.append("Some data")
manager.data.append("Some more data")
// DataImporter 인스턴스는 이 시점에 생성돼 있지 않습니다.

```

Datamanager에서 DataImporter를 가지고 있습니다
이 때, DataImporter는 실제 디스크 파일에서 데이터를 가져오기 때문에 초기화시 많은 시간이 소요됩니다

따라서 lazy var를 사용하여 그 프로퍼티가 실제로 구현되기 전에 복잡한 연산을 피할 수 있습니다

# 연산 프로퍼티(Computed Properties)

저장 프로퍼티는 클래스, 구조체에서만 사용 가능했습니다. 하지만 연산 프로퍼티는 클래스, 구조체 그리고 열거형에서도 사용이 가능합니다

```swift
struct Point {
    var x = 0.0, y = 0.0
}
struct Size {
    var width = 0.0, height = 0.0
}
struct Rect {
    var origin = Point()
    var size = Size()
    var center: Point {
        get {
            let centerX = origin.x + (size.width / 2)
            let centerY = origin.y + (size.height / 2)
            return Point(x: centerX, y: centerY)
        }
        set(newCenter) {
            origin.x = newCenter.x - (size.width / 2)
            origin.y = newCenter.y - (size.height / 2)
        }
    }
}
var square = Rect(origin: Point(x: 0.0, y: 0.0),
                  size: Size(width: 10.0, height: 10.0))
let initialSquareCenter = square.center
square.center = Point(x: 15.0, y: 15.0)
print("square.origin is now at (\(square.origin.x), \(square.origin.y))")
// "square.origin is now at (10.0, 10.0)" 출력
```
