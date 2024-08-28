# Java?
## 컴파일 언어

- 소스코드를 목적코드로 옮기는 것
- 번역과 실행이 따로 이루어진다
- 컴파일러: 번역기라고 불리며 특정 프로그래밍 언어를 다른 언어로 옮기는 프로그램

## (참고) 인터프리터 언어

- 소스코드를 바로 실행하는 컴퓨터 프로그램 또는 환경
- 번역과 실행이 동시에 일어남
- javascript

## 컴파일 및 실행 과정

Program.java → JAVA Compiler → Program.class → JVM → Program

### JVM

- Java Virtual Machine 자바 가상 메모리
- 자바 프로그램 실제 실행하는 가상 OS

### JRE

- JVM + 필수파일
- 자바 개발 없이 실행만 하면 되는 상황일 때 설치

### JDK

- JVM + 필수파일 + 개발자 패키지
- 자바 개발할 때 필요한 종합 패키지
- 우리가 설치해야 하는 것

## 컴파일 명령어

```bash
javac HelloWorld.java

java HelloWorld // 실행
```

- Java 컴파일러가 소스 코드를 바이트코드로 변환하여 실행 가능한 `.class` 파일을 생성
