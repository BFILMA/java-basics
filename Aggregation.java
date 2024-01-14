import java.util.HashSet;
import java.util.Set;

public class Aggregation {
    public static void main(String[] args) {
        Student s = new Student();
        Set<Student> students = new HashSet<>();
        students.add(s);
        Department d = new Department(students);
        System.out.println(d.students);
    }
}
