import RRS.Start;
import java.util.ResourceBundle;

import static RRS.Start.getUserResponse;


public class Main {
    public static void main(String[] args) {
        System.out.println(ResourceBundle.getBundle("greeting"));
        boolean start = Start.selectTask();
        String userResponse = "";

        while (userResponse != "0"){
            System.out.println(ResourceBundle.getBundle("main_menu"));
            userResponse = getUserResponse();
            //start(userResponse);
        }

        if (start){
            System.out.println(ResourceBundle.getBundle("goodbye"));
        }
    }
}