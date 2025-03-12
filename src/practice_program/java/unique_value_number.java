package practice_program.java;

public class unique_value_number {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 4; i++)
        for(int j=1;j<=4;j++)
            for(int k=1;k<=4;k++)
                if(i!=k && j!=k && i!=j)
                {
                    System.out.println(i+""+j+""+k);
                    count++;
                }
        System.out.println( "The count of unique number is:"+count);

    }
}
