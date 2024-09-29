package chapter_47;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
