package chapter_46;

import java.util.ArrayList;
import java.util.List;

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
