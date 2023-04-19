public class Toy implements Action{
    private String brand;

    public Toy(String brand) {
        this.brand = brand;
    }
    @Override
    public void play(){
        System.out.println("Toy: brand " + brand + " is making some weird sound.");
    }
    @Override
    public void play(Toy toy){
        System.out.println("Robot" + brand + " is happy to see another toy" + toy);
    }

    @Override
    public String toString() {
        return brand;
    }
}
