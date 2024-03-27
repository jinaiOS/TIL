# iOS Jailbreak(iOS 탈옥)
> 애플의 운영 체제에서 제조사의 제한을 **우회**하여 사용자가 루트 액세스 권한을 얻는 행위
> 

- 허용하지 않는 소프트웨어 설치 및 공식 앱 스토어에 없는 앱을 사용할 수 있음
- 따라서, 앱이 실행 될 때 이를 탐지하고 적절한 조치를 취해야 함

```swift
// 일반적으로 존재하지 않는 파일이나 디렉터리 확인
struct RootCheckPath {
    private let cydiaPath_ = "/Applications/Cydia.app"
    private let aptPath_ = "/private/var/lib/apt/"
    private let substratePath_ = "/Library/MobileSubstrate/MobileSubstrate.dylib"
    private let sshdPath_ = "/usr/sbin/sshd"
    private let sshPath_ = "/usr/bin/ssh"
    private let etcPath_ = "/etc/apt"
    private let bashPath_ = "/bin/bash"
    private let privatePath_ = "/private/" + NSUUID().uuidString
    private let cydiaPackage_ = "cydia://package/com.example.package"
    
    
    var cydiaPath : String {
        get {
            return cydiaPath_
        }
    }
    var aptPath : String {
        get {
            return aptPath_
        }
    }
    var substratePath : String {
        get {
            return substratePath_
        }
    }
    var sshdPath : String {
        get {
            return sshdPath_
        }
    }
    var sshPath : String {
        get {
            return sshPath_
        }
    }
    var etcPath : String {
        get {
            return etcPath_
        }
    }
    var bashPath : String {
        get {
            return bashPath_
        }
    }
    var privatePath : String {
        get {
            return privatePath_
        }
    }
    var cydiaPackage : String {
        get {
            return cydiaPackage_
        }
    }
}
```

```swift
private func checkingJailBreak() {
    let fileManager = FileManager.default
    let rootCheckPath = RootCheckPath.init()
    var check = false
    
    // 탈옥 관련 경로들
    let jailbreakPaths = [
        rootCheckPath.cydiaPath,
        rootCheckPath.aptPath,
        rootCheckPath.substratePath,
        rootCheckPath.sshdPath,
        rootCheckPath.sshPath,
        rootCheckPath.etcPath,
        rootCheckPath.bashPath
    ]
    
    // 파일 존재 여부 체크
    check = jailbreakPaths.contains { path in
        return fileManager.fileExists(atPath: path) || canOpen(path: path)
    }
    
    // 쓰기 가능 경로 체크
    if !check {
        check = canWriteToPath(rootCheckPath.privatePath)
    }
    
    // Cydia URL 스킴 체크
    if !check, let url = URL(string: rootCheckPath.cydiaPackage), UIApplication.shared.canOpenURL(url) {
        check = true
    }
    
    // 탈옥 체크 결과에 따른 동작
    if check {
        // 맞을 때 로직
    } else {
        // 아닐 때 로직
    }
}

/// 경로에 쓰기 가능한지 체크하는 메서드 - 일반적으로 탈옥하면 쓰기가 가능해진다.
private func canWriteToPath(_ path: String) -> Bool {
    let fileManager = FileManager.default
    do {
        try "anyString".write(toFile: path, atomically: true, encoding: String.Encoding.utf8)
        try fileManager.removeItem(atPath: path)
        return true
    } catch {
        return false
    }
}

/// 경로를 열 수 있는지 체크하는 메서드
private func canOpen(path: String) -> Bool {
    let fileManager = FileManager.default
    return fileManager.fileExists(atPath: path)
}
```
