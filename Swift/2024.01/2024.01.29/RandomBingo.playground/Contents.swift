import UIKit

let computerNumb = Int.random(in: 1...10)
let myNumb = Int.random(in: 1...10)

if computerNumb > myNumb {
    print("Up")
} else if computerNumb < myNumb {
    print("Down")
} else {
    print("Bingo")
}
