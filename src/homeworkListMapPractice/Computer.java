package homeworkListMapPractice;

public class Computer implements Comparable<Computer>{
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
        return "Computer{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                '}';
    }

    @Override
    public int compareTo(Computer o) {
        return this.ram - o.ram;
    }
}
