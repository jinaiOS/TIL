# Java JVM 메모리 런타임
## 자바 참조형 생성과 Heap

### Java 참조형

- class, array, 열거 타입, 인터페이스
- new로 생성 = JVM Heap 메모리 점유
- 변수는 저장된 공간 주소를 지칭하는 것 → 아무 것도 지칭하지 않으면 null 할당

### String

- “” 로 저장하면 기본형
- new로 생성하면 참조형
