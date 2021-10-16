class plant{
    public static final int ID = 7;
    private String name;

    public String getData(){
        String data = "some stuff" + calculateGrowthForecast();

        return data;
    }
    private int calculateGrowthForecast(){
        return 9;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }


}

public class EncapsulationandtheAPIDocs_31 {
    public static void main(String[] args) {

    }
}
