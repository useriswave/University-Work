package session4.complexinheritance;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int[][] matrix = {
                { 9, 8, 7 },
                { 6, 5, 4 },
                { 3, 2, 1 }
        };
        process(matrix);
        System.out.println(Arrays.deepToString(matrix));

    }

    public static void process(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (!(i == j || i + j == matrix.length - 1))
                    matrix[i][j] = 0;
            }
        }
    }
}

abstract class Animal implements Speakable
{
    private String name;
    int age;

    public Animal(String name, int age) { this.name = name; this.age = age; }
    public Animal() {}

    public String getName() { return name; }
    public int getAge() { return age; }
    public void printIdentity() {
        if (name == null && age == 0)
            throw new RuntimeException("Name and age are not initialized");

        System.out.println("Name: " + name + ", age: " + age);
    }

    @Override
    public void speak() {
        System.out.println("Animal speaking!");
    }
}

class Dog extends Animal
{
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {}
}
class Cat extends Dog {
    public Cat(String name, int age) {
        super(name, age);
    }
    public Cat() {}
}
class Bird extends Cat {
    public Bird(String name, int age) {
        super(name, age);
    }

    public Bird() {}
}

class Parrot extends Bird {
    public Parrot(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("Parrot speaking and i extend Bird BTW!");
    }
    public Parrot() {}
}

interface Speakable
{
    public void speak();
}