package RRS.Homework6;

public class Manager extends Employee {
    int numberOfSubordinates;
    double salary;

    public Manager(String name, String position, double baseSalary, int numberOfSubordinates) {
        super(name, position, baseSalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary() {
        if (numberOfSubordinates > 0) {
            this.salary = this.baseSalary * (this.numberOfSubordinates / 100 * 3);
        } else {
            this.salary = this.baseSalary;
        }
        return salary;
    }

    // setting the number of subordinates method
    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    // getting the number of subordinates method
    public int getNumberOfSubordinates() {
        return this.numberOfSubordinates;
    }
}