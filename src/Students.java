import java.util.ArrayList;
import java.util.Date;

public class Students {


    private static ArrayList<Student> students = new ArrayList<>();


    public static void promoteAllStudents() {
        for (Student student : students) {
            if (student.)student.
        }
    }

    public static void addStudents(Student student) {
        students.add(student);
    }

    public int getStudentsIndex() {
        return students.size();
    }

    public static void displayInfoAboutAllStudents() {
        for (Student student : students) {
            System.out.println(student.getName() +" | "+ student.getEmail());
        }
    }
}
