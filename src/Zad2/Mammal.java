package Zad2;

public class Mammal extends Animal {
    private String colorOfFur;

    public Mammal(String colorOfFur) {
        this.colorOfFur = colorOfFur;
    }

    public Mammal(){

    }

    public Mammal(String name, int age, int weight, String colorOfFur) {
        super(name, age, weight);
        this.colorOfFur = colorOfFur;
    }

    public String getColorOfFur() {
        return colorOfFur;
    }

    public void setColorOfFur(String colorOfFur) {
        this.colorOfFur = colorOfFur;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "colorOfFur='" + colorOfFur + '\'' +
                '}';
    }

    @Override
    public void eat(){
        System.out.println("Mammal eats");
    }

    @Override
    public  void getVoice(){
        System.out.println("Mammal makes voice");
    }

    public void run(){
        System.out.println("Mammal runs");
    }
}
