package TwoDimensional.java;

public class MatrixMultiplication_2D {
    public static void main(String[] args) {
        int [][] a= {{12,23,34},{10,20,30},{40,50,60}};
        int[][] b= {{15,24},{20,40},{60,80}};
        if(a[0].length != b.length)
        {
            System.out.println("Multiplication is not possible please check it !! ");
        }
        else {
            int [][] c= new int[a.length][b[0].length];
            for(int i=0;i<c.length;i++)
            {
                for(int j=0;j<c[0].length;j++)
                {
                    // a[i][0]*b[0][j]+a[i][1]*b[1][j]+ a[i][2]*b[2]b[j]+.........
                    for(int k=0;k<b.length;k++)
                    {
                        c[i][j]+= a[i][k]*b[k][j];
                    }
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();

            }

        }


    }
}
