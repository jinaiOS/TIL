# Java array 복사와 다차원 array
## 다차원 배열

```java
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
```

```java
public class TwoDimensionAdd {
    public static void main(String[] args) {
        // [[27, 120, 50, 63], [90, 53, 441, 160], [100, 130, 410, 161]]
        int[][] arr1 = {
                {12, 100, 25, 33},
                {70, 23, 401, 110},
                {40, 65, 340, 81}
        };
        int[][] arr2 = {
                {15, 20, 25, 30},
                {20, 30, 40, 50},
                {60, 65, 70, 80}
        };

        int[][] resultArr = new int[3][4];
        for(int row = 0; row < 3; row++) {
            for(int col = 0; col < 4; col++) {
                resultArr[row][col] = arr1[row][col] + arr2[row][col];
            }
        }
        System.out.println(Arrays.deepToString(resultArr));
    }
}
```

## 복사

- 얕은 복사
    - 같은 물건에 여러 이름 붙이는 것
- 깊은 복사
    - 실제로 물건도 이름도 따로 만듬

### Java 리터럴과 객체 복사 차이

- java 리터럴: 유일한 상수여서 항상 값 자체가 복사 (깊은 복사)
- java 객체: 새로 만들어낸 물건

```java
public class ArrayCopy {
    public static void main(String[] args) {
        // 5
        // 10
        int a = 5;
        int b = a;

        b += 5;

        System.out.println(a);
        System.out.println(b);

        // Array
        // [10, 2, 3, 4]
        // [10, 2, 3, 4]
        int[] arr1 = {1,2,3,4};
        int[] arr2 = arr1;

        arr1[0] = 10;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
```

```java
public class ArrayCopyTwo {
    public static void main(String[] args) {
        // for loop
        // [100, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr1 = new int[arr.length];

        for(int i=0; i < arr.length; i++){
            arr1[i] = arr[i];
        }

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        int[] arr3 = arr.clone();

        arr[0] = 100;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}
```

```java
public class TwoDimensionArrayCopy {
    public static void main(String[] args) {
        // [[100, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
        // [[100, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
        // [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int[][] arr1 = arr.clone();
        int[][] arr2 = new int[3][];

        for (int row = 0; row < 3; row++) {
            arr2[row] = arr[row].clone();
        }

        arr[0][0] = 100;

        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(arr1));
        System.out.println(Arrays.deepToString(arr2));
    }
}
```

## Program Args

```java
public class CmdLineArgs {
    // gimjieun@gimjieun-ui-MacBookPro chapter_21 % java CmdLineArgs.java Hello World
    // 2
    // 첫 번째 인자는 :Hello
    // 두 번째 인자는 :World
    public static void main(String[] args) {
        // args
        System.out.println(args.length);

        System.out.printf("첫 번째 인자는 :%s\n", args[0]);
        System.out.printf("두 번째 인자는 :%s\n", args[1]);

    }
}
```
