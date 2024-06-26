import stream.Potok;
import stream.StreamComparator;
import stream.StreamService;
import students.Student;
import students.StudentsGroup;

import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Student student = new Student(1,"John",22);
        Student student2 = new Student(2,"Ben",23);
        Student student3 = new Student(3,"Jane",24);
        Student student4 = new Student(4,"Syuzn",25);
        Student student5 = new Student(5,"Mike",26);
        Student student6 = new Student(6,"Ron",27);
        Student student7 = new Student(7,"Jack",28);
        Student student8 = new Student(8,"Anna",29);
        Student student9 = new Student(9,"Garry",30);

        StudentsGroup sg1 = new StudentsGroup();

        sg1.addStudent(student);
        sg1.addStudent(student2);
        sg1.addStudent(student3);

        StudentsGroup sg2 = new StudentsGroup();

        sg2.addStudent(student4);
        sg2.addStudent(student5);
        sg2.addStudent(student6);
        sg2.addStudent(student7);

        StudentsGroup sg3 = new StudentsGroup();

        sg3.addStudent(student8);
        sg3.addStudent(student9);

        Potok potok1 = new Potok();

        potok1.addStudentsGroup(sg1);
        potok1.addStudentsGroup(sg2);
        potok1.addStudentsGroup(sg3);

        StreamComparator comparator = new StreamComparator();


        System.out.println("Before sorting:");
        for (StudentsGroup group : potok1) {
            System.out.println(group);
        }


        potok1.getStudentsGroups().sort(comparator);

        System.out.println("до сортировки:");
        for (StudentsGroup group : potok1) {
            System.out.println(group);
        }

        Student student10 = new Student(10,"John",22);
        Student student11 = new Student(11,"Ben",23);
        Student student12 = new Student(12,"Jane",24);
        Student student13 = new Student(13,"Syuzn",25);
        Student student14 = new Student(14,"Mike",26);
        Student student15 = new Student(15,"Ron",27);


        StudentsGroup sg4 = new StudentsGroup();

        sg4.addStudent(student10);
        sg4.addStudent(student11);
        sg4.addStudent(student12);
        sg4.addStudent(student13);
        sg4.addStudent(student14);

        StudentsGroup sg5 = new StudentsGroup();

        sg5.addStudent(student15);


        Potok potok2 = new Potok();

        potok2.addStudentsGroup(sg4);
        potok2.addStudentsGroup(sg5);

        StreamService course = new StreamService();

        course.addPotoks(List.of(potok1,potok2));


        System.out.println("до сортировки:");
        for (Potok potok : course.getPotoks()) {
            System.out.println(potok);
        }

        course.getPotoks().sort(new StreamService());

        System.out.println("после соритровки:");
        for (Potok potok : course.getPotoks()) {
            System.out.println(potok);
        }

        course.removeStudentById(11);

        System.out.println("---------------------------------------");
        System.out.println("после удаления студента по id:");
        for (Potok potok : course.getPotoks()) {
            System.out.println(potok);
        }
    }
}
