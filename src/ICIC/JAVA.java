package ICIC;
interface BANK
{
    void Rate_of_interest();

}
class SBI implements BANK
{
  public   void Rate_of_interest()

    {
        System.out.println("The interst of Sbi bank is: "+5.4);

    }

}
class Axis implements BANK
{
  public   void Rate_of_interest()
    {

        System.out.println("The interst of Axis bank is:"+4.9);

    }

}
class PUNJAB implements BANK {
  public   void Rate_of_interest()
    {
        System.out.println("The interest of Punjab bank is : "+5.7);
    }

}

class ICIC implements BANK {
  public   void Rate_of_interest()
    {
        System.out.println("The ineterest of icic bank is:"+6.3);
    }
    public static void main(String[] args) {
        BANK B;
        B= new SBI();
        B.Rate_of_interest();
        B= new PUNJAB();
        B.Rate_of_interest();
        B=new ICIC();
        B.Rate_of_interest();
    }

}



