package RRS;

import java.util.Scanner;

public class Homework_2 {
    void displayInfo() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("-----------------------------= HOMEWORK 2 =-----------------------------");
        System.out.println("-------------------------------= Task 1 =-------------------------------");
        System.out.println("Условие:");
        System.out.println("Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным \n" +
                "на ваш выбор и вывести результаты следующих операций с этими переменными: сложение, умножение, вычитание, \n" +
                "деление и остаток от деления. Также сделать проверку на четность этих переменных и вывести результат.");
        Scanner scanner = new Scanner(System.in);           // Создаем новый сканер
        System.out.println();
        System.out.println("Введите первое целочисленное число");

        boolean check = new CheckUserResponse().checkIfNumber(num1);



        boolean flag = false;
        while (!flag){
            System.out.println("Введите целочисленное число");
            String num1 = scanner.nextLine();
            boolean check = new CheckUserResponse().checkIfNumber(num1);     // Checking number 1
            if (check) {
                flag = true;
            } else {
                System.out.println("Вы указали неверный номер");
            }
        }

        System.out.println("Введите второе целочисленное значение число");
        flag = false;
        while (!flag){
            System.out.println("Введите целочисленное число");
            String num1 = scanner.nextLine();
            boolean check = new CheckUserResponse().checkIfNumber(num1);     // Checking number 1
            if (check) {
                flag = true;
            } else {
                System.out.println("Вы указали неверный номер");
            }
        }
    }
}