package com.me.assessment2.mock2;

public class Instructor extends Person implements Validatable {
    private String department;
    private int yearsOfExperience;

    public Instructor(String department, int yearsOfExperience, String n, int a) {
        super(n, a);
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getDepartment() {
        return department;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    @Override
    public String toString() {
        return super.toString() + ", years of experience: " + yearsOfExperience + ", department: " + department;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null || getClass() != o.getClass()) return false;
        return this.department.equals(((Instructor)o).department) && this.yearsOfExperience == ((Instructor)o).yearsOfExperience;
    }

    @Override
    public String getDescription() {
        return "Instructor: " + getName() + " works at department: " + department;
    }

    @Override
    public boolean validate() {
        return yearsOfExperience >= 0;
    }
}
