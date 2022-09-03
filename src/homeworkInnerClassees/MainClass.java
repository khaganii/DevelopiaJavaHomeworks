package homeworkInnerClassees;

public class MainClass {
    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {
        Computer.Ram ram = new Computer.Ram(2312, "Kingston", 2300, 4);
        Computer computer = new Computer(1, "HP", "Pavilion", ram);
        Computer computerClone = (Computer) computer.clone();
        System.out.println("Computer: " + computer);
        System.out.println("ComputerClone: " + computerClone.toString());
        computer = null;
        computerClone = null;
        System.gc();
        Thread.sleep(1000);
    }
}
