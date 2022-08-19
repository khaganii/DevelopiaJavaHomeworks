package homeworkAbstactionAndProblemsBasic1to30;

public class Cat extends Animal{

    public Cat(String name, int age){
        super.name = name;
        super.age = age;
    }
    @Override
    void makeNoise() {
        System.out.print("Cat is meowing!\n");
    }

    @Override
    public String toString() {
        return "Cat{" + name + " is " + age + " years old and  ";
    }

}
