//public class Ifcondition {
//    public static void main(String[] args) {
//        int myNumber = 30;
//        if(myNumber > 40){
//            System.out.println("Yes, it's true");
//        }
//       else if(myNumber > 50) {
//            System.out.println("No, it's false");
//        }
//        else{
//            System.out.println("None of above.");
//        }
//    }
//
//}
//If the both is true it will print the first one
//but if the both are false it will not print anything

public class Ifcondition_10 {
    public static void main(String[] args) {
        int number = 0;
        while(true){
            System.out.println("Hello " + number);

            if(number == 5)
                break;
            number += 1;
            System.out.println("Running");
        }
        System.out.println("Done");

    }
}