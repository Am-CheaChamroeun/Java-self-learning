import java.util.Scanner;
public class Exp5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int number1 = input.nextInt();


        System.out.println("Enter second number: ");
        int number2 = input.nextInt();

        System.out.println(number1 +" * " + number2 + " = " + number1*number2);

    }
}