package Hashmap;

import java.util.HashSet;

public class AddSame_InSet {
    public static void main(String[] args) {
        HashSet<String>set= new HashSet<>();
        set.add("Ramjee");
        set.add("Rishu");
        set.add("Parul");
        set.add("Ramjee"); // it does't contains Duplicate value
        System.out.println(set.contains("Ramjee"));
        System.out.println(set.size());
    }
}
