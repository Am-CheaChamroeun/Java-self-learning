//Machine1,Person,Info,IStartable
public class Interface {
    public static void main(String[] args) {

        Machine1 machine1 = new Machine1();
        machine1.start();

        Person person1 = new Person("Mikey");
        person1.greet();

        Info info1 = new Machine1();
        info1.showInfo();

        Info info2 = person1;
        info2.showInfo();

        System.out.println();

        outPutInfo(machine1);
        outPutInfo(person1);
    }

    private static void outPutInfo(Info info){
        info.showInfo();
    }

}
