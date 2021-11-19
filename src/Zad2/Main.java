package Zad2;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[7];

        animals[0] = new Mammal("red");
        animals[1] = new Dog("Puddel");
        animals[2] = new Fish("blue");
        animals[3] = new Blowfish(5);
        animals[4] = new Bird("yellow");
        animals[5] = new Pigeon("Rock dove");
        animals[6] = new Animal("Rex", 5, 30);

        System.out.println(animals[0].toString() +
                "\n" + animals[1].toString() +
                "\n" + animals[2].toString() +
                "\n" + animals[3].toString() +
                "\n" + animals[4].toString() +
                "\n" + animals[5].toString() +
                "\n" + animals[6].toString());

        System.out.println();

        animals[0].eat();
        animals[1].eat();
        animals[2].eat();
        animals[3].eat();
        animals[4].eat();
        animals[5].eat();
        animals[6].eat();

        System.out.println();

        animals[0].getVoice();
        animals[1].getVoice();
        animals[2].getVoice();
        animals[3].getVoice();
        animals[4].getVoice();
        animals[5].getVoice();
        animals[6].getVoice();
    }
}
