package Hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class ItrateMap {
    public static void main(String[] args) {
        HashMap<String,Integer>map= new HashMap<>();
        map.put("Ramjee",175);
        map.put("Suraj",21);
        map.put("Vinay",53);
        map.put("Sachin",234);
        // key se key + value dono print hoga
        for(String key: map.keySet())
        {
            int val= map.get (key);
            System.out.println(key+" "+ val);
        }
        System.out.println();
        // value print
        for(int val: map.values())
        {
            System.out.println(val);
        }
        System.out.println();
        // Dono pair ek sath print hoga =>> ( key= value )
        for(Object pair: map.entrySet())
        {
            System.out.println(pair);
        }

    }
}
