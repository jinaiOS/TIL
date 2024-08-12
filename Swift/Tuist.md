# Tuist
- Xcode 프로젝트 생성과 유지관리를 편하게 하는 것을 목표로 하는 CLI 도구
    - CLI(Command line Interface): 컴퓨터의 운영 체제와 상호 작용하는 명령을 입력할 수 있는 텍스트 기반 인터페이스
- Project.swift 파일을 기반으로 프로젝트 생성

# 이점

- xcodeproj 파일이 없음
    - 프로젝트를 커맨드 명령어로 그 때 그 때 생성해주기 때문에 github에 xcodeproj 프로젝트를 올리지 않고 코드만 올림 → 파일 경로에 의한 git 충돌 회피
- 모듈화하기 편리
- 프로젝트의 모듈 의존 관계를 파악하기 쉬움
    - 명령어 하나면 이미지로 보기 쉽게 의존 그래프를 그려줌
- swift 언어를 이용하여 모듈과 프로젝트 설정을 정의할 수 있음

# 적용 방법

```bash
curl -Ls https://install.tuist.io | bash

tuist init --platform ios // UIkit
tuist init --platform ios --template swiftui // SwiftUI

brew install tree // 설치
tree .

tuist fetch // 수정된 정보 받아오기
tuist generate // 실행
```
