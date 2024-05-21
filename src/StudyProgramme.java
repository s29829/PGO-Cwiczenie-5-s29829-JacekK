public class StudyProgramme {

    private String subject, aa;
    private int numberOfSemestr, numberOfPossibleITN;

    //         StudyProgramme it = new StudyProgramme("IT", "AAA", 7, 5);

//    StudyProgramme it = new StudyProgramme("IT", "AAA", 7, 5);
    //7 is the number of semesters, 5 - number of possible ITN's before being allowed to be promoted to next semester

    public StudyProgramme(String subject, String aa, int numberOfSemestr, int numberOfPossibleITN) {
        this.subject = subject;
        this.aa = aa;
        this.numberOfSemestr = numberOfSemestr;
        this.numberOfPossibleITN = numberOfPossibleITN;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAa() {
        return aa;
    }

    public void setAa(String aa) {
        this.aa = aa;
    }

    public int getNumberOfSemestr() {
        return numberOfSemestr;
    }

    public void setNumberOfSemestr(int numberOfSemestr) {
        this.numberOfSemestr = numberOfSemestr;
    }
}
