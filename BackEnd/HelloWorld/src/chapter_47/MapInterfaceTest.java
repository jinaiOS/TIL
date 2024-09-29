package chapter_47;

import java.util.HashMap;
import java.util.Map;

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
