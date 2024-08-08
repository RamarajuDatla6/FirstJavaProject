package com.my.programs;

class Cricket{
    public String formatName;

    public Cricket(String formatName){
        this.formatName = formatName;
    }
    public String rule(){
        return "Cricket is an outdoor game played between two teams of 11 members each";
    }
}




class TestMatch extends Cricket{
    public TestMatch (String formatName){
        super("Test Match");
    }

    public String rule(){
        return "Played 5 days.No fixed overs for a team";
    }
}




class OneDay extends Cricket{
    public OneDay (String formatName){
        super("ODI");
    }

    public String rule(){
        return "Played 1 day. %o overs per team";
    }
}




public class PolymorMain {
    public static void main(String[] args) {

    }
}
