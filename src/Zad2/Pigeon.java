package Zad2;

public class Pigeon extends Bird {
    private String species;

    public Pigeon() {}

    public Pigeon(String species) {
        this.species = species;
    }

    public Pigeon(String featherColor, String species) {
        super(featherColor);
        this.species = species;
    }

    public Pigeon(String name, int age, int weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Pigeon{" +
                "species='" + species + '\'' +
                '}';
    }

    @Override
    public void eat(){
        System.out.println("Pigeon eats seeds");
    }

    @Override
    public void getVoice(){
        System.out.println("Pigeon is cooing");
    }

    @Override
    public void fly(){
        System.out.println("Pigeon flies in the city");
    }

    public void quickAttack(){
        System.out.println("Pigeon uses Quick Attack!");
    }
}
