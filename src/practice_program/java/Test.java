package practice_program.java;

 class Test {
    public void m1(int i,float f)
    {
        System.out.println("int-float arg method");
    }
    public void m2(float f ,int i)
    {
        System.out.println("float-int arg method");
    }

     public static void main(String[] args) {
         Test t= new Test();
         t.m1(10,10.5f);
         t.m2(12.5f,20);
         t.m1(10,10);
     }
}
