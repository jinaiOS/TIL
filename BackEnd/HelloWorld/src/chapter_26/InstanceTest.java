package chapter_26;

import chapter_25.Student;
import chapter_25.Subject;
import chapter_25.Teacher;

public class InstanceTest {
    public static void main(String[] args) {
        // null
        // null
        // 0
        // Bob
        // Male
        // School
        // jina
        // 1
        // 12
        Student student1 = new Student("happy", 1, 12, 20, "jina");
        System.out.println(student1.name);
        System.out.println(student1.classYear);
        System.out.println(student1.classroomNumber);

        student1.name = "Bob";
        student1.gender = "Male";
        student1.schoolName = "School";
        student1.classYear = 1;
        student1.classroomNumber = 3;
        student1.studentNumber = 20;

        System.out.println(student1.name);
        System.out.println(student1.gender);
        System.out.println(student1.schoolName);

        // Alice
        // Female
        // School
//        Student student2 = new Student();
//        student2.name = "Alice";
//        student2.gender = "Female";
//        student2.schoolName = "School";
//        student2.classYear = 1;
//        student2.classroomNumber = 3;
//        student2.studentNumber = 15;
//
//        System.out.println(student2.name);
//        System.out.println(student2.gender);
//        System.out.println(student2.schoolName);
//
//        Student student3 = new Student();
//        Student student4 = new Student();

        // Tom
        // Female
        // AB001
        // korean
        Teacher teacher = new Teacher("Tom", "Female", "korean", "AB001");

//        teacher.name = "Tom";
//        teacher.gender = "Female";
//        teacher.schoolName = "School";
//
//        // subject 선행해서 만들어줌
//        Subject koreanSubject = new Subject();
//        koreanSubject.subjectName = "Korean";
//        koreanSubject.subjectCode = "AB001";

//        teacher.subject = koreanSubject;
        System.out.println(teacher.name);
        System.out.println(teacher.gender);
        System.out.println(teacher.subject.subjectCode);
        System.out.println(teacher.subject.subjectName);
    }
}
