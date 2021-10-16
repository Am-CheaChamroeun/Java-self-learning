import java.util.Scanner;
public class Exp6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first number: ");
        int number1 = input.nextInt();

        System.out.println("Input Second number: ");
        int number2 = input.nextInt();

        System.out.println(number1 +" + "+ number2 +" = "+ (number1+number2));
        System.out.println(number1 +" - "+ number2 +" = "+ (number1-number2));
        System.out.println(number1 +" * "+ number2 +" = "+ (number1*number2));
        System.out.println(number1 +" / "+ number2 +" = "+ (number1/number2));
        System.out.println(number1 +" / "+ number2 +" = "+ (number1%number2));


    }
}
