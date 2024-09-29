package chapter_51;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryMultiCatchTest {
    public static void main(String[] args) {
        try {
            FileInputStream fs = new FileInputStream("src/chapter_51/test.txt");
            int i;
            while((i=fs.read()) !=-1) {
                System.out.write(i);
            }
        } catch (FileNotFoundException | NullPointerException e) {
            System.out.println(e);
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("항상 실행되는 영역");
        }
    }
}
