import UIKit

let computerNumb = Int.random(in: 0...2)
let myNumb = Int.random(in: 0...2)

if myNumb == 0 {
    if computerNumb == 0 {
        print("무승부입니다.")
    } else if computerNumb == 1 {
        print("당신은 졌습니다.")
    } else {
        print("당신은 이겼습니다.")
    }
} else if myNumb == 1 {
    if computerNumb == 0 {
        print("당신은 이겼습니다.")
    } else if computerNumb == 1 {
        print("무승부입니다.")
    } else {
        print("당신은 졌습니다.")
    }
} else {
    if computerNumb == 0 {
        print("당신은 졌습니다.")
    } else if computerNumb == 1 {
        print("당신은 이겼습니다.")
    } else {
        print("무승부입니다.")
    }
}

if myNumb == computerNumb {
    print("무승부입니다.")
} else if myNumb == 0 && computerNumb == 2 {
    print("당신은 이겼습니다.")
} else if myNumb == 1 && computerNumb == 0 {
    print("당신은 이겼습니다.")
} else if myNumb == 2 && computerNumb == 1 {
    print("당신은 이겼습니다.")
} else {
    print("당신은 졌습니다.")
}
