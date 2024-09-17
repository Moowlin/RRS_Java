package RRS;

public class Start {
    public static boolean selectTask(){
        boolean flag = false;
        String userRequest = "";                                                    // Определим переменную заранее
        while (!flag){
            UserRequest.requestTaskNumber();                                        // Request task number
            userRequest = UserRequest.getResponse();                                // Get task number
            boolean check = new CheckUserResponse().checkResponse(userRequest);     // Checking task number
            if (check) {
                flag = true;
                System.out.println("ВЫ ВЫБРАЛИ ЗАДАЧУ: " + userRequest);
            } else {
                System.out.println("Введите новый номер задачи");
            }
        }
        startSelectedTask(userRequest);
        return true;
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
                System.out.println("Страт задачи 3");
                break;
            case (4):
                System.out.println("Страт задачи 4");
                break;
        }
    }
}