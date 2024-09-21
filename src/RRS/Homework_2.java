package RRS;

import java.util.Scanner;

public class Homework_2 {
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

        int a = CheckUserResponse.getValidatedNumber(scanner, "Введите первое целочисленное число");
        int b = CheckUserResponse.getValidatedNumber(scanner, "Введите второе целочисленное число");
        // Выводим результаты операций
        System.out.println("Сложение: " + (a + b));
        System.out.println("Умножение: " + (a * b));
        System.out.println("Вычитание: " + (a - b));
        System.out.println("Деление: " + (a / b));
        System.out.println("Остаток от деления: " + (a % b));
        // Проверка на четность
        System.out.println("Первое число " + (a % 2 == 0 ? "четное" : "нечетное"));
        System.out.println("Второе число " + (b % 2 == 0 ? "четное" : "нечетное"));
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        System.out.println("-------------------------------= Task 2 =-------------------------------");
        System.out.println("Условие:");
        System.out.println("""
                Создать программу дележа добычи на пиратском корабле. По обычаю, половина добычи идет владельцу корабля,
                половина оставшегося — капитану, остальное делится поровну между всеми членами команды, включая капитана.
                Размер добычи (например, в пиастрах) и количество пиратов на корабле задать переменными.
                Вывести на экран кому сколько пиастров полагается
                Сколько получит капитан (Джек Воробей, естественно), если он утверждает, что корабль принадлежит ему?
                Дополнительное задание со звездочкой
                Попробовать придумать как программа может проверить правильность дележа.
                """);
        int loot = CheckUserResponse.getValidatedNumber(scanner, "Укажите размеры добычи в пиастрах (целое число)");
        int contol = loot;
        int pirates = CheckUserResponse.getValidatedNumber(scanner, "Укажите пиратов");
        int shipOwnerShare = loot / 2;     // доля владельца коробля
        loot = loot - shipOwnerShare;
        int shipCapitanShare = loot/2;      // доля капитана коробля
        loot = loot - shipCapitanShare;
        int eachPirateShare = loot / (pirates+1);           // капитан получает долю и как пират
        shipCapitanShare = shipCapitanShare + eachPirateShare;
        loot = loot - eachPirateShare * pirates;
        System.out.printf("Владелец корабля получит: %d\n", shipOwnerShare);
        System.out.printf("Капитан корабля получит: %d\n", shipCapitanShare);
        System.out.printf("Каждый пират получит: %d\n", eachPirateShare);
        System.out.printf("Остаток на шлю: %d\n", loot);
        System.out.printf("Капитан Джек Воробей получит: %d\n", shipCapitanShare + shipOwnerShare);
        if ((shipOwnerShare+shipCapitanShare+eachPirateShare*(pirates-1)+loot) == contol) {
            System.out.println("Все довольны");
        } else {
            System.out.println("Есть недовольгые, жди бунт на корабле");
        }
        System.out.println();
        System.out.println();
    }
}