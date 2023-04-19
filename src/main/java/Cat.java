public class Cat extends Animal {

    private int age;

    public Cat(String name, int age) {
        super(name, age);
    }

@Override
    public void play() {
        System.out.println("Cat:" + name + " jumps on the table.");
    }
@Override
    public void play(Toy toy) {
        System.out.println("Cat:" + name + " is playing with the toy " + toy);
    }
}
