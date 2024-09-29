package Question.Snow.Week1Day4;

class Junior extends ElderGroupCollegeStudent {
    public Junior(String studentNumber, String name, double gpa) {
        super(studentNumber, name, gpa);
    }

    @Override
    public String toString() {
        return "Junior{" +
                "studentNumber='" + studentNumber + "', name='" + name + "', gpa=" + gpa + '}';
    }

}
