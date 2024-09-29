package chapter_50;

import java.util.ArrayList;
import java.util.List;

public class TryCatchTest2 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");
        stringList.add("Python");
        stringList.add(null);
        stringList.add("C++");

        // HELLO
        // WORLD
        // JAVA
        // PYTHON
        // NullPointerException
        // C++
        // IndexOutOfBoundsException
        for (int i = 0; i < stringList.size() + 5; i++) {
            try {
                String str = stringList.get(i);
                System.out.println(str.toUpperCase());
            } catch (NullPointerException e) {
                System.out.println("NullPointerException");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("IndexOutOfBoundsException");
                break;
            }
        }
    }
}
