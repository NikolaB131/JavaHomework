package pr6;

public class Student implements Comparable<Student> {
    private int id;

    Student(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Student student) {
        return this.id - student.id;
    }
}
