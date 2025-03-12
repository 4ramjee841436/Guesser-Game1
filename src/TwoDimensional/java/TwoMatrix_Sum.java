package TwoDimensional.java;

public class TwoMatrix_Sum {
    public static void main(String[] args) {
        int[][] arr={{10,20,30},{12,23,23}};
        int[][] brr={{12,23,15},{18,34,42}};
        int sum=0;
        int n= arr.length;
        int m= arr[0].length;
        int [][] crr= new int[n][m];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                crr[i][j]= arr[i][j] + brr[i][j];
                System.out.print(crr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
