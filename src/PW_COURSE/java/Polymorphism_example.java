package PW_COURSE.java;

 class TextBook{
     private int pages;
     //    setter method
     public void setPages(int pages)
     {
         if(pages>0)
             this.pages=pages;
         else pages=0;
     }
     // getter method
     public int getPages()
     {
         return pages;
     }
}
class polymorphism_example
{
    public static void main(String[] args) {
        TextBook tb=new TextBook();
        tb.setPages(101);
        int page_Count=tb.getPages();
        System.out.println("Total page number is : "+page_Count);

    }
}