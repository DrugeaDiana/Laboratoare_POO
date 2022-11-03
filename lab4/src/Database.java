import java.util.*;
import java.util.stream.Collectors;

public class Database {

    private final List<Student> students = new ArrayList<>();
    private final List<Teacher> teachers = new ArrayList<>();

    private static int counter;

    public static Database getDatabase() {
        if (instance == null) {
            instance = new Database();
            counter++;
        }
        return instance;
    }

    private static Database instance = null;

    private Database(){}
    public static int getNumberOfInstances() {
        return counter;
    }

    public void addTeachers(List<Teacher> teachers) {
        this.teachers.addAll(teachers);
    }

    public void addStudents(List<Student> students) {
        this.students.addAll(students);
    }

    public List<Teacher> findTeachersBySubject(String subject) {
        List<Teacher> new_list = new ArrayList<Teacher>();
        for (var Teacher: teachers) {
            if(Teacher.getSubjects().contains(subject)) {
                new_list.add(Teacher);
            }
        }
        return new_list;
    }

    public List<Student> findAllStudents() {
        return students;
    }

    public List<Teacher> findAllTeachers() {
        return teachers;
    }

    public List<Student> getStudentsBySubject(String subject) {
        List<Student> new_list= new ArrayList<Student>();
        for (var Student: students) {
            if(Student.getSubjects().containsKey(subject)) {
                new_list.add(new Student(Student));
            }
        }
        return new_list;
    }

    public List<Student> getStudentsByAverageGrade() {
        List<Student> new_list= new ArrayList<Student>();
        for (var Student: students) {
                new_list.add(new Student(Student));
        }
        new_list.sort(Comparator.comparing(Student::averageGrade));
        return new_list;
    }

    public List<Student> getStudentsByGradeForSubject(String subject) {
        List<Student> new_list = new ArrayList<Student>();
        for (var Student: students) {
            if(Student.getSubjects().containsKey(subject)) {
                new_list.add(new Student(Student));
            }
        }
        new_list.sort(Comparator.comparingInt(o -> o.getGradeForSubject(subject)));
        return new_list;
    }
}
