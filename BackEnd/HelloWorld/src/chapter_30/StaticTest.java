package chapter_30;

public class StaticTest {
    public static void main(String[] args) {
        // 클래스 변수
        // 1
        // Seoul
        int num = Student.getSerialNum();
        String city = Student.city;
        System.out.println(num);
        System.out.println(city);

        Student.setSerialNum(10);

        // 4명 만들어보기
        // [Student] schoolName: school, classYear: 0, classroomNumber: 0, studentNumber: 0, studentId: 0
        Student student1 = new Student("Alice", "Female");
        Student student2 = new Student("Bob", "Male");
        Student student3 = new Student("Carl", "Female");
        Student student4 = new Student("Dan", "Male");

        // 10
        int num4 = student4.getSerialNum();
        System.out.println(num4);

        student1.printMyInfo();
        student2.printMyInfo();
        student3.printMyInfo();
        student4.printMyInfo();
    }
}
