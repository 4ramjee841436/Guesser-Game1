package PW_COURSE.java;

public class Annonomous_class {
    public static void main(String[] args) {
        System.out.println("The sum is:: "+sum(new int[]{10,20,30,40,50}));

    }
    static  int sum(int[] arr)
    {
        int total=0;
        for(int data: arr)
        {
            total+=data;

        }
        return  total;
    }
}
