
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

import static java.time.ZoneId.systemDefault;

public class StudentList implements iStudentList {
    private Student[] students;
    private Scanner scanner = new Scanner(System.in);

    public Student addStudent() throws ParseException {
        System.out.println("Введите имя");
        String name = scanner.nextLine( );
        System.out.println("Введите фамилию");
        String surname = scanner.nextLine( );
        System.out.println("Введите день рождения в в виде yyyy/MM/dd HH:mm ");

        ZoneId defaultZoneId = systemDefault( );
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        Date date = formatter.parse(scanner.nextLine( ));// vhod
        Instant instant = date.toInstant( );
        LocalDateTime birthday = instant.atZone(defaultZoneId).toLocalDateTime( );

        return new Student(name, surname, birthday);
    }

    @Override
    public LocalDateTime getDate() {
        return null;
    }

    @Override
    public LocalDateTime getAveregeAge(Student[] students) {
        LocalDateTime date;
        int year = 0;
        int month = 0;
        int day = 0;
        int hour = 0;
        int minute = 0;
        for (int i = 0; i < students.length; i++) {
            date = LocalDateTime.parse(students[i].getDate( ).toString( ));
            year += date.getYear( );
            month += date.getMonthValue( );
            day += date.getDayOfMonth( );
            hour += date.getHour( );
            minute += date.getMinute( );
        }
        LocalDateTime current = LocalDateTime.now( );
        year = Math.abs(current.getYear( ) - year / students.length);
        month = Math.abs(current.getMonthValue( ) - month / students.length);
        day = Math.abs(current.getDayOfMonth( ) - day / students.length);
        hour = Math.abs(current.getHour( ) - hour / students.length);
        minute = Math.abs(current.getMinute( ) - minute / students.length);
        LocalDateTime dateTime = LocalDateTime.of(year, month, day, hour, minute);
        return dateTime;
    }

    public void addStudents() throws ParseException {
        students = new Student[1];
        for (int i = 0; i < students.length; i++) {
            students[i] = addStudent( );
        }
    }

    public Student[] getStudents() {
        return students;
    }
}
