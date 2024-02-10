//
//  ViewController.swift
//  RPSGame
//
//  Created by 김지은 on 2/9/24.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var lblResult: UILabel!
    @IBOutlet weak var lblComputerSelect: UILabel!
    @IBOutlet weak var imgComputerSelect: UIImageView!
    @IBOutlet weak var lblMySelect: UILabel!
    @IBOutlet weak var imgMySelect: UIImageView!
    @IBOutlet weak var btnScissors: UIButton!
    @IBOutlet weak var btnRock: UIButton!
    @IBOutlet weak var btnPaper: UIButton!
    
    let rpsImg = [#imageLiteral(resourceName: "scissors"), #imageLiteral(resourceName: "rock"), #imageLiteral(resourceName: "paper")]
    
    var myChoice: RPS = .paper
    var comChoice: RPS = .paper
    
    override func viewDidLoad() {
        super.viewDidLoad()
     
        [btnScissors, btnRock, btnPaper].forEach { $0?.addTarget(self, action: #selector(rpsButtonPressed(_:)), for: .touchUpInside) }
    }

    @objc func rpsButtonPressed(_ sender: UIButton) {
        lblMySelect.text = sender.titleLabel?.text ?? ""
        
        switch sender {
        case btnScissors:
            imgMySelect.image = rpsImg[0]
            myChoice = .scissors
        case btnRock:
            imgMySelect.image = rpsImg[1]
            myChoice = .rock
        default:
            imgMySelect.image = rpsImg[2]
            myChoice = .paper
        }
    }

    @IBAction func resetButtonPressed(_ sender: Any) {
        lblComputerSelect.text = "준비"
        lblMySelect.text = "준비"
        imgComputerSelect.image = #imageLiteral(resourceName: "ready")
        imgMySelect.image = #imageLiteral(resourceName: "ready")
    }
    
    @IBAction func selectButtonPressed(_ sender: UIButton) {
        imgComputerSelect.image = rpsImg.randomElement()
        
        switch imgComputerSelect.image {
        case rpsImg[0]:
            lblComputerSelect.text = "가위"
            comChoice = .scissors
        case rpsImg[1]:
            lblComputerSelect.text = "바위"
            comChoice = .rock
        default:
            lblComputerSelect.text = "보"
            comChoice = .paper
        }
        
        if myChoice == comChoice {
            lblResult.text = "비겼다"
        } else if myChoice == .rock && comChoice == .scissors {
            lblResult.text = "이겼다"
        } else if myChoice == .paper && comChoice == .rock {
            lblResult.text = "이겼다"
        } else if myChoice == .scissors && comChoice == .paper {
            lblResult.text = "이겼다"
        } else {
            lblResult.text = "졌다"
        }
    }
}

