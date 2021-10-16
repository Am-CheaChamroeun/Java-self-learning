//import java.util.Scanner; // Import the Scanner class //The Scanner class is used to get user input, and it is found in the java.util package.
//
//public class userInput {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in); //        Create scanner object
//
//
//        System.out.println("Enter a line of text: "); //        Output the prompt
//
//        String line  = input.nextLine(); //        wait for the user to enter a line of text
//
//        System.out.println("You enter "+ line); //        Tell them what they enter.
//    }
//}

import java.util.Scanner;
public class userInput_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer: ");
        int value = input.nextInt();
        System.out.println("You enter number: " + value);
    }
}


//import java.util.Scanner;
//public class userInput{
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a floating point value: ");
//        double value = input.nextDouble();
//        System.out.println("You enter: " + value);
//    }
//}