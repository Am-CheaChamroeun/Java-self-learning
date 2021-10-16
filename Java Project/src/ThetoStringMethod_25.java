class pig{
     private final int id;
     private final String name;

    public pig(int newId, String newName) {
        this.id = newId;
        this.name = newName;
    }
    public String toString(){
//        return id + ": "+ name;

//        StringBuilder text = new StringBuilder();
//        text.append(id).append(": ").append(name);
//        return text.toString();
//
        return String.format("%-4d: %s",id,name);
    }
}

public class ThetoStringMethod_25 {
    public static void main(String[] args) {
        pig pig1 = new pig(7,"Emma");
        pig pig2 = new pig(8,"Draken");
        System.out.println(pig1);
        System.out.println(pig2);
    }
}
