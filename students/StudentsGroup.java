package students;

import java.util.ArrayList;
import java.util.List;

public class StudentsGroup {

    protected List<Student> students;

    public StudentsGroup() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int size() {
        return students.size();
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return students.toString();
    }
}
