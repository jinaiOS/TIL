package chapter_21;

import java.util.Arrays;

public class TwoDimensionArray1 {
    public static void main(String[] args) {
        // 2d array
        int[][] arr1 = new int[10][5];

        // 2d array
        // [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]
        // [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
        int[][] arr2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));

        // indexing
        // 3
        // 12
        int myInt = arr2[0][2];
        int myInt2 = arr2[2][3];

        System.out.println(myInt);
        System.out.println(myInt2);

        // indexing update
        // [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 20]]
        arr2[2][3] = 20;

        System.out.println(Arrays.deepToString(arr2));

        // for loop
        // 1 2 3 4
        // 5 6 7 8
        // 9 10 11 20
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 4; col++) {
                System.out.printf("%d ", arr2[row][col]);
            }
            System.out.println();
        }
    }
}
