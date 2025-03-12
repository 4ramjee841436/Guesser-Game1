package Hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class Hashmap_basic {
    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        System.out.println(set+" ");
//         contains -->> it check the particular element present or not, return type boolean

        System.out.println(set.contains(40));
        set.remove(30);
        System.out.println(set);// remove 30 in the set
//           convert set to array -->> integer is a wrapper class object, Array ka datatype->> Object

         Object[] arr= set.toArray();
         for(int i=0;i<arr.length;i++)
         {
             System.out.print(arr[i]+" ");
         }
        System.out.println();
    }
}
