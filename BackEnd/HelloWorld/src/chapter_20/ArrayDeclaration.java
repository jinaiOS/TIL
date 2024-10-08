package chapter_20;

import java.util.Arrays;

public class ArrayDeclaration {
    public static void main(String[] args) {
        // int []
        // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        // [1, 2, 3, 4, 5]
        // [1, 2, 3, 4, 5]
        int[] intArr = new int[10];
        int[] intArr2 = new int[]{1,2,3,4,5};
        int[] intArr3 = {1,2,3,4,5};

        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(intArr2));
        System.out.println(Arrays.toString(intArr3));

        // float[]
        // [0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0]
        // [1.5, 2.5, 3.5]
        float[] floatArr = new float[10];
        float[] floatArr2 = {1.5f, 2.5f, 3.5f};

        System.out.println(Arrays.toString(floatArr));
        System.out.println(Arrays.toString(floatArr2));

        // boolean - 기본 값은 false
        // [false, false, false, false, false]
        // [true, false, true]
        boolean[] booleanArr = new boolean[5];
        boolean[] booleanArr2 = {true, false, true};

        System.out.println(Arrays.toString(booleanArr));
        System.out.println(Arrays.toString(booleanArr2));

        // char String
        // [ ,  ,  ,  ,  ,  ,  ,  ,  ,  ]
        // [A, B, C]
        // [null, null, null, null, null, null, null, null, null, null]
        // [ABC, Hello, World]
        char[] charArr = new char[10];
        char[] charArr2 = {'A', 'B', 'C'};
        String[] stringArr = new String[10];
        String[] stringArr2 = {"ABC", "Hello", "World"};

        System.out.println(Arrays.toString(charArr));
        System.out.println(Arrays.toString(charArr2));
        System.out.println(Arrays.toString(stringArr));
        System.out.println(Arrays.toString(stringArr2));
    }
}
