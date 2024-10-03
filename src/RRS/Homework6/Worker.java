package RRS.Homework6;

public class Worker extends Employee{
    int workDuration;
    public Worker(String name, String position, double baseSalary, int workDuration) {
        super(name, position, baseSalary);
        this.workDuration = workDuration;
    }


    @Override
    public double getSalary() {
        return this.baseSalary+(workDuration*100);
    }

    // setting work Duration method
    public void setworkDuration(int workDuration) {
        this.workDuration = workDuration;
    }

    // getting work Duration method
    public int getNumberOfSubordinates() {
        return this.workDuration;
    }
}