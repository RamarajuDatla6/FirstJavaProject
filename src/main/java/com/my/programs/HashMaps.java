package com.my.programs;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        Map<String,String> company = new HashMap<>();

        company.put("Raghav","CEO");
        company.put("Raju","Founder");
        company.put("ajay","CMO");
        company.put("bhavani","Cofounder");

//        for (String key: company.keySet()){
//            System.out.println(key+" - "+company.get(key));
//        }


       // System.out.println(company.remove("Raju"));

//        if(company.remove("Raju","Founder")){
//            System.out.println("Raju is removed");
//        }else
//            System.out.println("Raju - XX is not present");

//
//        for (String key: company.keySet()){
//            System.out.println(key+" - "+company.get(key));
//        }

        System.out.println(company.replace("ajay","Manager"));
        for (String key: company.keySet()){
            System.out.println(key+" - "+company.get(key));
        }
    }
}
