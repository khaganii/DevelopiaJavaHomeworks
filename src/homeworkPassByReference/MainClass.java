package homeworkPassByReference;

public class MainClass {
    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        Person person = new Person("Rufat", "Gadirov", "+994509999999", 6);
        salaryCalculator.calculateSalary(person);
        System.out.println(person.getPersonInfo());

    }
}
