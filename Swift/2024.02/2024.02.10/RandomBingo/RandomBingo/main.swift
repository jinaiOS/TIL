//
//  main.swift
//  RandomBingo
//
//  Created by 김지은 on 2/10/24.
//

import Foundation

var computerChoice = Int.random(in: 1...100)

while true {
    var myChoice = Int(readLine() ?? "")!
    
    if computerChoice > myChoice {
        print("Up")
    } else if computerChoice < myChoice {
        print("Down")
    } else {
        print("Bingo")
        break
    }
}
