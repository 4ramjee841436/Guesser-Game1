package TwoDimensional.java;

public class Transforming_to_Transpose {
    public static void print(int[][]arr) {
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");

            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int[][] arr={{12,23,34},{10,20,30},{40,50,60}};
        int m= arr.length;
        int n= arr[0].length;
        print(arr);
        System.out.println();
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <=i ; j++) {
                int temp= arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]= temp;


            }
            
        }
        print(arr);
    }
}
