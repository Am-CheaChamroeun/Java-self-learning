public class Oak extends Plant{
    public Oak(){

        //Won't work -- type is private
        //type = "tree";

        //This worls --- size is protected, Oak is a subclass of plant.
        this.size = "Large";

    }
}
