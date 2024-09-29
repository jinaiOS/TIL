package chapter_46;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

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
