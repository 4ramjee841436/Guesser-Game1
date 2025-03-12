package PW_COURSE.java;

 class Student
{
    String name;
    int age;
    float height;
    public void setData(String name,int age,float height)
    {
        this.name=name;
        this.age=age;
        this.height=height;
    }
    public void displayData()
    {
        System.out.println("Name is   = "+name);
        System.out.println("Age is    = "+age);
        System.out.println("Height is = "+height);
    }
    public class This_keyword
    {
        public static void main(String[] args) {
            Student s= new Student();

        }
    }
}
