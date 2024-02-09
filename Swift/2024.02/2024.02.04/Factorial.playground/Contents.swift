import UIKit

func changeFactorialNumb(num: Int) {
    var result = num
    for i in 1..<num {
        result *= i
    }
    print(result)
}

changeFactorialNumb(num: 5)

//MARK: 재귀 함수
func changeFactorialNum1F(num: Int) -> Int {
    if num <= 1 {
        return 1
    }
    return num * changeFactorialNum1F(num: num - 1)
}

changeFactorialNum1F(num: 5)

/// 스택 오버플로우 현상 일어날 수 있으니 조심
