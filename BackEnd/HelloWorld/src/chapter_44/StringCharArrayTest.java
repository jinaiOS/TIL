package chapter_44;

public class StringCharArrayTest {
    public static void main(String[] args) {
        // CharArray -> String
        char[] chars = {'a', 'b', 'c'};

        //
        String str1 = new String(chars);
        String str2 = String.valueOf(chars);

        // abc
        // abc
        System.out.println(str1);
        System.out.println(str2);

        // String -> CharArray
        // a
        // b
        // c
        char[] chars2 = str1.toCharArray();
        for (char ch: chars2) {
            System.out.println(ch);
        }

        // a
        // b
        // c
        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(1));
        System.out.println(str1.charAt(2));
        System.out.println(str1.charAt(3));
    }
}
