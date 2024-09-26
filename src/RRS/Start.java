package RRS;

public class Start {

    // Основной метод для выбора и запуска задачи
    public static boolean selectTask(){
        String taskNumber = selectTaskNumber();         // Получаем корректный номер задачи
        startSelectedTask(taskNumber);                  // Запускаем выбранную задачу
        return true;
    }

    public static String selectTaskNumber() {
        String userResponse = "";           //defining a user response variable
        boolean flag = false;
        while (!flag) {
            requestNumberHomework.requestTaskNumber();                                  // Request homework number
            userResponse = requestNumberHomework.getResponse();                         // Get task number
            boolean isValid = new CheckUserResponse().checkResponse(userResponse);      // Checking task number
            if (isValid) {
                flag = true;
                System.out.println("ВЫ ВЫБРАЛИ ЗАДАЧУ: " + userResponse);
            } else {
                System.out.println("Введите корректный номер задачи");
            }
        }
        return userResponse;
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