package Hashmap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Iterator_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs= new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(10); // Duplicates are not allowed
        Iterator<Integer> it= hs.iterator();
//        for(int ele:hs)
//        {
//            System.out.println(it);// @15aeb7ab , @15aeb7ab -->> [Address print krega]
//        }
        System.out.println("iterartive elenment is : ");
        while (it.hasNext()) {

            // Print HashSet values
            System.out.print(it.next() + " ");
        }
        System.out.println();
                Object[] array = hs.toArray();
        System.out.println("Array of HashSet elements: " + Arrays.toString(array));
    }
}
