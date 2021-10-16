public class Polymorphism_30 {
    public static void main(String[] args) {
        Plant_30 plant1 = new Plant_30();
        Tree_30 tree1 = new Tree_30();

        Plant_30 plant2 = tree1;

        plant2.grow();

        tree1.shedLeaves();

        doGrow(tree1);
    }
    public static void doGrow(Plant_30 plant){
        plant.grow();
    }

}
