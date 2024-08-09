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
    public TestMatch (){
        super("Test Match");
    }

    @Override
    public String rule(){
        return "Played 5 days.No fixed overs for a team";
    }
}




class OneDay extends Cricket{
    public OneDay (){
        super("ODI");
    }

//    public String rule(){
//        return "Played 1 day. 50 overs per team";
//    }
    @Override
    public String rule(){
        return "Played 1 day. 50 overs per team";
    }
}




class T20 extends Cricket{
    public T20() {
        super("T20");
    }

    @Override
    public String rule(){
        return "Played one day. 20 overs per team";
    }
}



class Ipl extends Cricket{
    public Ipl(){
        super("IPL");
    }


    public String rule(){
        return "Played one day. 20 overs per team but not international";
    }
}



class Gully extends Cricket{
    public Gully(){
        super("Gully");
    }
}



public class PolymorMain {
    public static void main(String[] args) {
        for(int i =1;i < 11;i++){
            Cricket cricket = randomMatch();
            System.out.println("Format type"+i+" is "+cricket.formatName+". The rule is : " + cricket.rule());
        }
    }


    public static Cricket randomMatch(){
        int randomNumber = (int)(Math.random() * 5) + 1;
        System.out.println("The random number is :" +randomNumber);

        switch (randomNumber){

            case 1:
                return new TestMatch();
            case 2:
                return new OneDay();
            case 3:
                return new T20();
            case 4:
                return new Ipl();
            case 5:
                return new Gully();
            default:
                return null;
        }
    }
}
