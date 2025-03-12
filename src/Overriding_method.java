class bank{
    void getrateofinterest(float x){
        float i;
        i=x*5;
        System.out.println(i);
    }
}
class SBI extends bank{
    void getrateofinterest(float y){
        double i;
        i=y*4.9;
        System.out.println(i);
    }
}
class ICIC extends bank{
    void getrateofinterest(float z){
        double i;
        i=z*5.3;
        System.out.println(i);
    }
}
class AXIS extends bank {
    void getrateofinterest(float a) {
        double i;
        i = a * 5.5;
        System.out.println(i);
    }
}
    public record Overriding_method() {
        public static void main(String[] args) {
      SBI s=new SBI();
      s.getrateofinterest(1000);
      ICIC b= new ICIC();
      b.getrateofinterest(2000);
      AXIS a=new AXIS();
      a.getrateofinterest(4000);
    }
}