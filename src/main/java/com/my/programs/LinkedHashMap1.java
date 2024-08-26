package com.my.programs;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMap1 {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> value = new LinkedHashMap<>();

        value.put(1,"a");
        value.put(2,"b");
        value.put(3,"c");
        value.put(4,"d");
        value.put(5,"e");

        Set set = value.entrySet();

        Iterator it = set.iterator();
        while (it.hasNext()){
            Map.Entry me = (Map.Entry)it.next();

            System.out.println("key is "+me.getKey()+" and the value is "+me.getValue());
        }

    }
}
