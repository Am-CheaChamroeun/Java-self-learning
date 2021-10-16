public class Arrayofstring_15 {
    public static void main(String[] args) {
        String[] words = new String[3];

        words[0] = "Hello";
        words[1] = "World";
        words[2] = "of full people";

        System.out.println(words[0] +" "+ words[1] + " " +words[2]);

        String[] fruits = {"apple","Banana","Orange","Grape"};
        for(String fruit: fruits){
            System.out.println(fruit);
        }

        String text = null;
        System.out.println(text);
        String[] texts = new String[2];
        System.out.println(texts[0]);
        texts[0] = "one";
        System.out.println(texts[0]);


    }
}

