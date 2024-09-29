package RRS.Homework6;

public class Homework6 {
    public static class Employee{
        private String name;
        private String position;
        private double baseSalary;
        private double salary;
        static String employeeHeader = "------------------= Employee =------------------"; //Статическая переменная принадлежащая классу, константа

        public void displayInfoEmployee(){
            System.out.printf("Name: %s\nPosition: %s\nBase Salary: %.2f\nSalary: %.2f\n", name, position, baseSalary,salary);
        };

        // Функции для имени
        public void setName(String name){
            this.name = name;
        }
        public String getName(){
            return this.name;
        }
    // -------------------------------------------------------------------------------
        // Функции для должности
        public void setPosition(String position){
            this.position = position;
        }
        public String getPosition(){
            return this.position;
        }
    // -------------------------------------------------------------------------------
        // Функции для базовой ставки
        public void setBaseSalary(double baseSalary){
            if (baseSalary >0){
                this.baseSalary = baseSalary;
            } else {
                System.out.println("Дайте нормальную зарплату");
            }
        };
        public double getBaseSalary(){
            return this.baseSalary;
        }
    // -------------------------------------------------------------------------------
        // Функции для зарплаты
//        public void setSalary(double salary){
//            if(salary > baseSalary){
//                this.salary = salary;
//            } else {
//                System.out.println("Зарплата не может быть меньше базовой ставки");
//            }
//        };
        public double getSalary(){
            return salary;
        }
    // -------------------------------------------------------------------------------
    }

    class Worker extends Employee{

    }

}
