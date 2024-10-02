package RRS.Homework6;

public class Employee {

    protected String name;
    protected String position;
    protected double baseSalary;
    static String employeeHeader = "------------------= Employee =------------------"; //Статическая переменная принадлежащая классу, константа

    public Employee(String name, String position, double baseSalary) {
        this.name = name;
        this.position = position;
        this.baseSalary = baseSalary;
    }

    public void displayInfoEmployee() {
        System.out.printf("Name: %s\nPosition: %s\nBase Salary: %.2f\nSalary: %.2f\n", name, position, baseSalary);
    }

    // set name method
    public void setName(String name) {
        this.name = name;
    }

    // get name method
    public String getName() {
        return this.name;
    }

    // set position method
    public void setPosition(String position) {
        this.position = position;
    }

    // get position method
    public String getPosition() {
        return this.position;
    }

    // set base salary method
    public void setBaseSalary(double baseSalary) {
        if (baseSalary > 0) {
            this.baseSalary = baseSalary;
        } else {
            System.out.println("Дайте нормальную зарплату");
        }
    }

    // get base salary method
    public double getBaseSalary() {
        return this.baseSalary;
    }

    // get salary method
    public double getSalary() {
        return this.baseSalary;
    }
}