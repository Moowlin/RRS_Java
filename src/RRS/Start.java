package RRS;

import java.util.ResourceBundle;
import java.util.Scanner;

public class Start {

    public static String getUserResponse(){
        String userResponse = "";           //defining a user response variable
        boolean flag = false;
        Scanner input = new Scanner(System.in);
        while (!flag) {
            System.out.println(ResourceBundle.getBundle("main_menu"));
            userResponse = input.nextLine();
            boolean isValid = new CheckUserResponse().checkResponse(userResponse, 6);




            if (isValid) {
                flag = true;
                System.out.println("ВЫ ВЫБРАЛИ ЗАДАЧУ: " + userResponse);
            } else {
                System.out.println("Введите корректный номер задачи");
            }
        }
        return userResponse;
    }




    // Основной метод для выбора и запуска задачи
    public static boolean selectTask(){
        String taskNumber = selectTaskNumber();         // Получаем корректный номер задачи
        startSelectedTask(taskNumber);                  // Запускаем выбранную задачу
        return true;
    }

    public static String selectTaskNumber() {
    String ste ="";
        return ste;
    }

    public static void startSelectedTask(String userRequestString){
        int userRequest = Integer.parseInt(userRequestString);
        switch (userRequest){
            case (0):
                System.out.println("Выход");
                break;
            case (1):
                new Homework_1().displayInfo();
                selectTask();
                break;
            case (2):
                new Homework_2().displayInfo();
                selectTask();
                break;
            case (3):
                new Homework_3().displayInfo();
                selectTask();
                break;
            case (4):
                new Homework_4().displayInfo();
                selectTask();
                break;
            case (5):
                new Homework_5().displayInfo();
                selectTask();
                break;
            case (6):
                new Homework_6().displayInfo();
                selectTask();
                break;
            case (7):
                new Homework_7().displayInfo();
                selectTask();
                break;
            case (8):
                new Homework_8().displayInfo();
                selectTask();
                break;
            case (59):
                new Homework_9().displayInfo();
                selectTask();
                break;
        }
    }
}