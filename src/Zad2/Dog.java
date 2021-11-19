package Zad2;

public class Dog extends Mammal {
    private String breed;

    public Dog(){}

    public Dog(String breed) {
        this.breed = breed;
    }

    public Dog(String colorOfFur, String breed) {
        super(colorOfFur);
        this.breed = breed;
    }

    public Dog(String name, int age, int weight, String colorOfFur, String breed) {
        super(name, age, weight, colorOfFur);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }

    @Override
    public void eat(){
        System.out.println("Dog eats dog food");
    }

    @Override
    public void getVoice(){
        System.out.println("Dog barks");
    }

    @Override
    public void run(){
        System.out.println("Dog runs fast");
    }

    public void fetch(){
        System.out.println("Dog retrieves stick");
    }
}
