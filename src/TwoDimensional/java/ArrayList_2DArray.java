package TwoDimensional.java;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_2DArray {
    public static void main(String[] args) {
        List<Integer> a= new ArrayList<>();
        a.add(10); a.add(20); a.add(30); a.add(40);
        List<Integer> b= new ArrayList<>();
        b.add(50); b.add(60); b.add(70);
        List<Integer> c= new ArrayList<>();
        c.add(80); c.add(90);
        List<Integer> d= new ArrayList<>();// empty list
        List<List<Integer>> li= new ArrayList<>();// list of list <<>>
        li.add(a); li.add(b); li.add(c); li.add(d);
//        System.out.println(li.get(1).get(2)); // to print a particular index element
//  to print the array list in the form of array [10][20][30].......

//         for(int i=0;i< li.size();i++)
//         {
//             System.out.println(li.get(i));
//         }
        for (int i = 0; i < li.size(); i++) {
            List<Integer>x= li.get(i);  // List<Integer>x = li.get(i)
            for (int j = 0; j < x.size(); j++) {
                System.out.print(x.get(j)+" "); // print arraylist value 10 20 30 ....
            }
            System.out.println();

        }
    }
}
