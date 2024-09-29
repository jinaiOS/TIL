package chapter_50;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchTest3 {
    public static void main(String[] args) {
        try {
            FileInputStream fs = new FileInputStream("src/chapter_50/test.txt");
            int i;
            while((i=fs.read()) !=-1) {
                System.out.write(i);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
