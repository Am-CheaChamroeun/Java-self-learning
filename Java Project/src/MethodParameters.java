class Robot{
    public void speak(String texts){
        System.out.println(texts);
    }
    public void jumping(int height){
        System.out.println("Jumping: "+height);
    }
    public void move(String direction, double distance){
        System.out.println("Moving "+direction +" meters in direction "+distance);
    }

}
public class MethodParameters {
    public static void main(String[] args) {
        Robot robot1 = new Robot();
        robot1.speak("Hello I am Mikey");
        robot1.jumping(7);
        robot1.move("West", 7.2);

        String gretting = "Hello there!";
        robot1.speak(gretting);

        int value = 14;
        robot1.jumping(value);

    }
}