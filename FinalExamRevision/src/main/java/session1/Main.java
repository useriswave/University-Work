package session1;

public class Main {
    public static void main(String[] args)
    {
        Dog a = new Dog("JAGFIOE", 3, false, 4930, "Caterpillar");

        System.out.println("Dog age: " + a.getAge());
        a.setAge(23095);
        System.out.println("Dog age: " + a.getAge());
        System.out.println("Dog breed: " + a.getBreed());
        System.out.println("Total animals created: " + a.getTotalAnimals());
    }
}