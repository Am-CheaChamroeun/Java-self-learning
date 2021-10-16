import java.util.ArrayList;

class ship{
    public String toString(){
        return "I am a machine";
    }
    public void start(){
        System.out.println("Machine starting");
    }

}
class boat extends ship{
    public String toString(){
        return "I am a camera";
    }
    public void snap(){
        System.out.println("snap!");
    }

}

public class GenericandWildcards_35 {
    public static void main(String[] args) {

        ArrayList<ship> list1 = new ArrayList<ship>();

        list1.add(new ship());
        list1.add(new ship());

        ArrayList<boat> list2 = new ArrayList<boat>();

        list2.add(new boat());
        list2.add(new boat());

        showlist(list2);
        showlist2(list1);
        showlist3(list1);
    }
    public static void showlist(ArrayList<? extends ship> list){
        for(ship value: list){
            System.out.println(value);
            value.start();
        }
    }
    public static void showlist2(ArrayList<? super ship> list) {
        for (Object value : list) {
            System.out.println(value);
        }
    }
    public static void showlist3(ArrayList<?> list) {
        for (Object value : list) {
            System.out.println(value);
        }
    }
}

