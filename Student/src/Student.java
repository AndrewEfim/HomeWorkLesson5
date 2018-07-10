import java.time.LocalDateTime;

public class Student implements iStudentList {
    private String name;
    private String surname;
    private LocalDateTime birthday;

    public Student(String name, String surname, LocalDateTime birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    @Override
    public Student addStudent() {
        return null;
    }

    @Override
    public LocalDateTime getDate() {
        return birthday;
    }

    @Override
    public LocalDateTime getAveregeAge(Student[] students) {
        return null;
    }
}
