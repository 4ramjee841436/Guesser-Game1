package PW_COURSE.java;

 class parent {
     parent() {
         System.out.println(this.hashCode());
     }
 }
    class child{
        child()
        {
            System.out.println(this.hashCode());
        }
    }
    public class Polymorphism_01
    {
        public static void main(String[] args) {
            child c= new child();
        }
    }

