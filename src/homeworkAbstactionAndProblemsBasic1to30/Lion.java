package homeworkAbstactionAndProblemsBasic1to30;

public class Lion extends Animal{
    public Lion(String name, int age){
        super.name = name;
        super.age = age;
    }
    @Override
    void makeNoise() {
        System.out.print("Lion is growling!\n");
    }

    @Override
    public String toString() {
        return "Lion{" + name + " is " + age + " years old and ";
    }
}
