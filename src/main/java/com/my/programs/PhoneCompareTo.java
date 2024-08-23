package com.my.programs;

public class PhoneCompareTo implements Comparable<PhoneCompareTo>{
    private String ContactName;
    private String ContactNumber;

    public PhoneCompareTo(String contactName, String contactNumber) {
        ContactName = contactName;
        ContactNumber = contactNumber;
    }

    public String getContactName() {
        return ContactName;
    }

    public String getContactNumber() {
        return ContactNumber;
    }

    @Override
    public int compareTo(PhoneCompareTo o) {
        if (this.ContactNumber.compareTo(o.ContactNumber) == 0){
            return 0;
        } else if (this.ContactNumber.compareTo(o.ContactNumber) > 0) {
            return 1;
        }else
            return -1;
    }
}