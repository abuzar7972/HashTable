package com.bl.programs;

import java.util.*;
public class UC1<C, I extends Number> {
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

        for(Map.Entry<String,Integer> entry:
                mp.entrySet())
        {
            System.out.println(entry.getKey()+
                    " - "+entry.getValue());
        }
    }

    public static void main(String[] args) {
        String str = "To be or not to be";
        count_freq(str);
    }
}

