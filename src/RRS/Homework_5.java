package RRS;

import java.util.Arrays;

public class Homework_5 {
    void displayInfo() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("-----------------------------= HOMEWORK 5 =-----------------------------");
        System.out.println("-------------------------------= Task 5.1 - 1 =-------------------------------");
        System.out.println("""
                Условие:
                Дан массив: int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
                1. необходимо вывести сумму всех элементов массива
                2. необходимо вывести максимальное значение элементов массива
                3. необходимо вывести минимальное значение элементов массива
                4. необходимо вывести среднее арифметическое всех элементов массива
                """);
        int[] array_task_1 = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int sum_task_1 = 0;
        int max_task_1 = array_task_1[0];
        int min_task_1 = array_task_1[0];
        float arithmetic = 0;

        for (int i : array_task_1) {
            sum_task_1 = sum_task_1 + i;            // Ищем сумму:
            if (i > max_task_1) {
                max_task_1 = i;
            }     // Ищем максимальное значение:
            if (i < min_task_1) {
                min_task_1 = i;
            }     // Ищем инимально значение:
        }
        arithmetic = (float) sum_task_1 / array_task_1.length;  // Ищем среднее арифметическое всех значений массива

        System.out.println("Cумма всех элементов массива равна: " + sum_task_1);
        System.out.println("Максимальное значение массива равно: " + max_task_1);
        System.out.println("Минимальное значение массива равно: " + max_task_1);
        System.out.println("Среднее арифметическое всех элементов массива равно: " + arithmetic);
        System.out.println("------------------------------------------------------------------------");
        System.out.println();

        System.out.println("-------------------------------= Task 5.1 - 2 =-------------------------------");
        System.out.println("""
                Условие:
                Дан массив: int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
                1. необходимо вывести сумму элементов массива
                2. необходимо вывести максимальное значение массива
                3. необходимо вывести количество элементов в массиве
                """);

        int[][] array_task_2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum_task_2 = 0;
        int max_task_2 = array_task_2[0][0];
        int count_task_2 = 0;

        for (int[] i : array_task_2) {
            for (int j : i) {
                sum_task_2 = sum_task_2 + j;            // Ищем сумму:
                if (j > max_task_2) {
                    max_task_2 = j;
                }    // Ищем максимальное значение:
                count_task_2++;                         // Ищем количество элементов в массиве:
            }
        }
        System.out.println("Cумма всех элементов массива равна: " + sum_task_2);
        System.out.println("Максимальное значение массива равна: " + max_task_2);
        System.out.println("Количество элементов макссива равно: " + count_task_2);
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        System.out.println("-------------------------------= Task 5.2 - 1 =------------------------------");
        System.out.println("""
                Условие:
                Дана строка:\s
                String s = “Перестановочный алгоритм быстрого действия”;
                необходимо вывести все буквы “о” из этой строки.
                Для указанной строки ответ будет “ооооо” (или в столбик)
                """);
        String str_Task521 = "Перестановочный алгоритм быстрого действия";
        System.out.print("Результат: ");
        for (int i = 0; i < str_Task521.length(); i++) {
            if (str_Task521.charAt(i) == 'о') {
                System.out.print(str_Task521.charAt(i));
            }
        }
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        System.out.println("-------------------------------= Task 5.2 - 2 =------------------------------");
        System.out.println("""
                Условие:
                Дана строка:\s
                String s = “Перевыборы выбранного президента”;
                необходимо подсчитать количество букв “е” в строке.
                Для указанной строки ответ будет 4.
                """);
        String str_Task522 = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < str_Task522.length(); i++) {
            if (str_Task522.charAt(i) == 'е') {
                count++;
            }
        }
        System.out.println("Результат: " + count);
        System.out.println();

        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        System.out.println("-------------------------------= Task 5.2 - 3 =------------------------------");
        System.out.println("""
                Условие:
                Дана строка:\s
                String s = “Посмотрите как Рите нравится ритм”;
                необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
                Для указанной строки ответ будет 6, 15, 29.
                """);

        String str_Task523 = "Посмотрите как Рите нравится ритм";
        String sub = "рит";
        str_Task523 = str_Task523.toLowerCase();
        int index = str_Task523.indexOf(sub);
        while (index != -1) {
            System.out.println(index);
            index = str_Task523.indexOf(sub, index + 1);
        }

        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        System.out.println("-------------------------------= Task 5.2 - 4 =------------------------------");
        System.out.println("""
                Условие:
                Дана строка:\s
                String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
                необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”. ответ - 4
                """);

        String[][] arrayStrings = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int count_withoutE = 0;
        for (int i = 0; i < arrayStrings.length; i++) {
            for (int j = 0; j < arrayStrings[i].length; j++) {
                if (!arrayStrings[i][j].contains("е")) {
                    count_withoutE++;
                }
            }
        }
        System.out.println("Ответ: " + count_withoutE);
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
    }
}
