package mockassessments.three;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Course english = new Course("ENGL102", "English", 32, false); // unregisterable
        Course math = new Course("MATH101", "Mathematics", 14, false); // unregisterable
        Course csis = new Course("CSIS204", "Computer Science and Information Systems", 12, true); // registerable
        Course physics = new Course("PHYS102", "Physics", 10, true); // registerable
        Course history = new Course("HIS101", "History", 16, true); // unregisterable

        var courses = new ArrayList<Course>();
        Collections.addAll(courses, english, math, csis, history, physics);

        Student s = new Student("Jerry", "Electrical Engineering", courses);
        s.registerCourse(math);
        s.registerCourse(english);
        System.out.println(s);

        s.registerCourse(csis);
        s.registerCourse(physics);
        s.registerCourse(history);

        System.out.println(s);

    }
}
