package Zad2;

public class Blowfish extends Fish {
    private int sizeAfterBlow;

    public Blowfish(){}

    public Blowfish(int sizeAfterBlow) {
        this.sizeAfterBlow = sizeAfterBlow;
    }

    public Blowfish(String colorOfScales, int sizeAfterBlow) {
        super(colorOfScales);
        this.sizeAfterBlow = sizeAfterBlow;
    }

    public Blowfish(String name, int age, int weight, String colorOfScales, int sizeAfterBlow) {
        super(name, age, weight, colorOfScales);
        this.sizeAfterBlow = sizeAfterBlow;
    }

    public int getSizeAfterBlow() {
        return sizeAfterBlow;
    }

    public void setSizeAfterBlow(int sizeAfterBlow) {
        this.sizeAfterBlow = sizeAfterBlow;
    }

    @Override
    public String toString() {
        return "Blowfish{" +
                "sizeAfterBlow=" + sizeAfterBlow +
                '}';
    }

    @Override
    public void eat(){
        System.out.println("Blowfish eats carrot");
    }

    @Override
    public void getVoice(){
        System.out.println("Blowfish makes weird noice");
    }

    @Override
    public void swim(){
        System.out.println("Blowfish swims slowly");
    }

    public void blow(){
        System.out.println("Blowfish just blowed");
    }
}
