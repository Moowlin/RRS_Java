import RRS.Start;
import java.util.ResourceBundle;

import static RRS.Start.getUserResponse;


public class Main {
    private static final String FILENAME = "resources/messages";
    private static final ResourceBundle resourceBundle = ResourceBundle.getBundle(FILENAME);
    public static void main(String[] args) {
        System.out.println(resourceBundle.getString("greeting"));

        boolean start = Start.selectTask();
        String userResponse = "";

        while (!userResponse.equals("0")){
            System.out.println(resourceBundle.getString("main_menu"));
            userResponse = getUserResponse();
            //start(userResponse);
        }

        if (start){
            System.out.println(resourceBundle.getString("goodbye"));
        }
    }
}