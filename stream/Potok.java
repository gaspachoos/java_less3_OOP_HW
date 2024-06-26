package stream;

import students.StudentsGroup;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Potok extends StudentsGroup implements Iterable<StudentsGroup>{

    private final List<StudentsGroup> studentsPotok;

    public Potok() {
        this.studentsPotok = new ArrayList<>();
    }

    public void addStudentsGroup(StudentsGroup students) {
        this.studentsPotok.add(students);
    }

    public List<StudentsGroup> getStudentsGroups() {
        return studentsPotok;
    }

    @Override
    public String toString() {
        return studentsPotok.toString();


    }

    @Override
    public Iterator<StudentsGroup> iterator() {
        return studentsPotok.iterator();
    }
}


