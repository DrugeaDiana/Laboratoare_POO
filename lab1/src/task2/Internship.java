package task2;

import java.util.ArrayList;
import java.util.List;

public class Internship {
    private String name;
    private String minGrade;
    private List<Student> students = new ArrayList<>();

    public Internship (String _name, String _mingrade, List<Student> _list) {
        name = _name;
        minGrade = _mingrade;
        students = _list;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getMinGrade() {
        return minGrade;
    }

    public void setMinGrade(String minGrade) {
        this.minGrade = minGrade;
    }

    public String chooseCandidateRandomly(){
        int randomNumber = (int)(Math.random() * 3 + 1);
        return students.get(randomNumber).getName();
    }

    public void chooseCandidatesForInterview(){
        for (Student student : students) {
            if (student.getGrade() >= Integer.parseInt(minGrade))
                System.out.println("Candidate " + student.getName() + " got a phone interview at " + name);
        }
    }
}

