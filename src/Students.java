import java.util.Date;

public class Students {

    String nameStudetn, surenameStudent, emailStudent, addressStudent, phoneNumberStudent ;
    int year,mont,date;
    Date dateofBirthStudent = new Date(year, mont, date);

   // Student s=new Student("John", "Doe", "doe@wp.pl", "Warsaw, Zlota 12", "333-322-222", new Date(1980, 1, 1));


    public Students(String nameStudetn, String surenameStudent, String emailStudent, String addressStudent, String phoneNumberStudent, Date dateofBirthStudent) {
        this.nameStudetn = nameStudetn;
        this.surenameStudent = surenameStudent;
        this.emailStudent = emailStudent;
        this.addressStudent = addressStudent;
        this.phoneNumberStudent = phoneNumberStudent;
        this.dateofBirthStudent = dateofBirthStudent;
    }

    public static void promoteAllStudents() {
    }

    public static void displayInfoAboutAllStudents() {
    }
}
