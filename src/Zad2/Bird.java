package Zad2;

public class Bird extends Animal {
    private String featherColor;

    public Bird(){}

    public Bird(String featherColor) {
        this.featherColor = featherColor;
    }

    public Bird(String name, int age, int weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public String getFeatherColor() {
        return featherColor;
    }

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "featherColor='" + featherColor + '\'' +
                '}';
    }

    @Override
    public void eat(){
        System.out.println("Bird eats seeds");
    }

    @Override
    public void getVoice(){
        System.out.println("Bird sings");
    }

    public void fly(){
        System.out.println("Bird flies");
    }
}
