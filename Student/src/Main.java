import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        StudentList studentList = new StudentList( );
        studentList.addStudents( );
        System.out.println(studentList.getAveregeAge(studentList.getStudents( )));

    }
}
