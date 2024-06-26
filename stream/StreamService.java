package stream;

import students.Student;
import students.StudentsGroup;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Iterator;


public class StreamService implements Comparator<Potok> {

    private List<Potok> potoks;

    public StreamService() {
        this.potoks = new ArrayList<>();
    }

    public void addPotoks(List<Potok> potok){
        potoks.addAll(potok);
    }
    public List<Potok> getPotoks() {
        return potoks;
    }

    public boolean removeStudentById(int studentId) {
        for (Potok potok : potoks) {
            for (StudentsGroup group : potok) {
                Iterator<Student> iterator = group.getStudents().iterator();
                while (iterator.hasNext()) {
                    Student student = iterator.next();
                    if (student.getId() == studentId) {
                        iterator.remove();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return potoks.toString();


    }

    @Override
    public int compare(Potok p1, Potok p2) {
        int size1 = p1.getStudentsGroups().stream().mapToInt(StudentsGroup::size).sum();
        int size2 = p2.getStudentsGroups().stream().mapToInt(StudentsGroup::size).sum();
        return Integer.compare(size1, size2);
    }


}
