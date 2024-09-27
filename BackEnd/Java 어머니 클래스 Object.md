# Java 어머니 클래스 Object
## Java Object란

### 기본적으로 설치되는 Java.lang 패키지

- Object, System, Class, String, Math, Byte, Short, Character, Integer, Float, Double, Boolean, Long

### 최상위 클래스 Object
- 모든 클래스는 Object의 자식
    
    <img width="521" alt="스크린샷 2024-09-27 오후 9 46 06" src="https://github.com/user-attachments/assets/37ff56cf-01a6-4378-8925-9c572699af25">

## Java Object 메서드 파보기

### toString()

- 객체 정보를 문자열로 바꾸어 줌
- 기본 구현: getClass().getName() + ‘@’ + Integer.toHexString(hashCode())
- 오버라이딩 가능

### equals()

- 두 인스턴스가 같은 객체인지 판단
- 기본 구현: 두 인스턴스의 Heap 주소 값을 비교하여 Boolean 값 리턴

### hashCode()

- 객체의 해시 코드 반환

### clone()

- 자신과 같은 객체 복제
