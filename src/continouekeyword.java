//print all the value between 1 to 5 except the multiples of 3
public class continouekeyword {
    public static void main(String[] args) {
      // for(int num=1;num<=50;num++){
        //   if(num%3==0){
          //     continue;
           //}
           //System.out.println(num);
       //}
        int num=1;
        while(num<=50)
        {
            if(num%3==0){
              num++;
              continue;
            }
            System.out.println(num);
            num++;
        }
    }
}
