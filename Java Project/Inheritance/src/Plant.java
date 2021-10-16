public class Plant {

    //Bad practice
    public String name;

    //Acceptable practice --- it's final.
    public final static int ID=8;

    private String type;

    protected String size;

    public Plant(){
        this.name = "Mikey";
        this.type = "plant";
        this.size = "medium";
    }
}
