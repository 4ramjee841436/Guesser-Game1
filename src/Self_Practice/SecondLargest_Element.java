package Self_Practice;

public class SecondLargest_Element {
    public static void main(String[] args) {
        int [] arr={34,55,46,88,99,110,234,33,99};
        int firstmx= Integer.MIN_VALUE;
        int secondmx= Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>firstmx)
            {
                secondmx= firstmx;
                firstmx= arr[i];
            }
            else if(arr[i]>secondmx && arr[i]!= firstmx)
            {
                secondmx= arr[i];
            }
        }
        if(secondmx!= Integer.MIN_VALUE)
        {
            System.out.println("Second largest elemnt is : "+secondmx);
        }
        else
            System.out.println("No Second largest element is found ");
    }
}
