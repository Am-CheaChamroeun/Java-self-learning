//import java.util.Scanner;
//public class DoWhile {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//
//        System.out.println("Enter a number: ");
//        int value = input.nextInt();
//
//        while(value != 5){
//            System.out.println("Enter a number: ");
//            value = input.nextInt();
//        }
//        System.out.println("Got 5!");
//
//    }
//}

import java.util.Scanner;
public class DoWhile_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = 0;
        do{
            System.out.println("Enter a number");
            value = input.nextInt();

        }
        while(value != 5);

        System.out.println("Got 5!");
    }
}

