package homeworkPassByReference;

public class SalaryCalculator {
    public void calculateSalary(Person person){
        int experienceYear = person.getExperienceYear();
        int salary = experienceYear*500;
        person.setSalary(salary);
    }
}
