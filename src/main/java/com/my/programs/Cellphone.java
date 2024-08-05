package com.my.programs;

public class Cellphone {
    private int ram;
    private int noOfCameras;
    private String model;
    private String colour;
    private String processor;


    public void setModel(String model1){
        String validModel = model1.toLowerCase();
        if (validModel.equals("nord") || validModel == "7pro"){
            this.model = model1;
        } else{
            this.model = "Unknown";
        }

    }

    public String getModel(){
        return this.model;
    }
}