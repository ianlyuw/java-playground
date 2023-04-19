public class Main {
    public static void main(String[] args) {
        Cat coco = new Cat("coco",14);
        Dog max = new Dog("max", 5, "Ian");
        Rabbit snowWhite = new Rabbit("snow ball", 15);
        Toy curiousGeorge = new Toy("ABC corp");
        Toy robot = new Toy("LegoRobot");
        Action[] homeFriends = new Action[4];
        homeFriends[0] = coco;
        homeFriends[1] = max;
        homeFriends[2] = snowWhite;
        homeFriends[3] = curiousGeorge;

        for(Action friend : homeFriends){
            friend.play(robot);
        }


    }

}
