package chapter_27.packageOne;

public class ClassAA {
    void testPublic(ClassA classA) {
        String str = classA.publicStr;
        classA.methodPublic();
    }

    // error
//    void testPrivate(ClassA classA) {
//        String str = classA.privateStr;
//        classA.methodPrivate();
//    }

    public void testDefault(ClassA classA) {
        String str = classA.defaultStr;
        classA.methodDefault();
    }
}
