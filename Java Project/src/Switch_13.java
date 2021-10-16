import java.util.Scanner;
public class Switch_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a common");
        String text = input.nextLine();

        switch(text){
            case "start":
                System.out.println("Machine start!");
                break;

            case "stop":
                System.out.println("Machine stop!");
                break;

            default:
                System.out.println("Command not recognized");

        }
    }
}
