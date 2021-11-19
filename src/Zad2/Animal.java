package Zad2;

public class Animal {
    private String name;
    private int age, weight;

    public Animal(){}

    public Animal(String name){
        this.name = name;
    }

    public Animal(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Animal eats");
    }

    public void getVoice(){
        System.out.println("Animal made voice");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
