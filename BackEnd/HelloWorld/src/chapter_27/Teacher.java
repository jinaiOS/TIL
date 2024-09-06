package chapter_27;

public class Teacher {
    // 학교 정보
    public String schoolName;

    // 과목
    public Subject subject;

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

    public Teacher(String pName, String pGender, String pSubjectName, String pSubjectCode) {
        name = pName;
        gender = pGender;

        Subject newSubject = new Subject();
        newSubject.setSubjectName(pSubjectName);
        newSubject.setSubjectCode(pSubjectCode);

        subject = newSubject;
    }

    // getter
    public String getName() {
        return name;
    }
}
