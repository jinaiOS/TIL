# Java 컬렉션 List 만들기 (데이터 구조 기본 원리)
## 컬렉션 프레임워크란

- 속한 패키지: Java.util 패키지
- 구성 상위 인터페이스: Collection 인터페이스, Map 인터페이스

## 두 가지 근본 Structure

### 컴퓨터에게 자료구조란?

- 컴퓨터에게 Data?
    - RAM 차지하는 집
    - RAM 데이터 접근 = 쿠팡맨
- 여러 집들을 특정 규칙으로 묶은 동네

### 두 가지 근본 Structure

1. 여러 집 일렬로 세워 묶기 = Array 구조
    1. 코드 구현 = Object Array
    2. 장점
        1. 빠른 인덱스 기반 접근 가능
        2. 메모리 공간 효율성 높음
    3. 단점
        1. 크기 조정 어려움
        2. 데이터 삽입 삭제 비용 높음
2. 떨어진 여러 집끼리 연결 = Node 구조
    1. 코드 구현 = Node 클래스
    2. 장점
        1. 동적 크기 조정 가능
        2. 삽입 및 삭제 효율적
        3. 구조 변경이 용이
    3. 단점
        1. 링크 필드 참조로 접근한다
        2. 포인터 사용으로 메모리 추가사용

## Java List 구현하기

- 용도: 순서가 있는 데이터 컬렉션
- 대표 구현체
    - ArrayList(= Array 구조)
    - LinkedList(= Node 구조)

```java
public class ListInterfaceTest {
    public static void main(String[] args) {
        // List 정의
        List<String> fruitList = new ArrayList<>();

        // add
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Orange");
        fruitList.add("Pear");
        // [Apple, Banana, Orange, Pear]
        System.out.println(fruitList);

        // add(index, element)
        fruitList.add(3, "Mango");
        // [Apple, Banana, Orange, Mango, Pear]
        System.out.println(fruitList);

        // remove(index)
        fruitList.remove(3);
        // [Apple, Banana, Orange, Pear]
        System.out.println(fruitList);

        // get(index)
        String myFruit = fruitList.get(3);
        // Pear
        System.out.println(myFruit);

        // set(index, element)
        fruitList.set(1, "PineApple");
        // [Apple, PineApple, Orange, Pear]
        System.out.println(fruitList);

        // size
        // 4
        System.out.println(fruitList.size());

        // isEmpty: 현재 리스트가 비었는지, 안 비었는지 확인
        List<String> fruitList2 = new ArrayList<>();
        System.out.println(fruitList2.isEmpty());
        System.out.println(fruitList.isEmpty());

        // Contains: 리스트에 해당 원소가 있는지 없는지 확인하는 메서드
        System.out.println(fruitList.contains("Kiwi"));
        System.out.println(fruitList.contains("Apple"));

        // IndexOf, Clear
        String myFruit2 = "Orange";
        System.out.println(fruitList.indexOf(myFruit2));

        String myFruit3 = "Apple";
        System.out.println(fruitList.indexOf(myFruit3));

        fruitList.clear();
    }
}
```

```java
public class ListGetPerformanceTest {
    static final int SIZE = 10000;

    public static void main(String[] args) {
        // List ArrayList 구현
        List<Integer> integerList1 = new ArrayList<>();

        for(int i=0; i < SIZE; i++) {
            integerList1.add(i);
        }

        // List LinkedList 구현
        List<Integer> integerList2 = new LinkedList<>();

        for(int i=0; i < SIZE; i++) {
            integerList2.add(i);
        }

        System.out.println("integerList1: " + integerList1);
        System.out.println("integerList2: " + integerList2);

        long startTime;
        long endTime;

        startTime = System.currentTimeMillis();

        for (int i=0; i < SIZE; i++) {
            integerList1.get(i);
        }

        endTime = System.currentTimeMillis();
        // ArrayList Get 요청 걸린 시간: 1ms
        System.out.println("ArrayList Get 요청 걸린 시간: " + (endTime - startTime) + "ms");

        long startTime2;
        long endTime2;

        startTime2 = System.currentTimeMillis();

        for (int i=0; i < SIZE; i++) {
            integerList2.get(i);
        }

        endTime2 = System.currentTimeMillis();
        // LinkedList Get 요청 걸린 시간: 54ms
        System.out.println("LinkedList Get 요청 걸린 시간: " + (endTime2 - startTime2) + "ms");
    }
}
```

```java
public class ListInsertRemovePerformanceTest {
    static final int SIZE = 100000;

    public static void main(String[] args) {
        long startTime;
        long endTime;

        startTime = System.currentTimeMillis();

        // List ArrayList 구현
        List<Integer> integerList1 = new ArrayList<>();

        for (int i = 0; i < SIZE; i++) {
            integerList1.add(i);
            if (i % 5 == 0) integerList1.remove(0);
        }

        endTime = System.currentTimeMillis();
        // ArrayList 삽입/삭제 요청 걸린 시간: 98ms
        System.out.println("ArrayList 삽입/삭제 요청 걸린 시간: " + (endTime - startTime) + "ms");

        long startTime2;
        long endTime2;

        startTime2 = System.currentTimeMillis();

        // List LinkedList 구현
        List<Integer> integerList2 = new LinkedList<>();

        for (int i = 0; i < SIZE; i++) {
            integerList2.add(i);
            if (i % 5 == 0) integerList2.remove(0);
        }

        endTime2 = System.currentTimeMillis();
        // ArrayList 삽입/삭제 요청 걸린 시간: 98ms
        System.out.println("LinkedList 삽입/삭제 요청 걸린 시간: " + (endTime2 - startTime2) + "ms");
    }
}
```
