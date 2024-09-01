# Java array
## array란

나열 되어 있는 전체가 하나의 변수로 선언 되는 것

```java
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
        // [, , , , , , , , , ]
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
```

## array 사용하기

```java
public class ArrayIndex {
    public static void main(String[] args) {
        // index get
        // {90, 87, 88, 75, 99, 65}

        int[] studentScores = {90, 87, 88, 75, 99, 65};
        int score1 = studentScores[0];

        System.out.println(score1);

        //
        studentScores[2] = 93;

        System.out.println(Arrays.toString(studentScores));

        // Error
//        int score6 = studentScores[6];
//
//        System.out.println(score6);
    }
}
```

```java
public class ArrayFor {
    public static void main(String[] args) {
        // 이 Array의 0 인덱스의 값은 90이다.
        // 이 Array의 1 인덱스의 값은 87이다.
        // 이 Array의 2 인덱스의 값은 88이다.
        // 이 Array의 3 인덱스의 값은 75이다.
        // 이 Array의 4 인덱스의 값은 99이다.
        // 이 Array의 5 인덱스의 값은 65이다.
        int[] studentScores = {90, 87, 88, 75, 99, 65};

        // for loop
        for (int i=0; i < studentScores.length; i++) {
            System.out.printf("이 Array의 %d 인덱스의 값은 %d이다.\n", i, studentScores[i]);
        }
        // 강화된 for loop
        // student의 값은 90이다.
        // student의 값은 87이다.
        // student의 값은 88이다.
        // student의 값은 75이다.
        // student의 값은 99이다.
        // student의 값은 65이다.
        for (int score: studentScores) {
            System.out.printf("student의 값은 %d이다.\n", score);
        }
    }
}
```
