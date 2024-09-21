package RRS;
import java.util.*;

public class Homework_4 {
    void displayInfo() {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("-----------------------------= HOMEWORK 4 =-----------------------------");
        System.out.println("-------------------------------= Task 1 =-------------------------------");
        System.out.println("""
                Условие:
                Дан массив:
                int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
                необходимо вывести все нечетные числа из массива.
                """);
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        for (int i : array) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        System.out.println("-------------------------------= Task 2 =-------------------------------");
        System.out.println("""
                Условие:
                Дан массив:
                int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
                необходимо вывести все значения массива больше 5.
                """);
        for (int i : array) {
            if (i > 5) {
                System.out.println(i);
            }
        }

        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        System.out.println("-------------------------------= Task 3 =-------------------------------");
        System.out.println("""
                Условие:
                Дан массив:
                int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
                необходимо увеличить все значения массива на 15.
                """);
        for (int i=0; i<array.length; i++) {
            array[i] += 15;
        }
        System.out.print("Изменённый массив: ");
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println("------------------------------------------------------------------------");
        System.out.println();
        System.out.println("-------------------------------= Task 4 =-------------------------------");
        System.out.println("""
                Дан массив из десяти произвольных целых чисел (например, { 1, 2, …, 9, 10 } )
                Необходимо изменить порядок элементов массива на противоположный (т.е. чтобы получилось { 10, 9, …, 2, 1 } ). \s
                Не НАПЕЧАТАТЬ в обратном порядке, а переставить элементы массива.
                """);

        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Подход 1 - Использование второго массива");
        int[] reversed = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            reversed[i] = original[original.length - 1 - i]; // Копируем в обратном порядке
        }
        System.out.print("Изменённый массив: ");
        for (int i : reversed) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Подход 2 - Изменение порядка в том же массиве:");
        for (int i = 0; i < original.length / 2; i++) {
            // Меняем местами элементы
            int temp = original[i];
            original[i] = original[original.length - 1 - i];
            original[original.length - 1 - i] = temp;
        }
        System.out.print("Изменённый массив: ");
        for (int i : original) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
