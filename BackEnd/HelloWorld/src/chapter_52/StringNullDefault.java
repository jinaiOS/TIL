package chapter_52;

public class StringNullDefault {
    public static void main(String[] args) {
        String str = null;

        try {
            int length = str.length();
            System.out.println(length);
        } catch (NullPointerException e) {
            System.out.println(e);
            str = "";
            int length = str.length();
            System.out.println(length);
        }
    }
}
