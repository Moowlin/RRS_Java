package RRS;

import java.util.Scanner;
public class requestNumberHomework {
    public static void requestTaskNumber() {
        System.out.println("SELECT ANY HOMEWORK FOR TO VIEW:\n" +
                "0. Exit\n" +
                "1. Homework #1\n" +
                "2. Homework #2\n");
    }
    public static String getResponse(){
        Scanner input = new Scanner(System.in);
        String userRequest = input.nextLine();
        //input.close();
       return userRequest;
    }
}