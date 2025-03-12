package TNP_Techmical;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mrketing_Org {
    public static void main(String[] args)throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String parent= br.readLine();
        String Yes_No= br.readLine();
        if(Yes_No.equals("N"))
        {
            int Total_members=1;
            System.out.println("Total Members is : "+Total_members);
            System.out.println("Commision Details \n\t"+parent+"250 RS");

        }
        else if(Yes_No.equals("Y"))
        {
            String Children= br.readLine();
            String child[]= Children.split(" ,");
            int Total_members= child.length+1;
            int parent_commision=500*child.length;
            System.out.println("Total Members is : "+Total_members);
            System.out.println("Commision Details :\n\t"+parent+": "+parent_commision);
        }
    }
}
