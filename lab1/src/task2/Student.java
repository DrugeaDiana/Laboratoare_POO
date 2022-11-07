package task2;

public class Student {
    private String name;
    private double grade;

    public Student (String _name, double _grade) {
        name = _name;
        grade = _grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }
}
