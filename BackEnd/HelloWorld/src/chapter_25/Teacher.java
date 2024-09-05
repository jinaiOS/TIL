package chapter_25;

public class Teacher {
    // 학교 정보
    public String schoolName;

    // 과목
    public Subject subject;

    // 기본 정보
    public String name;
    public String gender;

    // 행위
    void teach(Student student, String subjectName) {
        String studentName = student.name;
        System.out.printf("선생: 저는 %s 학생에게 %s 과목을 가르칩니다.", studentName, subjectName);
    }

    Teacher() {

    }

    public Teacher(String pName, String pGender, String pSubjectName, String pSubjectCode) {
        name = pName;
        gender = pGender;

        Subject newSubject = new Subject();
        newSubject.subjectName = pSubjectName;
        newSubject.subjectCode = pSubjectCode;

        subject = newSubject;
    }
}
