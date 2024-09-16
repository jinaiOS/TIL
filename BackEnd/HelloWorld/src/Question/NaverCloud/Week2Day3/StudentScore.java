package Question.NaverCloud.Week2Day3;

import java.util.Arrays;

public class StudentScore {

    // static
    private static int serialIndex = 0;
    private static int[] allScores;

    private int myIndex;
    private int score;

    public static int[] getAllScores() {
        return allScores;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        allScores[myIndex] = score;
        this.score = score;
    }

    public StudentScore(int score) {
        if (serialIndex == 0) {
            allScores = new int[serialIndex];
        }
        this.score = score;
        this.myIndex = serialIndex;
        addAllScore(score);
        serialIndex++;
    }

    private static void addAllScore(int score) {
        allScores = Arrays.copyOf(allScores, allScores.length + 1);
        allScores[allScores.length - 1] = score;
    }
}