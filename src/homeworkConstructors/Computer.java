package homeworkConstructors;

public class Computer {
    private int id;
    private String brand;
    private String model;
    private String color;

    public Computer(){

    }

    public Computer(String model){
        this.model = model;
    }

    public Computer(String model, String color){
        this.model = model;
        this.color = color;
    }
}
