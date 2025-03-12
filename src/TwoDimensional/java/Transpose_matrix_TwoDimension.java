package TwoDimensional.java;

public class Transpose_matrix_TwoDimension {
    public static void main(String[] args) {
        int[][] arr={{10,20},{12,23},{12,34}};
        int n= arr.length;
        int m= arr[0].length;

        for (int i = 0; i <n; i++) {
            for (int j= 0; j<m ; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("After Transpose the new matrix is : ");

        for (int j = 0; j<m; j++) {
            for (int i= 0; i<n; i++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
