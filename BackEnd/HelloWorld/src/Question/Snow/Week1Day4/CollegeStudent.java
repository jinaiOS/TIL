package Question.Snow.Week1Day4;

abstract class CollegeStudent {
    protected String studentNumber;
    protected String name;
    protected double gpa;

    public CollegeStudent(String studentNumber, String name, double gpa) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.gpa = gpa;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "CollegeStudent{" + "studentNumber='" + studentNumber + "', name='" + name + "', gpa=" + gpa + '}';
    }
}
