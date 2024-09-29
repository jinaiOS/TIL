package Question.Snow.Week1Day4;

class Sophomore extends YoungGroupCollegeStudent {
    public Sophomore(String studentNumber, String name, double gpa) {
        super(studentNumber, name, gpa);
    }

    @Override
    public String toString() {
        return "Sophomore{" + "studentNumber='" + studentNumber + "', name='" + name + "', gpa=" + gpa + '}';
    }
}
