package RRS;
import java.util.Scanner;

public class Homework_3 {
    void displayInfo() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("-----------------------------= HOMEWORK 3 =-----------------------------");
        System.out.println("-------------------------------= Task 1 =-------------------------------");
        System.out.println("""
                Условие:
                Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным
                на ваш выбор и вывести следующие строки:
                a == b - если переменные равны
                a < b - если переменная a меньше b
                a > b - если переменная b меньше a
                """);
        Scanner scanner = new Scanner(System.in);
        int a = CheckUserResponse.getValidatedNumber(scanner, "Введите первое целочисленное число");
        int b = CheckUserResponse.getValidatedNumber(scanner, "Введите второе целочисленное число");
        if (a == b){System.out.println("a == b");}
        if (a < b){System.out.println("a < b");}
        if (a > b){System.out.println("a > b");}

        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        System.out.println("-------------------------------= Task 2 =-------------------------------");
        System.out.println("Условие:");
        System.out.println("""
               Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным
               на ваш выбор и вывести следующие строки:
               - maybe a and b are even - если сумма переменных четная
               - some variable is odd - если сумма переменных нечетная
                """);
        a = CheckUserResponse.getValidatedNumber(scanner, "Введите первое целочисленное число");
        b = CheckUserResponse.getValidatedNumber(scanner, "Введите второе целочисленное число");
        System.out.println( (a+b)%2==0 ? "maybe a and b are even" : "some variable is odd");

        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        System.out.println("-------------------------------= Task 3 =-------------------------------");
        System.out.println("""
            Условие:
            Необходимо создать целочисленную переменную, присвоить произвольное значение переменной на ваш выбор и
            вывести следующие строки:
            - больше 10 - если переменная больше 10
            - меньше 100 - если переменная меньше 100
            - результат деления на 2 больше 20 - если это соответствует истине
            - значение переменной между 5 и 40 включительно - если это правда
            - значение переменной меньше 5 или больше 40 - если предыдущие условие ложное
        """);

        int number = CheckUserResponse.getValidatedNumber(scanner, "Введите первое целочисленное число");
        if (number > 10){System.out.println("больше 10");}
        if (number < 100){System.out.println("меньше 100");}
        if (number/2 > 20){System.out.println("результат деления на 2 больше 20");}
        if (number > 5 && number < 40){
            System.out.println("значение переменной между 5 и 40 включительно");
        } else {
            System.out.println("значение переменной меньше 5 или больше 40");
        }

        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        System.out.println("-------------------------------= Task 4 =-------------------------------");
        System.out.println("Условие: Необходимо вывести числа от 0 до 15.");
        for(int i=0; i<16; i++){
            System.out.println(i);
        }

        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        System.out.println("-------------------------------= Task 5 =-------------------------------");
        System.out.println("Условие: Необходимо вывести все положительные степени числа 5 которые меньше 10000, вывести результат возведения в степень.");
        boolean flag = true;
        int i = 1;
        while (flag){
            if(Math.pow(5, i)<10000){
                System.out.printf("Число 5 в степени %d равно %.0f\n", i, Math.pow(5,i));
            } else {
                flag = false;
            }
            i++;
        }

        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        System.out.println("-------------------------------= Task 6 =-------------------------------");
        System.out.println("""
                Условие:
                Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
                Реализовать 2 варианта:\s
                - использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
                - без использования конструкции if (шаг цикла на ваше усмотрение).
                """);
        System.out.println("Вариант 1");
        for (i = 40; i <= 60; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }

        System.out.println("Вариант 2");
        for (i=40; i<=60; i=i+4){
            System.out.println(i);
        }
        System.out.println();
        System.out.println();
    }
}