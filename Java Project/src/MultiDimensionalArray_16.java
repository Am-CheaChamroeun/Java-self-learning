public class MultiDimensionalArray_16 {
    public static void main(String[] args) {
        int[] values = {10,20,30};
        System.out.println(values[2]);

        int[][] grid = {
                {40,50,60},
                {70,80,90},
                {100,110,120}
        };
        System.out.println(grid[0][1]);
        System.out.println(grid[1][1]);

        String[][] texts = new String[2][3];
        texts[0][0] = "Hello world";
        texts[1][0] = "I fall in love with you";

        System.out.println(texts[0][0]);
        System.out.println(texts[1][0]);

        for (int row=0;row<grid.length;row++){
            for (int col=0;col<grid[row].length;col++){
                System.out.println(grid[row][col] + "\t");
            }
            System.out.println();
        }


    }

}
