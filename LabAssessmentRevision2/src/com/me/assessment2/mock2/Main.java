package com.me.assessment2.mock2;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(3.4, 1234, "Harold", 90);
        Student student2 = new Student(2.6, 8429, "Jerry", 26);
        Instructor instructor1 = new Instructor("dept of whatever", 30, "Toilet", 67);
        Instructor instructor2 = new Instructor("dept of something", 15, "Water", 54);

        Person people[] = {student1, student2, instructor1, instructor2};

        int i = 0;
        for(Person p : people) {
            System.out.println("TO STRING: " + p);
            System.out.println("DESCRIPTION: " + p.getDescription());
            System.out.println("VALID: " + ((Validatable)p).validate());
            // ADDITIONAL EQUALS METHOD PRINTING JUST FOR TESTING PURPOSES
            if(i < people.length-1) {
                System.out.println("EQUALS? " + p.equals(people[i+1]));
                i++;
            }
            System.out.println("----------");
        }

        System.out.println(student2.equals(student1));
        System.out.println(instructor2.equals(instructor1));
    }
}
