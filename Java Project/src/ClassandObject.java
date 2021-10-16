class Person{
    // Instance variables (data or "state")
    String name;
    int age;

    // Class can contain

    //1. Data
    //2. Subroutines(methods)
}



public class ClassandObject {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Chamroeun";
        person1.age = 19;

        Person person2 = new Person();
        person2.name = "Mikey";
        person2.age = 15;

        System.out.println(person1.name);
        System.out.println(person2.name);
    }
}
