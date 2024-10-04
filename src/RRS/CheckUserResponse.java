package RRS;

import java.util.Scanner;

public class CheckUserResponse {
    public boolean checkResponse(String response, int limit) {
        // необходимо проверить, что это число
        // необходимо проверить что число на вхождение в заданный диапазон
        boolean checkIfNumber = checkIfNumber(response);
        if (checkIfNumber) {
            int responseNum = Integer.parseInt(response);
            if (checkIfInRange(responseNum)) {
                return true; // что-то ту не так
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean checkIfNumber(String testString) {
        try {
            Integer.parseInt(testString);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }





    public static int getValidatedNumber(Scanner scanner, String promt) {
        while (true) {
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

    private boolean checkIfInRange(int responseNum) {
        if (responseNum >= 0 && responseNum <= 10) {
            return true;
        } else {
            return false;
        }
    }
}