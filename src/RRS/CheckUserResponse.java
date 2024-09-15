package RRS;

public class CheckUserResponse {
    public boolean checkResponse(String response){
        boolean checkIfNumber = checkIfNumber(response);
        boolean checkIfInRange = false;
        if (checkIfNumber){
            int responseNum = Integer.parseInt(response);
            checkIfInRange = checkIfInRange(responseNum);
        };
        if (checkIfNumber && checkIfInRange){
            return true;
        }
        else {
            return false;
        }
    }

    private boolean checkIfNumber (String testString) {
        try {
            Integer.parseInt(testString);
            return true;
        } catch (NumberFormatException ex){
            return false;
        }
    }

    private boolean checkIfInRange(int responseNum){
        if (responseNum >= 0 && responseNum <= 10){
            return true;
        }
        else {
            return false;
        }
    }
}