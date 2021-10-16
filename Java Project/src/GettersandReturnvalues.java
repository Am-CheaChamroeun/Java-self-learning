class Personss{
    String name;
    int age;

    int calculateYearRetirement(){
        int yearleft = 65 - age;
        return yearleft;
    }
    int getAge(){
        return age;

    }
    String getName(){
        return name;
    }
}

public class GettersandReturnvalues {
    public static void main(String[] args) {
        Personss person1 = new Personss();
        person1.name = "Mikey";
        person1.age = 15;

        int year = person1.calculateYearRetirement();
        System.out.println("You are retirement at: "+year);

        int age = person1.getAge();

        String name = person1.getName();

        System.out.println("Hello I'm "+ name);
        System.out.println("Hello I'm "+ age + " year olds");


    }
}
