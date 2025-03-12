package practice_program.java;
import java.util.Scanner;
public class Charachter_occurances_frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an input:: ");
        String s = sc.next();
        int[] freq = new int[26];
//        // for indexing:: 0-a,1-b,2-c........25-z
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int indx = (int) ch - 97;
            freq[indx]++;
            // freq[indx(int)s.charAt(i)-97]++;
        }
        int maxfreq = -1;
        for (int i = 0; i < freq.length; i++) {
            maxfreq = Math.max(maxfreq, freq[i]);
        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]==maxfreq)
            {
                char ch=(char)(i+97);
                System.out.println(ch+" :: is occurances maximum time");
            }
        }
    }
}