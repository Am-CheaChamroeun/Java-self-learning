class Machine{
    private String name;
    private int age;

    public Machine(){
//        this("Mikey",15);

        System.out.println("Constructor running");

    }
    public Machine(String name){
        this(name, 5);

        System.out.println(" Second constructor running");
        this.name = name;
    }
    public Machine(String name, int age){
        System.out.println("Third constructor running");
        this.name = name;
        this.age = age;
    }

}
public class Constructors {
    public static void main(String[] args) {
        Machine machine1 = new Machine();

        Machine machine2 = new Machine("Mikey")  ;

        Machine machine3 = new Machine("Mikey", 5);

    }
}
//Note to watch again
