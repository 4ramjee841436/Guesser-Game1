package PW_COURSE.java;

public class No_Of_Object_Count1 {
    static int count;
    No_Of_Object_Count1()
    {
        count++;
    }
    No_Of_Object_Count1(int i)
    {
        count++;
    }
    No_Of_Object_Count1(int i,int j)
    {
        count++;
    }
    public void display() {
        System.out.println("No of object is: "+count);
    }


       public static void main(String[] args) {
           No_Of_Object_Count1 c = new No_Of_Object_Count1();
           No_Of_Object_Count1 c1 = new No_Of_Object_Count1(10);
           No_Of_Object_Count1 c2 = new No_Of_Object_Count1();
           No_Of_Object_Count1 c3= new  No_Of_Object_Count1(100);
           No_Of_Object_Count1 c4= new  No_Of_Object_Count1(100,200);
           No_Of_Object_Count1 c5= new  No_Of_Object_Count1(300,200);
           c5.display();
       }

}
