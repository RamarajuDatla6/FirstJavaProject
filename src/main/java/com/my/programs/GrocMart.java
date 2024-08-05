package com.my.programs;

public class GrocMart {
    private String custName;
    private String custid;
    private String custphno;
    private double accbal;
    private String address;

    public GrocMart(){
        this("defcustname","defid","defphno",300,"India");
        System.out.println("default constructor was called 1 ");
    }


    GrocMart(String custname,String custid,String custphno,double accbal,String address){
        // setCustid(custid);     we can alsodo this.But if we miss any parameters it is difficult to identify them
        this.custName = custname;
        this.custid = custid;
        this.custphno = custphno;
        this.accbal = accbal;
        this.address = address;
        System.out.println(" Constructor called");
    }

    public GrocMart(String custname, String custid, String custphno) {
        this(custname,custid,custphno,200,"Sydeney");
    }

    //public GrocMart(String custname,String custid,String custphno,double accbal){
        //this.custname = custname;
        //this.custid = custid;
        //this.custphno = custphno;
       // this.accbal = accbal;
//        this.address = address;
       // System.out.println(" Constructor called2");
    //}

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public double getAccbal(){
        return accbal;
    }

    public void setAccbal(double accbal){
        this.accbal = accbal;
    }

    public String getCustphno(){
        return custphno;
    }

    public void setCustphno(String custphno){
        this.custphno = custphno;
    }

    public String getCustid(){
        return custid;
    }

    public void setCustid(String custid){
        this.custid = custid;
    }

    public String getCustname(){
        return custname;
    }

    public void setCustname(String custname){
        this.custname = custname;
    }


    public void shop(double amount){
        if (accbal >= amount){
            double rembalance = accbal - amount;
            System.out.println("Thanks for shopping.Your balance amount is : "+ rembalance);
            accbal = rembalance;
        }else{
            double lowAmount = amount - accbal;
            System.out.println("Insufficient money.Add more amount "+ lowAmount);
        }
    }

    public void rechargeAcc (double recharge){
        accbal = accbal + recharge;
        System.out.println("Thanks for recharging . Your new balace is :"+ accbal);
    }
}
