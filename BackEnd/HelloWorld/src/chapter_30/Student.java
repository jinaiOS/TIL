package chapter_30;

import chapter_28.Teacher;

public class Student {
    private static int serialNum = 1;
    static String city = "Seoul";

    // 속성
    private String schoolName;
    private int classYear; // 몇 학년
    private int classroomNumber; // 몇 반
    private int studentNumber; // 몇 번

    private int studentId; // student 고유 ID

    // 기본 정보
    public String name;
    public String gender;

    // 정적 메소드
    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int num) {
        serialNum = num;
    }

    // 행위
    public void study(Teacher teacher, String subjectName) {
        String teacherName = teacher.getName();
        System.out.printf("학생: 저는 %s 선생님에게 %s 과목을 배웁니다.\n", teacherName, subjectName);
    }

    public void printMyInfo() {
        System.out.printf("[Student] schoolName: %s, classYear: %d, classroomNumber: %d, studentNumber: %d, studentId: %d\n", schoolName, classYear, classroomNumber, studentNumber, studentId);
    }

    // 생성자
    Student() {

    }

    Student(String name, String gender) {
        this.schoolName = "school";
        this.name = name;
        this.gender = gender;
    }

    Student(String schoolName, int classYear, int classroomNumber, int studentNumber, String name) {
        this.studentId = serialNum++;
        this.schoolName = schoolName;
        this.classYear = classYear;
        this.classroomNumber = classroomNumber;
        this.studentNumber = studentNumber;
        this.name = name;
    }
}
