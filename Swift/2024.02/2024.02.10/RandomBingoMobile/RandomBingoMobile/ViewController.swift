//
//  ViewController.swift
//  RandomBingoMobile
//
//  Created by 김지은 on 2/10/24.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var lblResult: UILabel!
    @IBOutlet weak var lblMySelect: UILabel!
    
    var computerChoice = Int.random(in: 1...10)
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }

    @IBAction func numberButtonPressed(_ sender: UIButton) {
        lblMySelect.text = sender.titleLabel?.text ?? ""
    }
    
    @IBAction func resetButtonPressed(_ sender: Any) {
        lblResult.text = "선택하세요"
        lblMySelect.text = ""
        computerChoice = Int.random(in: 1...10)
    }
    
    @IBAction func selectButtonPressed(_ sender: Any) {
        if computerChoice > Int(lblMySelect.text ?? "") ?? 0 {
            lblResult.text = "Up"
        } else if computerChoice < Int(lblMySelect.text ?? "") ?? 0 {
            lblResult.text = "Down"
        } else {
            lblResult.text = "Bingo"
        }
    }
}

