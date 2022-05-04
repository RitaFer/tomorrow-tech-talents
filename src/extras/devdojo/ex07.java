package extras.devdojo;

/*
Praticando Arrays Multidimensionsinais
*/

public class ex07 {
    public static void main(String[] args) {
        int[][] array = new int[8][];
        int[][] arrayPlay = {{0}, {0, 0}, {0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0}};

        array[0] = new int[1];
        array[1] = new int[2];
        array[2] = new int[3];
        array[3] = new int[4];
        array[4] = new int[5];
        array[5] = new int[6];
        array[6] = new int[7];
        array[7] = new int[8];

        for(int[] baseArray : array){
            System.out.print("\n");
            for(int value : baseArray){
                System.out.print(value + " ");
            }
        }

        System.out.print("\n------------------------------------------");

        for(int[] baseArray : arrayPlay){
            System.out.print("\n");
            for(int value : baseArray){
                System.out.print(value + " ");
            }
        }
    }
}
