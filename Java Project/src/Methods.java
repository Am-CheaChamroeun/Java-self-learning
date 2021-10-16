class Persons{
    String name;
    int age;

    void speak() {
        for (int i = 0; i < 3; i += 1) {
            System.out.println("My name is " + name + " and I am " + age + " years old.");
        }
    }
    void speaks(){
        System.out.println("Hello there");
    }
}
public class Methods {
    public static void main(String[] args) {
        Persons person1 = new Persons();
        person1.name = "Chamroeun";
        person1.age = 19;
        person1.speak();
        person1.speaks();
        System.out.println(person1.name);

        System.out.println();

        Persons person2 = new Persons();
        person2.name = "Mikey";
        person2.age = 15;
        person2.speak();
        person2.speaks();
        System.out.println(person2.name);
    }
}
