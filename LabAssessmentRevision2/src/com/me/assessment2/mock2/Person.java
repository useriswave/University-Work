package com.me.assessment2.mock2;

public abstract class Person {
    private String name;
    private int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "name: " + name + ", age: " + age;
    }

    public abstract String getDescription();

    @Override
    public boolean equals(Object o) {
        if(o == null || this.getClass() != o.getClass()) return false;
        return this.name.equals(((Person)o).getName());
    }
}
