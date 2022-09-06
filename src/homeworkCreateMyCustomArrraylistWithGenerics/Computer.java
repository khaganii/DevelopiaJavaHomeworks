package homeworkCreateMyCustomArrraylistWithGenerics;

public class Computer {
    int id;
    String model;
    int ram;

    public Computer(int id, String model, int ram) {
        this.id = id;
        this.model = model;
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", model='" + model + '\'' +
                ", ram=" + ram;
    }
}
