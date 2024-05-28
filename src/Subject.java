public class Subject {

    private String name, shortCode, description;
    private int maxGrade = 19;
    private int[] grade = new int[maxGrade];
    private int countGrade = 0;

    public Subject(String name, String shortCode, String description) {
        setName(name);
        setShortCode(shortCode);
        setDescription(description);
    }

    public Subject(String name, String shortCode) {
        setName(name);
        setShortCode(shortCode);
    }

    public Subject(String name) {
        setName(name);
    }

    public void addGrade(int grade) {
        if (countGrade >= maxGrade) {
            this.grade[countGrade++] = grade;
        }
    }

    public double getAverageGrade() {

        for (int i = 0; i < countGrade; i++) {

        }
        return 0;
    }

    public void setGrade(int grade) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
