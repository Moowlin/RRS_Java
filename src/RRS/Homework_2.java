package RRS;

import java.util.Scanner;

public class Homework_2 {
    // Метод для запроса и проверки ввода числа
    private int getValidatedNumber(Scanner scanner, String promt){
        while (true){
            System.out.println(promt);
            String input = scanner.nextLine();
            boolean isValid = new CheckUserResponse().checkIfNumber(input);     // Проверяем, является ли числом
            if (isValid) {
                return Integer.parseInt(input);     // Преобразуем строку в число и возвращаем
            } else {
                System.out.println("Вы указали неверное значение. Попробуйте снова.");
            }
        }
    }

    void displayInfo() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("-----------------------------= HOMEWORK 2 =-----------------------------");
        System.out.println("-------------------------------= Task 1 =-------------------------------");
        System.out.println("Условие:");
        System.out.println(
                "Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным \n" +
                "на ваш выбор и вывести результаты следующих операций с этими переменными: сложение, умножение, вычитание, \n" +
                "деление и остаток от деления. Также сделать проверку на четность этих переменных и вывести результат.");
        Scanner scanner = new Scanner(System.in);

        int a = getValidatedNumber(scanner, "Введите первое целочисленное число");
        int b = getValidatedNumber(scanner, "Введите второе целочисленное число");

        // Выводим результаты операций
        System.out.println("Сложение: " + (a + b));
        System.out.println("Умножение: " + (a * b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Деление: " + (a / b));
        System.out.println("Остаток от деления: " + (a % b));

        // Проверка на четность
        System.out.println("Первое число " + (a % 2 == 0 ? "четное" : "нечетное"));
        System.out.println("Второе число " + (b % 2 == 0 ? "четное" : "нечетное"));
    }
}