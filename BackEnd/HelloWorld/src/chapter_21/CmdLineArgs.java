package chapter_21;

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
