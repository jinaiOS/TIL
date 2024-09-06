package chapter_28;

public class Student {
    // 속성
    private String schoolName;
    private int classYear; // 몇 학년
    private int classroomNumber; // 몇 반
    private int studentNumber; // 몇 번

    // 기본 정보
    public String name;
    public String gender;

    // 행위
    public void study(Teacher teacher, String subjectName) {
        String teacherName = teacher.getName();
        System.out.printf("학생: 저는 %s 선생님에게 %s 과목을 배웁니다.\n", teacherName, subjectName);
    }

    // 생성자
    Student() {

    }

    Student(String schoolName, int classYear, int classroomNumber, int studentNumber, String name) {
        this.schoolName = schoolName;
        this.classYear = classYear;
        this.classroomNumber = classroomNumber;
        this.studentNumber = studentNumber;
        this.name = name;
    }
}
