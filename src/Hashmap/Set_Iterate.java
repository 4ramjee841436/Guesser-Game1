package Hashmap;

import java.util.HashSet;

public class Set_Iterate {
    public static void main(String[] args) {
        HashSet<Integer>s= new HashSet<>();
        s.add(100);
        s.add(121);
        s.add(144);
        s.add(169);
        for(int ele: s)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
