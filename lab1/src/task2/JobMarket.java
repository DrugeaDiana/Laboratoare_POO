package task2;

import java.util.ArrayList;
import java.util.List;

public class JobMarket {
    public static void main(String[] args) {
        /* task 2 */
        Student Gigel = new Student("Gigel", 10);
        Student Dorel = new Student("Dorel", 7);
        Student Marcel = new Student ("Marcel", 3);
        Student Ionel = new Student ("Ionel", 5);

        List<Student> students = new ArrayList<>();
        students.add(Gigel);
        students.add(Dorel);
        students.add(Marcel);
        students.add(Ionel);

        Internship Google = new Internship("Google", "8", students);
        Internship Amazon = new Internship("Amazon", "5", students);
        Internship Facebook = new Internship("Facebook", "2", students);
        Internship Microsoft = new Internship("Microsoft", "7", students);

        Google.chooseCandidatesForInterview();
        Amazon.chooseCandidatesForInterview();
        Facebook.chooseCandidatesForInterview();
        Microsoft.chooseCandidatesForInterview();

        Google.chooseCandidateRandomly();

        /* Task 3 */

        Student Maria = new Student("Maria", 8);
        Student Ioana = new Student("Maria", 8);

        if ( Maria.equals(Ioana)) {
            System.out.println("Same people");
        } else {
            System.out.println("Different people yet similar");
        }

        /* Task 4 */

        System.out.println("We have our boys " + Gigel.getName() + " " + Dorel.getName() + " "
                            + Ionel.getName() + " " + Marcel.getName());
    }
}
