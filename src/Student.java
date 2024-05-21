import java.util.Date;

public class Student {

    private String name, surename, email, address, phoneNumber, status;
    private int yearOfBirth, montOfBirth, dayOfBirth;
    private Date dateOfBirth;
    private String[] statuses = new String[]{"candidate", "student", "graduate"};


    public Student(String name, String surename, String email, String address, String phoneNumber, Date dateOfBirth) {
        setName(name);
        setSurename(surename);
        setEmail(email);
        setAddress(address);
        setPhoneNumber(phoneNumber);
        setDateOfBirth(dateOfBirth);
        setStatus("candidate");
        Students.addStudents(this);
    }

    public String getStatus() {
        return status;
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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void enrollStudent(StudyProgramme studyProgramme) {

    }

    public void addGrade(int grade, String subject) {
    }
}
