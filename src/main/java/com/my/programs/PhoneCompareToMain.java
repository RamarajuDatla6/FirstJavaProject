package com.my.programs;

import java.util.ArrayList;
import java.util.Collections;

public class PhoneCompareToMain {
    public static void main(String[] args) {

        ArrayList<PhoneCompareTo> pd = new ArrayList<>();

        pd.add(new PhoneCompareTo("dog","1234"));
        pd.add(new PhoneCompareTo("elephant","5664"));
        pd.add(new PhoneCompareTo("zebra","345"));
        pd.add(new PhoneCompareTo("lion","675"));
        pd.add(new PhoneCompareTo("cheetah","0999"));
        pd.add(new PhoneCompareTo("hippo","8888"));
        pd.add(new PhoneCompareTo("rhino","86678"));

        Collections.sort(pd);

        for (PhoneCompareTo obj : pd){
            System.out.println(obj.getContactName()+" "+obj.getContactNumber());
        }
    }
}
