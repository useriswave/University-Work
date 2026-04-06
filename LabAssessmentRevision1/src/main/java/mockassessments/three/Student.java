package mockassessments.three;

import java.util.ArrayList;

public class Student {
    private String name;
    private String major;
    private ArrayList<Course> courses;
    private static final int MAX_CREDITS = 15;

    public Student(String name, String major, ArrayList<Course> courses) {
        this.name = name;
        this.major = major;
        this.courses = new ArrayList<Course>();
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public int totalCredits() {
        int total = 0;
        for(Course c : courses) {
            total += c.getCredits();
        }
        return total;
    }

    public boolean registerCourse(Course course) {
        if(course.getOffered() && this.totalCredits() + course.getCredits() <= MAX_CREDITS) {
            this.courses.add(course);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
       return "name: " + name + ", major: " + major + ", courses: " + courses + ", total credits: " + totalCredits();
    }
}
