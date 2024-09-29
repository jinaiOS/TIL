# Java 여러 기본 클래스
## String 클래스 완전 해부

### Java String은 final char[] 문자열을 가짐

- 불변성을 가진다
- string 값을 변경할 때마다 새로운 주소 값이 생김 → 불필요한 중간 생성물
    - StringBuilder
    
    ```java
    public class StringBuilderTest {
        public static void main(String[] args) {
            // +=
            String str = "";
    
            long startTime = System.currentTimeMillis();
    
            for(int i=0; i < 5000; i++){
                str += "Cat";
            }
            System.out.println(str);
    
            long endTime = System.currentTimeMillis();
            // String 걸린 시간: 52ms
            System.out.println("String 걸린 시간: " + (endTime - startTime) + "ms");
    
            //////
            // string builder
            long startTime2 = System.currentTimeMillis();
    
            StringBuilder sb = new StringBuilder();
    
            for(int i=0; i < 5000; i++){
                sb.append("Cat");
            }
    
            String output = sb.toString();
            System.out.println(output);
    
            long endTime2 = System.currentTimeMillis();
            // SB 걸린 시간: 1ms
            System.out.println("SB 걸린 시간: " + (endTime2 - startTime2) + "ms");
    
        }
    }
    ```
    
    - StringBuffer
- 두 가지 생성 (타임머신)

### == vs equals

- == : 항상 두 변수의 메모리 주소값 비교
- equals: 기본은 == 와 같지만 하위 클래스에서 재정의 가능

## Class 클래스 소개

### 구성요소

- 필드(field): 객체의 데이터가 저장되는 곳
- 생성자(Constructor): 객체 생성 시 초기화 역할 담당
- 메소드(Method): 객체의 동작에 해당하는 실행 블록

### Class 클래스

- 메타 정보 얻어오기

### 필요한 이유

- Java Reflection 기술과 같이 쓰임
    - Java 프로그램에서 클래스를 동적으로 검사하고 조작할 수 있는 기능을 제공
- 많은 자바 백엔드 기술의 근간

## 기타 기본클래스 소개(System, Math)

### System 클래스(유틸리티 클래스)

- 선언 필요 없음
- 운영체제 시스템 관련 기능 수행(입출력하기, 환경변수, 시간 측정 및 GC 호출)

### Math 클래스(유틸리티 클래스)

- 선언 필요 없음
- 기본 수식 연산자 외 여러 수학 계산 관련 메서드 제공
- ex. abs, ceil, max, min,sqrt, round, random 등
