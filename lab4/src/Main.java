


public class Main {
    public static void main(String[] args) {

        final String PROGRAMMING_PARADIGMS = "Programming Paradigms";
        final String OBJECT_ORIENTED_PROGRAMMING = "Object Oriented Programming";
        final String DATA_STRUCTURES = "Data Structures";
        final String PARALLEL_AND_DISTRIBUTED_ALGORITHMS = "Parallel and Distributed Algorithms";
        final String COMPILERS = "Compilers";
        final String LOCAL_AREA_NETWORKS = "Local Area Networks";
        final String ALGORITHMS_DESIGN = "Algorithms Design";
        final String COMMUNICATION_PROTOCOLS = "Communication Protocols";
        final String OPERATING_SYSTEMS_USAGE = "Operating Systems Usage";
        final String LOGIC_DESIGN = "Logic Design";
        final String NUMERICAL_METHODS = "Numerical Methods";
        final String ALGORITHMS_ANALYSIS = "Algorithms Analysis";
        final String ASSEMBLY_LANGUAGE_PROGRAMMING = "Assembly Language Programming";
        final String FORMAL_LANGUAGES_AND_AUTOMATA = "Formal Languages and Automata";
        final String OPERATING_SYSTEMS = "Operating Systems";
        final String COMPUTER_SYSTEMS_ARCHITECTURE = "Computer Systems Architecture";
        final String COMPUTER_GRAPHICS = "Computer Graphics";
        final String WEB_PROGRAMMING = "Web Programming";
        final String COMPUTERS_PROGRAMMING = "Computers Programming";


        // uncomment these lines when testing the implementation

        // adding people to data base
        Helpers.addTeachers();
        Helpers.addStudents();
        // tests
        var testStudent = Database.getDatabase().findAllStudents().get(0);
        var testTeacher = Database.getDatabase().findAllTeachers().get(0);
        // for teacher
        System.out.println("Testing teacher functionalities");
        System.out.println(testTeacher.getAllTeachers());
        System.out.println("Testing teacher_by_subject functionalities");
        System.out.println(testTeacher.getTeachersBySubject(PROGRAMMING_PARADIGMS));
        System.out.println(testTeacher.getTeachersBySubject(DATA_STRUCTURES));
        System.out.println("Testing grab_students_from_Teachers functionalities");
        System.out.println(testTeacher.getAllStudents());
        // testing mutability for teachers
        System.out.println("Testing mutability");
        testTeacher.getAllStudents().get(0).setFirstName("Malone");
        System.out.println(testTeacher.getAllStudents());
        System.out.println(testTeacher.getStudentsBySubject(PROGRAMMING_PARADIGMS));
        System.out.println("Testing average??");
        System.out.println(testTeacher.getStudentsByAverageGrade());
        System.out.println(testTeacher.getStudentsByGradeForSubject(PROGRAMMING_PARADIGMS));
        System.out.println(testTeacher.getStudentsByGradeForSubject(COMPUTERS_PROGRAMMING));
        System.out.println(testTeacher.getStudentsByGradeForSubject(ASSEMBLY_LANGUAGE_PROGRAMMING));
        // for student
        System.out.println("Testing student functionalities");
        System.out.println(testStudent.getAllTeachers());
        System.out.println(testStudent.getTeachersBySubject(PROGRAMMING_PARADIGMS));
        System.out.println(testStudent.getTeachersBySubject(DATA_STRUCTURES));
        System.out.println(testStudent.getAllStudents());
        // testing immutability for students
        testStudent.getAllStudents().get(0).setFirstName("Ginel");
        // uncomment this, it should throw an error if getAllStudents() from Student is completely immutable
        // testStudent.getAllStudents().add(new Student(testStudent));
        // the data remains the same, without any updates from testStudent (no student named Ginel)
        System.out.println(testStudent.getAllStudents());
        System.out.println(testStudent.getStudentsBySubject(LOCAL_AREA_NETWORKS));
        System.out.println(testStudent.getStudentsByAverageGrade());
        System.out.println(testStudent.getStudentsByGradeForSubject(PROGRAMMING_PARADIGMS));
        System.out.println(testStudent.getStudentsByGradeForSubject(OPERATING_SYSTEMS));
        System.out.println(testStudent.getStudentsByGradeForSubject(COMMUNICATION_PROTOCOLS));
        // checking number of instances
        System.out.println(Database.getNumberOfInstances());

    }
}