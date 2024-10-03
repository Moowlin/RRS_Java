package RRS;

import java.util.Scanner;

public class CheckUserResponse {
    protected CheckUserResponse(){};

    public static boolean checkResponse(String response, int limitNum){
        boolean checkIfNumber = checkIfNumber(response);
        boolean checkIfInRange = false;
        int limitNun = limitNum;
        if (checkIfNumber){
            int responseNum = Integer.parseInt(response);
            checkIfInRange = checkIfInRange(responseNum, limitNum);  //требуется рефакторинг!
        };
        if (checkIfNumber && checkIfInRange){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean checkIfNumber(String testString) {
        try {
            Integer.parseInt(testString);
            return true;
        } catch (NumberFormatException ex){
            return false;
        }
    }

    public static int getValidatedNumber(Scanner scanner, String promt){
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

    public static boolean checkIfInRange(int responseNum, int limit){
        if (responseNum >= 0 && responseNum <= limit){
            return true;
        }
        else {
            return false;
        }
    }
}