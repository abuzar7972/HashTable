package com.bl.programs;

import java.util.Map;
import java.util.TreeMap;

public class UC2 {
    static void count_freq(String str)
    {
        Map<String,Integer> mp=new TreeMap<>();
        String arr[]=str.split(" ");

        for(int i=0;i<arr.length;i++)
        {
            if(mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else
            {
                mp.put(arr[i],1);
            }
        }

        for(Map.Entry<String,Integer> entry: mp.entrySet())
        {
            System.out.println(entry.getKey()+
                    " :: "+entry.getValue());
        }
    }

    public static void main(String[] args) {
        String str = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        count_freq(str);
    }
}
