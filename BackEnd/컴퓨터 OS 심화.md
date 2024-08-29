# 컴퓨터 OS 심화
## 일 못하는 푸드 트럭 처리 방식(= 일 못하는 CPU의 순차적 처리)

- 다양하고 많은 햄버거 주문
- 순차적으로 하나씩 요리
- 고객 컴플레인

## 일 잘하는 푸드 트럭 처리 방식(= 일 잘하는 CPU의 병행 처리)

- 여러 요리 과정을 돌며 조금씩 처리
- 여러 요리사가 요리 동시 처리
- Concurrency
- Parallelism
- 스레드를 이용한 멀티 프로세싱

## Shell과 Terminal

```bash
ps // 현재 동작하고 있는 프로세스
ps aux // 전체 프로세스
ps aux | grep Contents/MacOS/Safari // 사파리 프로세스
kill -TERM 51064 // 끄는 법
```

```bash
while true; do echo "hello"; sleep 3; done // 3초마다 hello를 찍음
hello
hello
hello

// ctrl + c 작업 종료
// ctrl + z 작업 중지

jobs // 현재 작업
fg %1 // 다시 실행하기
```
