package session1;

public abstract class Animal
{
    private static int totalAnimals = 0;
    protected String name;
    protected int age;
    protected boolean isMammal;
    protected double weight;

    public Animal(String name, int age, boolean isMammal, double weight)
    {
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
        this.weight = weight;

        totalAnimals++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTotalAnimals() {
        return totalAnimals;
    }

    public abstract void makeSound();

    public String getName() {
        return name;
    }
}
