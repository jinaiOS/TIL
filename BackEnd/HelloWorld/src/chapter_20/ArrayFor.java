package chapter_20;

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
