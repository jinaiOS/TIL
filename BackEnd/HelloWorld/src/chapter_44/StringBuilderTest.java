package chapter_44;

public class StringBuilderTest {
    public static void main(String[] args) {
        // +=
        String str = "";

        long startTime = System.currentTimeMillis();

        for(int i=0; i < 5000; i++){
            str += "Cat";
        }
        System.out.println(str);

        long endTime = System.currentTimeMillis();
        // String 걸린 시간: 52ms
        System.out.println("String 걸린 시간: " + (endTime - startTime) + "ms");

        //////
        // string builder
        long startTime2 = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();

        for(int i=0; i < 5000; i++){
            sb.append("Cat");
        }

        String output = sb.toString();
        System.out.println(output);

        long endTime2 = System.currentTimeMillis();
        // SB 걸린 시간: 1ms
        System.out.println("SB 걸린 시간: " + (endTime2 - startTime2) + "ms");

    }
}
