public class Dog extends Animal {
    private int age;
    private String owner;

    public Dog(String name, int age, String owner) {
        super(name, age);
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOwner() {
        return owner;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
@Override
    public void play(){
        System.out.println("Dog: " + name + " is chasing it's tail.");
    }
@Override
    public void play(Toy toy){
        System.out.println("Dog " + name + " is biting the toy " + toy);
    }
}


