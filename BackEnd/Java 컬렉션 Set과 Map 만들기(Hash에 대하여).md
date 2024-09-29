# Java 컬렉션 Set과 Map 만들기(Hash에 대하여)
## Java 컬렉션과 Map과 Set

### Map

- Key-Value 형태
- Key로 Value 검색
- HashMap(= Array 구조 기반)
- TreeMap(= Node 구조 기반)

```java
public class MapInterfaceTest {
    public static void main(String[] args) {
        // Map 정의
        Map<String, Integer> fruitMap = new HashMap<>();

        // Map 에 데이터 넣음
        fruitMap.put("apple", 10);
        fruitMap.put("orange", 5);
        fruitMap.put("banana", 3);
        fruitMap.put("pear", 20);

        // {orange=5, banana=3, apple=10, pear=20}
        System.out.println(fruitMap);

        // Get(Key)
        Integer appleCount = fruitMap.get("apple");
        Integer bananaCount = fruitMap.get("banana");

        System.out.println(appleCount);
        System.out.println(bananaCount);

        // contains(Key)
        Boolean isApple = fruitMap.containsKey("apple");
        Boolean isMango = fruitMap.containsKey("mango");

        System.out.println(isApple);
        System.out.println(isMango);

        // remove(Key)
        fruitMap.remove("apple");
        System.out.println(fruitMap);

        // size
        System.out.println(fruitMap.size());

        // KeySet()
        // [orange, banana, pear]
        System.out.println(fruitMap.keySet());
    }
}
```

### Set

- 중복 없는 컬렉션
- 고유한 요소 검색
- 순서가 의미 없어서 순서가 안 맞음
- HashSet(= Array 구조 기반)
- TreeSet(= Node 구조 기반)

```java
public class SetInterfaceTest {
    public static void main(String[] args) {
        // Set 인터페이스 구현
        Set<String> fruitSet = new HashSet<>();

        // Add
        fruitSet.add("apple");
        fruitSet.add("banana");
        fruitSet.add("orange");
        fruitSet.add("pear");

        // [banana, orange, apple, pear]
        System.out.println(fruitSet);

        // add 중복 add x
        List<String> fruitList = new ArrayList<>();
        fruitList.add("apple");
        fruitList.add("banana");
        fruitList.add("orange");
        fruitList.add("pear");

        fruitSet.add("apple");

        // [banana, orange, apple, pear]
        System.out.println(fruitSet);
        // [apple, banana, orange, pear] - 순서 맞게 나옴
        System.out.println(fruitList);

        // remove(set)
        fruitSet.remove("apple");
        System.out.println(fruitSet);

        // container
        System.out.println(fruitSet.contains("apple"));

        // size, isempty, clear
        System.out.println(fruitSet.size());

        fruitSet.clear();
        System.out.println(fruitSet.isEmpty());
        // []
        System.out.println(fruitSet);
    }
}
```

## Hash란?

- 임의의 크기를 가진 데이터를 고정된 크기의 고유한 값으로 변환하는 함수
- 용도
    - 데이터 무결성 검사
    - 데이터 암호화
    - 데이터 검색

```java
public class HashTest {
    public static String hashString(String input) {
        try {
            // MessageDigest 인스턴스 생성 (해시 알고리즘으로 SHA-256 선택)
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // 입력 문자열을 바이트 배열로 변환하여 해시 함수에 전달
            byte[] hashBytes = digest.digest(input.getBytes(StandardCharsets.UTF_8));

            // Base64로 인코딩하여 해시된 문자열 반환
            return Base64.getEncoder().encodeToString(hashBytes);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        String password= "q1we2e3r4t5";
        String hashPassword = hashString(password);

        // q1we2e3r4t5
        // /idgsaxzl8oXGcUIUd5yeCYLEMWvguWEe0bV4jlvzsY=
        System.out.println(password);
        System.out.println(hashPassword);

        // data 검색을 위한 hash
        long hashCode = Objects.hashCode(password);
        long hashCode2 = Objects.hashCode(2244);
        long hashCode3 = Objects.hashCode(new Customer("민철"));
        long hashCode4 = Objects.hashCode(new VIPCustomer("아이유"));

        // 1727805301
        // 2244
        // -679437325
        // 2634707
        System.out.println(hashCode);
        System.out.println(hashCode2);
        System.out.println(hashCode3);
        System.out.println(hashCode4);
    }
}
```

## HashMap, HashSet 내부 동작 원리

1. 객체 hashCode() 호출
2. Array 구조 size로 % 적용

## TreeMap, TreeSet 구현체

- BST 자료 구조 사용(= binary search Tree)
