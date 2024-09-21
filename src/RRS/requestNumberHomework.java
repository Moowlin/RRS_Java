package RRS;

import java.util.Scanner;
public class requestNumberHomework {
    public static void requestTaskNumber() {
        System.out.println("""
                SELECT ANY HOMEWORK FOR TO VIEW:
                0. Exit
                1. Homework #1
                2. Homework #2
                3. Homework #3
                """);
    }
    public static String getResponse(){
        Scanner input = new Scanner(System.in);
        String userRequest = input.nextLine();
       return userRequest;
    }
}