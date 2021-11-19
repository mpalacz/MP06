package Zad2;

public class Fish extends Animal {
    private String colorOfScales;

    public Fish(){}

    public Fish(String colorOfScales) {
        this.colorOfScales = colorOfScales;
    }

    public Fish(String name, int age, int weight, String colorOfScales) {
        super(name, age, weight);
        this.colorOfScales = colorOfScales;
    }

    public String getColorOfScales() {
        return colorOfScales;
    }

    public void setColorOfScales(String colorOfScales) {
        this.colorOfScales = colorOfScales;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "colorOfScales='" + colorOfScales + '\'' +
                '}';
    }

    @Override
    public void eat(){
        System.out.println("Fish eats in the water");
    }

    @Override
    public void getVoice(){
        System.out.println("Fishes do not have voice");
    }

    public void swim(){
        System.out.println("Fish swims");
    }
}
