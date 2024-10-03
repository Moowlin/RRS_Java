package RRS;
import RRS.Homework6.Employee;
import RRS.Homework6.Worker;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;


public class Homework_6 {
    public void displayInfo() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("-----------------------------= HOMEWORK 6 =-----------------------------");
        System.out.println("------------------------------------------------------------------------");
        System.out.println();


        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> asFamily = new ArrayList<>();
        LinkedList<Employee> tempList = new LinkedList<>(asFamily);

        System.out.println("В вашей базе сотрудников: "+asFamily.size());

        // Создаем массив с количеством элементов равным введенному числу




//        System.out.print("Введите число: ");
//        int n = scanner.nextInt();  // Читаем число от пользователя
//
//        // Создаем массив с количеством элементов равным введенному числу
//        //Employee[] asFamily = new Employee[n];
//        // Заполняем массив значениями
//        for (int i = 0; i < n; i++) {
//            asFamily[i] = CreateEmployee();
//        }
//
//        for (Employee i : asFamily){
//            System.out.println(i.getName());
//        };
//
//
//
//
//
//
//
//        Employee employee = new Employee("Сотрудник", "Director", 50);
//
//        System.out.println(employee.getSalary());
//        System.out.println("____________________________");
//
//


//        Worker worker = new Worker("Работник", "fsfs", 55);
//
//        worker.getSalary();



    }

    private Worker CreateEmployee() {
        System.out.println("Ведите имя сотрудника: ");
        System.out.println("Ведите должность сотрудника: ");
        Worker worker = new Worker("Работник", "fsfs", 55, 5);

        return worker;
    }
}


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









//
//    }
//}
