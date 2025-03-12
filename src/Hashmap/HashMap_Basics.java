package Hashmap;

import java.util.HashMap;

public class HashMap_Basics {
    public static void main(String[] args) {
        HashMap<String,Integer>map= new HashMap<>();
        map.put("Ramjee",175);
        map.put("Parul",717);
        map.put("Raushan",365);
        map.put("Avi",423);
        System.out.println(map);
        System.out.println(map.get("Ramjee"));// gives the particular key value->> Result
        System.out.println(map.size());

    }
}
