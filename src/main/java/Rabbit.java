public class Rabbit extends Animal {
    private String eyeColor;
    private int age;

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println("Rabbit: " + name + " is being still.");
    }

    @Override
    public void play(Toy toy) {
        System.out.println("Rabbit: " + name + " is playing with a toy " + toy);
    }
}
