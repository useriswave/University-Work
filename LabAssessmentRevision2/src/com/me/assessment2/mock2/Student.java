package com.me.assessment2.mock2;

public class Student extends Person implements Validatable{
    private int studentId;
    private double gpa;

    public Student(double g, int id,String n, int a) {
        super(n, a);
        this.gpa = g;
        this.studentId = id;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return super.toString() + ", student id: " + studentId + ", gpa: " + gpa;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null || this.getClass() != o.getClass()) return false;
        return this.studentId == (((Student)o).getStudentId());
    }

    @Override
    public String getDescription() {
        return "Student: " + getName() + "'s GPA is: " + gpa;
    }

    @Override
    public boolean validate() {
        return gpa >= 0 && gpa <= 4;
    }
}
