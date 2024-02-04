import UIKit

func printPrimeNumb(numb: Int) -> String {
    for i in 2..<numb {
        if numb % i == 0 {
            return "소수가 아닙니다."
        }
    }
    return "소수입니다."
}

print(printPrimeNumb(numb: 2))
