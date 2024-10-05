package RRS;

import java.util.Scanner;

public class CheckUserResponse {
    public boolean checkResponse(String response, int limit) {
        boolean checkIfNumber = checkIfNumber(response);
        if (!checkIfNumber) {
            return false;}
        else {
            return checkIfInRange(Integer.parseInt(response), limit);
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

    private boolean checkIfInRange(int responseNum, int limit) {
        if (responseNum >= 0 && responseNum <= limit) {
            return true;
        } else {
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


}