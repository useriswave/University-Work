package session3.mock1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an age: ");
        int age = sc.nextInt();

        try {
            System.out.println("Evaluating age...");

            Animal a = new Animal(age);

            System.out.println("Success!");
            System.out.println(a.getAge());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class Animal
{
    private int age;

    public Animal(int age) throws Exception
    {
        if (age < 0)
            throw new Exception("ERROR: Age cannot less than zero");

        this.age = age;
    }

    public int getAge() { return age; }
    public void setAge(int newAge) { this.age = newAge; }
}