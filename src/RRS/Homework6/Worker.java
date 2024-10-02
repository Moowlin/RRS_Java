package RRS.Homework6;

public class Worker extends Employee{
    int workDuration;
    public Worker(String name, String position, double baseSalary, int workDuration) {
        super(name, position, baseSalary);
    }
    @Override
    public double getSalary() {
        return this.baseSalary+(workDuration*100);
    }
}