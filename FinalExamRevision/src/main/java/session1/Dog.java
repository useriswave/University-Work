package session1;

public class Dog extends Animal
{
    private String breed;

    public Dog(String name, int age, boolean isMammal, double weight, String breed)
    {
        super(name, age, isMammal, weight);
        this.breed = breed;
    }

    public String getBreed()
    {
        return breed;
    }

    @Override
    public void makeSound() {
        System.out.println("WOOF!");
    }
}
