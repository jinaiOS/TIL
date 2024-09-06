package Question.NaverCloud.Week2Day2;

public class StudentManagementSystem {
    private Student[] students;
    private int count;

    StudentManagementSystem(int count) {
        this.students = new Student[count];
        this.count = 0;
    }

    public void addStudent(Student student) {
        if (count < students.length) {
            students[count] = student;
            count++;
        } else {
            System.out.println("Student is over");
        }
    }

    public void searchStudent(int index) {
        if (index >= 0 && index < count) {
            Student student = students[index];
            System.out.println(student);
        } else {
            System.out.println("Student not found");
        }
    }

    public void removeStudent(Student student) {
        for (int i = 0; i < count; i++) {
            if (students[i].equals(student)) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[count - 1] = null;
                count--;
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student not found");
    }
}
