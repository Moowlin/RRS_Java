package RRS.Homework6;

public class Director extends Manager {

    public Director(String name, String position, double baseSalary, int numberOfSubordinates) {
        super(name, position, baseSalary, numberOfSubordinates);
    }

    @Override
    public double getSalary() {
        if (numberOfSubordinates > 0) {
            this.salary = this.baseSalary * (this.numberOfSubordinates / 100 * 9);
        } else {
            this.salary = this.baseSalary;
        }
        return salary;
    }
}
