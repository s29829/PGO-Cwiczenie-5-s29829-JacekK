import java.util.Date;

public class Student {

    private String name, surename, email, address, phoneNumber;
    private int year,mont,date;
    private Date dateOfBirth;


    public Student(String name, String surename, String email, String address, String phoneNumber, Date dateOfBirth) {
        this.name = name;
        this.surename = surename;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public void enrollStudent(StudyProgramme it) {
    }

    public void addGrade(int i, String pgo) {
    }
}
