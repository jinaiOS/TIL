package Question.Snow.Week1Day4;

abstract class ElderGroupCollegeStudent extends CollegeStudent {
    public ElderGroupCollegeStudent(String studentNumber, String name, double gpa) {
        super(studentNumber, name, gpa);
    }

    @Override
    public String toString() {
        return "ElderGroupCollegeStudent{" + "studentNumber='" + studentNumber + "', name='" + name + "', gpa=" + gpa + '}';
    }
}
