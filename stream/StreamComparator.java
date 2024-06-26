package stream;

import students.StudentsGroup;

import java.util.Comparator;

public class StreamComparator implements Comparator<StudentsGroup> {


    @Override
    public int compare(StudentsGroup o1, StudentsGroup o2) {
        return Integer.compare(o1.size(), o2.size());
    }
}
