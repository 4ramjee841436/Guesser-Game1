package TNP_Techmical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeFormat_conversion {
    public static void main(String[] args)throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(":");
        int hr = Integer.parseInt(str[0]);
        char tp = str[2].charAt(2);
        String min = str[1];
        String sec = str[2].substring(0 ,2);

        int nhr = 0;

        if (tp=='P'){
            nhr = hr +12;
        }
        else{
            nhr = hr;
        }
        if(hr==12 && tp =='A'){
            nhr = 0;
        }
        System.out.printf("%2d:%2s:%2s",nhr,min,sec);
    }
}
