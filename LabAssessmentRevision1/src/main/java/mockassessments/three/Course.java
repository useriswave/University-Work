package mockassessments.three;

public class Course {
    private String code;
    private String name;
    private int credits;
    private boolean offered;

    public Course(String code, String name, int credits, boolean offered) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.offered = offered;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public boolean getOffered() {
        return offered;
    }

    @Override
    public String toString() {
        return "code: " + code + ", name: " + name + ", credits: " + credits + ", offered: " + offered;
    }
}
