import java.util.ArrayList;
import java.util.Date;

public class Student {

    private String name, surename, email, address, phoneNumber, status, indexNumber;
    private static int counter = 0;
    private Date dateOfBirth;
    private int dayOfBirth, monthOfBirth, yearOfBirth;
    private String[] statusLevel = new String[]{"candidate", "student", "graduate"};
    private StudyProgramme studyProgramme;
    private ArrayList<String> subjectList = new ArrayList<>();

    public Student(String name, String surename, String email, String address, String phoneNumber, Date dateOfBirth) {
        setName(name);
        setSurename(surename);
        setEmail(email);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setDateOfBirth(dateOfBirth);
        this.dayOfBirth = dateOfBirth.getDay();
        this.monthOfBirth = dateOfBirth.getMonth();
        this.yearOfBirth = dateOfBirth.getYear();
        setStatus(statusLevel[0]);
        setIndexNumber(++counter);

    }

    public void showStudentFullInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Surename: " + getSurename());
        System.out.println("Email: " + getEmail());
        System.out.println("Address: " + getAddress());
        System.out.println("PhoneNumber: " + getPhoneNumber());
        System.out.println("Status: " + getStatus());
        System.out.println("IndexNumber: " + getIndexNumber());
        System.out.println("Date of Birth: " + getDateOfBirth());
        System.out.println("Study Programe: " + studyProgramme.getFieldOfStudy());
    }

    public void showStudentInlineInfo() {
        System.out.println("Student: " + getName() + " | " + getSurename() + " | " + getEmail() + " | " + getAddress() + " | " + getPhoneNumber() + " | " + getStatus() + " | " + getIndexNumber() + " | " + getDateOfBirth() + " | " + studyProgramme.getFieldOfStudy());

    }

    public void getListOfSubjects() {

    }

    public int getSubjectNumber(String subject) {
        return 0;
    }

    public String getStatus() {
        return status;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int counter) {
        if (counter < 10) {
//            indexNumber = String.format("s0000%s", counter);
            this.indexNumber = "s0000" + counter;
        } else {
            if (counter < 100) {
                this.indexNumber = "s000" + counter;
            } else {
                if (counter < 1000) {
                    this.indexNumber = "s00" + counter;
                } else {
                    if (counter < 10000) {
                        this.indexNumber = "s0" + counter;
                    } else {
                        if (counter < 1000000) {
                            this.indexNumber = "s" + counter;
                        } else {
                            if (counter < 1000000000) {
                                this.indexNumber = "s" + counter;
                            }
                        }
                    }
                }
            }
        }
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return String.format("%d/%d/%d", dayOfBirth, monthOfBirth, yearOfBirth);
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void enrollStudent(StudyProgramme studyProgramme) {
        this.studyProgramme = studyProgramme;
        this.status = statusLevel[1];
    }

    public void addGrade(int grade, String subject) {
    }
}
