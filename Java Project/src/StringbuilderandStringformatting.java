public class StringbuilderandStringformatting {
    public static void main(String[] args) {

        //Inefficient
        String info = "";

        info += "Hello I am Mikey.";
        info += " ";
        info += "I am 15 years old.";

        System.out.println(info);

        //More efficient.
        StringBuilder texts = new StringBuilder();
        texts.append("Hello I am Emma.");
        texts.append(" ");
        texts.append("I am her sister.");

        System.out.println(texts);

        StringBuilder text = new StringBuilder();
        text.append("Hello I am Chifuyu.")
        .append(" ")
        .append("I am first vice capitan.");
        System.out.println(text);

        ///////////Formatting///////////////

        System.out.print("Here is some text.\tThat was a tap.\nThat was a new line.");
        System.out.println(" More text.");

        // Formatting integer
        System.out.printf("The cost is %-10d;\nThe quality is %10d;",5, 12);

        for(int i = 0;i<20;i++){
            System.out.printf("%-2d: Here is some text\n",i);
//            System.out.printf("%-2d: %s\n", i, "Here is some text");
        }

        // Formatting floating point value
        System.out.printf("Total value: %.2f\n",87.788);
        System.out.printf("Total value: %6.1f\n",87.788);

    }
}
