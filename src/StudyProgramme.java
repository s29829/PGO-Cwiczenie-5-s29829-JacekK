public class StudyProgramme {

    private String fieldOfStudy, description;
    private int numberOfSemestr, numberOfPossibleITN;

    //         StudyProgramme it = new StudyProgramme("IT", "AAA", 7, 5);
    //7 is the number of semesters, 5 - number of possible ITN's before being allowed to be promoted to next semester

    public StudyProgramme(String fieldOfStudy, String description, int numberOfSemestr, int numberOfPossibleITN) {
        setFieldOfStudy(fieldOfStudy);
        setDescription(description);
        setNumberOfSemestr(numberOfSemestr);
        setNumberOfPossibleITN(numberOfPossibleITN);
    }

    public int getNumberOfPossibleITN() {
        return numberOfPossibleITN;
    }

    public void setNumberOfPossibleITN(int numberOfPossibleITN) {
        this.numberOfPossibleITN = numberOfPossibleITN;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfSemestr() {
        return numberOfSemestr;
    }

    public void setNumberOfSemestr(int numberOfSemestr) {
        this.numberOfSemestr = numberOfSemestr;
    }
}
