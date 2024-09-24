# Java JVM 메모리 구조
## JVM 구성 요소

- Class Loader(호출), Execution Engine(실행) - Runtime Data Area(저장)

### Class Loader

- .class 들을 불러서 호출
1. Loading(로드): 클래스 파일을 가져와서 JVM 메모리에 로드
2. Linking(링크): 클래스 파일을 사용하기 위해 검증하는 과정
    1. Verifying(검증)
    2. preparing(준비)
    3. Resolving(분석)
3. Initialization(초기화)

### Execution Engine

- JVM 실행 엔진
- Java Interpreter: 동시 통역
- Just-In-Time(JIT) compiler: 반복 문장
- Garbage Collector

## JVM Runtime-Area

### JVM Method Area

- 메서드 영역은 클래스/메소드 코드, 정적 필드, 상수 풀 저장 영역

### JVM Heap

- 런타임 시, 동적으로 할당되는 영역으로 인스턴스와 배열 타입 등 저장

### JVM Stack

- 프로그램 실행 중, 임시로 할당되고 소멸되는 정보 저장
- 프레임
    - 해당 메소드 만을 위한 공간
    - 메서드 종료되면 삭제
    - 매개 변수, 지역변수 등록 시 저장
