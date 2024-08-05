package com.my.programs;

public class TimeConverter{
    public static String getDurationString(long minutes,long seconds){
        if ((minutes < 0 ) || (seconds < 0 ) || (seconds >59)){
            return "invalid";
        }

        long hours = minutes/60;
        long remaining_minutes = minutes%60;

        return hours + "h "+remaining_minutes+"m "+seconds+"s";
    }

    public static String getDurationString(long seconds){
        if (seconds < 0){
            return "invalid";
        }

        long minutes = seconds/60;
        long remaining_seconds = seconds%60;

        return getDurationString(minutes,remaining_seconds);
    }

    public static void main (String[]args){
        System.out.println(getDurationString(65L,45L));
        System.out.println(getDurationString(3945));
    }
}