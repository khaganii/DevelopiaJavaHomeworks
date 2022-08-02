package homeworkPassByReference;

public class Person {
    private String name;
	private String surname;
	private int experienceYear;
    private int salary;
	private String phone;


    public Person(String name, String surname, String phone, int experienceYear) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.experienceYear = experienceYear;
    }

    public String getPersonInfo(){
       return String.format("%s %s (%s) , %d year experience and %d salary \n", this.name, this.surname, this.phone, this.experienceYear, this.salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(int experienceYear) {
        this.experienceYear = experienceYear;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
