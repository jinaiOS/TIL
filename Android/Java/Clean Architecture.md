# Clean Architecture
# Entities

- 핵심 업무 규칙 캡슐화
- 메서드를 가지는 객체, 일련의 데이터 구조와 함수의 집합
- 가장 변하지 않으며 외부로부터 영향을 받지 않는 영역

# Use Cases

- 애플리케이션의 특화된 업무 규칙 포함
- 시스템의 모든 유즈 케이스를 캡슐화하고 구현
- 엔티티로 들어오고 나가는 데이터 흐름을 조정하고 조작

# Interface Adapter

- 일련의 어댑터들로 구성
- 외부 인터페이스에서 들어오는 데이터를 유즈 케이스와 엔티티에서 처리하기 편한 방식으로 변환하며, 유즈 케이스와 엔티티에서 나가는 데이터를 외부 인터페이스에서 처리하기 편한 방식으로 변환
- 컨트롤러, 프레젠터, 게이트웨이 해당

# Frameworks & Drivers

- 시스템의 핵심 업무와는 관련 없는 세부 사항
- 프레임워크나, 데이터베이스, 웹 서버 등이 해당

# Android

## Presentation Layer

- View
    - 직접적으로 플랫폼 의존적인 구현
    - UI 표시와 사용자 입력 담당
- Presenter
    - 어떤 반응을 해야 하는지에 대한 판단
    - 무엇을 그려야 할지도 알고 있는 영역

## Domain Layer

- Use Case
    - 비즈니스 로직이 들어 있는 영역
- Entity
    - 앱의 실질적인 데이터

## Data Layer

- Repository
    - 유즈 케이스가 필요로 하는 데이터의 저장 및 수정 등의 기능을 제공하는 영역, 데이터 소스를 인터페이스로 참조하여, 로컬 DB와 네트워크 통신을 자유롭게 할 수 있음
- Data Source
    - 실제 데이터의 입출력 실행

> 사용자가 버튼 클릭 → UI → Presenter → Use Case → Entity → Repository → Data Source
>
