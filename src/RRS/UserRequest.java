package RRS;

import java.util.Scanner;
public class UserRequest {
    public static void requestTaskNumber() {
        System.out.println("Select any task for to view:\n" +
                "0. Exet\n" +
                "1. Tasks #1\n" +
                "2. Tasks #2\n");
    }
    public static String getResponse(){
        System.out.println("Введите число");
        Scanner input = new Scanner(System.in);
        String userRequest = input.nextLine();
        //input.close();
       return userRequest;
    }
}