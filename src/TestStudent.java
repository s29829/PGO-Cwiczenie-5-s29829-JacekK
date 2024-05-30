import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.Test;

import java.util.Date;

public class TestStudent {

    Student student01 = new Student("John", "Doe", "doe@wp.pl", "Warsaw, Zlota 12", "333-322-222", new Date(1980, 1, 1));
    StudyProgramme it = new StudyProgramme("IT", "AAA", 2, 5);


    @Test
    public void testStudents() {
        student01.addGrade(5, "PGO");
        student01.addGrade(2, "APBD");
        Assertions.assertEquals("candidate",student01.getStatus());
        student01.enrollStudent(it);
        Assertions.assertEquals("doe@wp.pl", student01.getEmail());
        Assertions.assertEquals("Warsaw, Zlota 12", student01.getAddress());
        Assertions.assertEquals("student",student01.getStatus());
    }

    @Test
    public void testPromoteToNextSemester() {
        student01.addGrade(2, "APBD");
        student01.enrollStudent(it);
        student01.promoteToNextSemester();
        Assertions.assertEquals(student01.getSemester(),1);
        student01.addGrade(5, "PGO");
        student01.promoteToNextSemester();
        Assertions.assertEquals(student01.getSemester(),2);
    }
}
