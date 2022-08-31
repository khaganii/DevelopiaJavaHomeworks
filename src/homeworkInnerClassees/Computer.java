package homeworkInnerClassees;

public class Computer implements Cloneable{
    private int code;
    private String brand;
    private String model;
    private Ram ram;

    public Computer(int code, String brand, String model, Ram ram) {
        this.code = code;
        this.brand = brand;
        this.model = model;
        this.ram = ram;
    }

    static class Ram{
        private int code;
        private String brand;
        private int speed;
        private int size;

        public Ram(int code, String brand, int speed, int size) {
            this.code = code;
            this.brand = brand;
            this.speed = speed;
            this.size = size;
        }

        @Override
        public String toString() {
            return "Ram{" +
                    "code=" + code +
                    ", brand='" + brand + '\'' +
                    ", speed=" + speed +
                    ", size=" + size +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "code=" + code +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram.toString() +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Is Deleting...");
    }
}
