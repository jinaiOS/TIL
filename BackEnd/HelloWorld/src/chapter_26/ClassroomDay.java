package chapter_26;

import chapter_25.Student;
import chapter_25.Teacher;

public class ClassroomDay {
    public static void main(String[] args) {
        Student student1 = new Student("school", 1, 2, 3, "jina");
        Student student2 = new Student("school", 1, 3, 8, "Alice");
        Student student3 = new Student("school", 1, 4, 2, "Novah");
        Student student4 = new Student("school", 1, 1, 15, "Brooks");

        Teacher teacher = new Teacher("James", "Female", "Korean", "001");

        String subjectName = "국어";

        // 선생: 저는 jina 학생에게 국어 과목을 가르칩니다.
        // 학생: 저는 James 선생님에게 국어 과목을 배웁니다.
        // 선생: 저는 Alice 학생에게 국어 과목을 가르칩니다.
        // 학생: 저는 James 선생님에게 국어 과목을 배웁니다.
        // 선생: 저는 Novah 학생에게 국어 과목을 가르칩니다.
        // 학생: 저는 James 선생님에게 국어 과목을 배웁니다.
        // 선생: 저는 Brooks 학생에게 국어 과목을 가르칩니다.
        // 학생: 저는 James 선생님에게 국어 과목을 배웁니다.
        teacher.teach(student1, subjectName);
        student1.study(teacher, subjectName);

        teacher.teach(student2, subjectName);
        student2.study(teacher, subjectName);

        teacher.teach(student3, subjectName);
        student3.study(teacher, subjectName);

        teacher.teach(student4, subjectName);
        student4.study(teacher, subjectName);
    }
}
