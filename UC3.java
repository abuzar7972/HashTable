package com.bl.programs;

import java.util.HashMap;

public class UC3 {
    public static void main(String[] args) {

        // Creating an empty HashMap
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        // Mapping string values to int keys
        hash_map.put(10, "Paranoids");
        hash_map.put(11, "are");
        hash_map.put(12, "not");
        hash_map.put(13, "because");
        hash_map.put(14, "keep");
        hash_map.put(15, "putting");
        hash_map.put(16, "themselves");
        hash_map.put(17, "deliberately");
        hash_map.put(18, "paranoid");
        hash_map.put(19, "avoidable");
        hash_map.put(20, "situations");


        System.out.println("Initial Mappings are: " + hash_map);

        String returned_value = (String)hash_map.remove(19);

        System.out.println("Returned value is: "+ returned_value);

        System.out.println("New map is: "+ hash_map);
    }
}
