import java.util.Scanner;
  // To input an array with 10 values and check how many positive and negative number present in array
public class Array_sign_check {
      public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          int a[]=new int[10];
                  int i;
          int pos=0;
          int neg=0;
          int zero=0;
          System.out.println("Enter the Elements in array");

          for(i=0;i<10;i++)
               a[i]=sc.nextInt();
              for(i=0;i<10;i++)
              {
                  if(a[i]>0){
                  pos++;
                  }
                  else if(a[i]<0){
                  neg++;
                  }
                  else
                  {
                      zero++;
                  }
              }
          System.out.println("positive number is:"+pos);
          System.out.println("negative number is:"+neg);
          System.out.println("zero number is:"+zero);

      }
}
