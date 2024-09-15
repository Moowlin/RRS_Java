package RRS;

public class SelectingTask {
    public static boolean selectedTask(){
        boolean flag = false;
        while (!flag){
            UserRequest.requestTaskNumber();                                     // Request task number
            String userRequest = UserRequest.getResponse();                      // Get task number
            boolean check = new CheckUserResponse().checkResponse(userRequest);  // Checking task number
            if (check) {
                flag = true;
                System.out.println("Вы ввели число: " + userRequest);
            } else {
                System.out.println("Введите новый номер задачи");
            }
        }
        return true;
    }
}
