package practice_program.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Disarium {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int sum=0;
        int count=0;
        int temp=n;
        while(temp!=0)
        {
            temp/=10;
            count++;
        }
        temp=n;
        while(n!=0)
        {
            int L_d= n%10;
            sum+=(int)Math.pow(L_d,count);
            n/=10;
            count--;
        }
        if(sum== temp)
            System.out.println(temp+ " is the Disarium Number");
        else
            System.out.println(temp+ " is Not a Disarium Number");

    }
}
