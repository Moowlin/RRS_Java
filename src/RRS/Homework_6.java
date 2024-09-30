package RRS;
import RRS.Homework6.Homework6.*;


public class Homework_6 {
    public void displayInfo() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("-----------------------------= HOMEWORK 6 =-----------------------------");
        System.out.println("-------------------------------= Task 1 =-------------------------------");
        System.out.println("""
                Условие:
                Необходимо создать класс Employee со следующими методами:\s
                getBaseSalary - получить базовую ставку
                setBaseSalary
                getName - получить имя
                setName
                getSalary - получить зарплату
                """);

        Employee employee = new Employee("Vova", "Director", 50, 55);
        employee.displayInfoEmployee();

        employee.setName("Vic");
        System.out.println(employee.getName());



        //employee.displayInfoEmployee();





//        Employee firstEmployee = new Employee();
//        firstEmployee.setName("Ivan");
//        firstEmployee.setPosition("Лошара");
//        firstEmployee.setBaseSalary(6.5);
//        //firstEmployee.setSalary(10.88);
//
//        firstEmployee.displayInfoEmployee();
//
//        firstEmployee.getName();
//        firstEmployee.getBaseSalary();
//        firstEmployee.getPosition();
//        firstEmployee.getSalary();
//
//
//        System.out.println();
//        System.out.println("------------------------------------------------------------------------");
//        System.out.println();





//        firstEmployee.position = "director";
//        firstEmployee.displayInfoEmployee();
//
//        firstEmployee.setBaseSalary(25.55);
//        firstEmployee.displayInfoEmployee();
//
//        // ANSI код для включения жирного текста
//        String bold = "\033[1m";
//        // ANSI код для сброса стилей текста (возвращение к обычному тексту)
//        String resetText = "\033[0m";
//        // ANSI escape codes для разных цветов
//        String resetColor = "\033[0m";       // Сброс форматирования
//        String green = "\033[32m";      // Зеленый цвет текста
//
//        System.out.println(
//                bold + green+ "|| Номер || Имя || Должность || Базовая ставка || Текущая зарплата ||\n"+ resetText+ resetColor +
//                "|| 1 || " + firstEmployee.getName() + " || " + firstEmployee.getPosition()
//        );










    }
}
