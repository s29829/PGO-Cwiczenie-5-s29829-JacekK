import java.util.ArrayList;
import java.util.Date;

public class Students {


    private static ArrayList<Student> students = new ArrayList<>();


    public static void promoteAllStudents() {
    }

    public static int addStudents(Student student) {
        students.add(student);
        System.out.printf("Student added: %s", student);
        System.out.println("Student" + students.size() + " added");
        return students.size();

    }

    public int getStudentsIndex() {
        return students.size();
    }

    public static void displayInfoAboutAllStudents() {
        for (Student student : students) {
            System.out.println(student.getName() +" / "+ student.getEmail());
        }
    }
}
