import java.util.Scanner;
public class Exp7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        for(int i=0;i<10;i++){
            System.out.println(number + " * "+ (i+1) + " = "+  number*(i+1));

        }



    }
}
