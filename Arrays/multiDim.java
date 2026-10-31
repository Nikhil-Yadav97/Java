public class multiDim {
    public static void main(String[] args) {
        int[][] multi = new int[2][4];
        // OR can give diff size to each row
        // row is mandatory and col size is optional
        int[][] multi2 = new int[3][];
        multi2[0] = new int[] { 1, 2, 4 };
        // cant do this because mulit2[0] should store ref varible value 
        // multi2[0] = { 1, 2, 4 }; used at time of declaration + definiton 
        multi2[1] = new int[2];
        multi2[2] = new int[1];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < multi2[i].length; j++) {
                System.out.print(multi2[i][j]);
            }
            System.out.println();
        }

        int[] num = { 1, 2, 3 };
        for (int i = 0; i < 3; i++) {
            System.out.println(num[i]);
        }

    }
}
