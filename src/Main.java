import RRS.Start;

import java.util.Locale;
import java.util.ResourceBundle;

import static RRS.Start.getUserResponse;


public class Main {
    private static final String FILENAME = "resources/messages";
    private static final ResourceBundle resourceBundle = ResourceBundle.getBundle(FILENAME);

    
    public static void main(String[] args) {
        System.out.println("test");
        String rb = resourceBundle.getString("greeting");
        System.out.println(rb);
        


//        //System.out.println(ResourceBundle.getBundle("messages", current).getString("greeting"));
//        boolean start = Start.selectTask();
//        String userResponse = "";
//
//        while (!userResponse.equals("0")){
//            System.out.println(ResourceBundle.getBundle("main_menu"));
//            userResponse = getUserResponse();
//            //start(userResponse);
//        }
//
//        if (start){
//            System.out.println(ResourceBundle.getBundle("goodbye"));
//        }
    }
}