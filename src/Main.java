import RRS.Start;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to my learning!");    // Hello
        boolean start = Start.selectTask();
        if (start){
            System.out.println("конец");
        }
    }
}