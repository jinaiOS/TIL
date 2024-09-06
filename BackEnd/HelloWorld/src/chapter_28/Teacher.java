package chapter_28;

public class Teacher {
    // 학교 정보
    private String schoolName;

    // 과목
    private Subject subject;

    // 기본 정보
    private String name;
    private String gender;

    // 행위
    public void teach(Student student, String subjectName) {
        String studentName = student.name;
        System.out.printf("선생: 저는 %s 학생에게 %s 과목을 가르칩니다.\n", studentName, subjectName);
    }

    Teacher() {

    }

    public Teacher(String name, String gender, String subjectName, String subjectCode) {
        this.name = name;
        this.gender = gender;

        Subject subject = new Subject();
        subject.setSubjectName(subjectName);
        subject.setSubjectCode(subjectCode);

        this.subject = subject;
    }

    // getter
    public String getName() {
        return name;
    }
}
