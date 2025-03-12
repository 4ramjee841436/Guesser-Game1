package Reursion;

public class Permutation {
    public static  void printPermutation(String result,String s)
    {
        if(s.length()==0)
        {
            System.out.println(result);
            return;

        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            String right=s.substring(i+1);
            String left= s.substring(0,i);
            printPermutation(result+ch,right+left);
        }
    }
    public static void main(String[] args) {
        String s="abc";
        printPermutation("",s);
        System.out.println("No-of permutations is: "+s.length());
    }
}
