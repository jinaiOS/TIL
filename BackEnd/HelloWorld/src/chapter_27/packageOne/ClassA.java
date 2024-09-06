package chapter_27.packageOne;

public class ClassA {
    // public
    public String publicStr;

    // private
    private String privateStr;

    // default
    String defaultStr;

    public void methodPublic() {}

    private void methodPrivate() {}

    void methodDefault() {}

    void testPrivate() {
        String str = privateStr;
        methodPrivate();
    }
}
