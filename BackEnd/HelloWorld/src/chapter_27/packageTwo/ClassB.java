package chapter_27.packageTwo;

import chapter_27.packageOne.ClassA;

public class ClassB {
    public void testPublic(ClassA classA) {
        String str = classA.publicStr;
        classA.methodPublic();
    }

    // error
//    void testPrivate(ClassA classA) {
//        String str = classA.privateStr;
//        classA.methodPrivate();
//    }

    // error
//    public void testDefault(ClassA classA) {
//        String str = classA.defaultStr;
//        classA.methodDefault();
//    }
}
