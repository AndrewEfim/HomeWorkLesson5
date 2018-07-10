import java.text.ParseException;
import java.time.LocalDateTime;

public interface iStudentList {
    Student addStudent() throws ParseException;

    LocalDateTime getDate();

    LocalDateTime getAveregeAge(Student[] students);


}
