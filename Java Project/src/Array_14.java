//public class Array {
//    public static void main(String[] args) {
//
//        int[] values = new int[4]
//
//        System.out.println(values[0]);
//        values[0] = 10;
//        values[1] = 20;
//        values[2] = 30;
//        values[3] = 40;
//
//        System.out.println(values[0]);
//        System.out.println(values[1]);
//        System.out.println(values[2]);
//        System.out.println(values[3]);
//
//        for(int i = 0;i<values.length;i+=1){
//            System.out.println(values[i]);
//        }
//        int[] number = {8, 7, 3};
//        for (int i = 0;i<number.length;i+=1){
//            System.out.println(number[i]);
//            System.out.println(i);
//        }
//
//    }
//}

public class Array_14 {
    public static void main(String[] args) {
        int[] values = new int[4];


        values[0] = 10;
        values[1] = 20;
        values[2] = 30;
        values[3] = 40;

        System.out.println(values[0]);
        System.out.println(values[1]);
        System.out.println(values[2]);
        System.out.println(values[3]);

        for(int i = 0;i<values.length;i+=1){
            System.out.println(values[i]);

        }
        int[] numbers = {80,70,30,2003};
        for(int i = 0;i<numbers.length;i+=1){
            System.out.println(i);
            System.out.println();
        }
    }
}