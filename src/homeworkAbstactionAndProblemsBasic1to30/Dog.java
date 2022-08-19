package homeworkAbstactionAndProblemsBasic1to30;

public class Dog extends Animal{
    public Dog(String name, int age){
        super.name = name;
        super.age = age;
    }
    @Override
    void makeNoise() {
        System.out.print("Dog is barking!\n");
    }

    @Override
    public String toString() {
        return "Dog{" + name + " is " + age + " years old and ";
    }
}
