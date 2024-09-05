package chapter_26;

public class Question {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] result1 = extendArray(arr1);
        System.out.println(java.util.Arrays.toString(result1));
    }

    /**
     * arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 정수 0을 추가하려고 합니다.
     * 정수 배열 arr이 매개변수로 받고 arr에 최소한의 개수로 0을 추가한 배열을 return 하는 함수를 만들어주세요.
     * ( 단, 이때 함수는 static으로 정의해야합니다. )
     */
    static int[] extendArray(int[] array) {
        int length = array.length;
        int nextPowerOfTwo = 1;

        while (nextPowerOfTwo < length) {
            nextPowerOfTwo *= 2;
        }

        int[] extendedArray = new int[nextPowerOfTwo];
        for (int i = 0; i < length; i++) {
            extendedArray[i] = array[i];
        }

        return extendedArray;
    }
}
