package Self_Practice;

public class MinimumElement_Index {
    public static void main(String[] args) {
        int []arr= {12, 14,-6,-12,6,8};
        int n= arr.length;
        int min= Integer.MAX_VALUE;
        int MinIndex=-1;
        for(int i=0;i<n;i++) {
            if (arr[i] < min) {
                min = arr[i];
                MinIndex = i;

            }
        }
            System.out.println("Minimum value is : " + min + " at Index : " + MinIndex);
        }
    }

