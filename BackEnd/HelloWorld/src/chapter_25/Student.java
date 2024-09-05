package chapter_25;

public class Student {
    // 속성
    public String schoolName;
    public int classYear; // 몇 학년
    public int classroomNumber; // 몇 반
    public int studentNumber; // 몇 번

    // 기본 정보
    public String name;
    public String gender;

    // 행위
    void study(Teacher teacher, String subjectName) {
        String teacherName = teacher.name;
        System.out.printf("학생: 저는 %s 선생님에게 %s 과목을 배웁니다.", teacherName, subjectName);
    }

    // 생성자
    Student() {

    }

    public Student(String schoolName, int classYear, int classroomNumber, int studentNumber, String name) {
        this.schoolName = schoolName;
        this.classYear = classYear;
        this.classroomNumber = classroomNumber;
        this.studentNumber = studentNumber;
        this.name = name;
    }
}
