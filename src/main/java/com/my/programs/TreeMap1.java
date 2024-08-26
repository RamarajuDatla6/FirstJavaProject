package com.my.programs;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap1 {
    public static void main(String[] args) {

        TreeMap<Integer,String> value = new TreeMap<>();

        value.put(3,"a");
        value.put(7,"b");
        value.put(1,"d");
        value.put(6,"v");
        value.put(5,"r");

        Set set = value.entrySet();
        Iterator it = set.iterator();
        while (it.hasNext()){
            Map.Entry me = (Map.Entry)it.next();

            System.out.println(me.getKey()+" "+me.getValue());
        }
    }
}
