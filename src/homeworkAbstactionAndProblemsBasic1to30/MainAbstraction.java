package homeworkAbstactionAndProblemsBasic1to30;

public class MainAbstraction {
    public static void main(String[] args) {
        Animal dog = new Dog("North", 4);
        Animal cat = new Cat("Jimmy",2);
        Animal lion = new Lion("Alex", 5);

        System.out.print(dog.toString());
        dog.makeNoise();
        System.out.print(cat.toString());
        cat.makeNoise();
        System.out.print(lion.toString());
        lion.makeNoise();
    }
}
