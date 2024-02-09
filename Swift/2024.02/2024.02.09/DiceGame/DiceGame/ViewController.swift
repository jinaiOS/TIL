//
//  ViewController.swift
//  DiceGame
//
//  Created by 김지은 on 2/9/24.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var imgDice1: UIImageView!
    @IBOutlet weak var imgDice2: UIImageView!

    let dice = [#imageLiteral(resourceName:"black1"), #imageLiteral(resourceName: "black2"), #imageLiteral(resourceName: "black3"), #imageLiteral(resourceName: "black4"), #imageLiteral(resourceName: "black5"), #imageLiteral(resourceName: "black6")]
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }


    @IBAction func rollDiceButtonPressed(_ sender: Any) {
        imgDice1.image = dice.randomElement()
        imgDice2.image = dice.randomElement()
    }
}

