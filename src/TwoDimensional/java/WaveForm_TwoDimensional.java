package TwoDimensional.java;

public class WaveForm_TwoDimensional {
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
        System.out.println("Wave Form is :  ");

//        System.out.println("The Wave form is : ");

        for (int i = 0; i < m; i++) {
            if(i%2 == 0)
            {
                for (int j = 0; j <m ; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            else {
                for (int j = n-1; j >=0 ; j--) {
                    System.out.print(arr[i][j] + " ");

                }
                System.out.println();
            }
        }
    }
}
