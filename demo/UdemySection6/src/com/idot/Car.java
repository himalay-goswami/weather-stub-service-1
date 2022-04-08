package com.idot;

public class Car {

    private int wheels;
    private String model;

    public Car(int wheels, String model){
        this.wheels=wheels;
        this.model=model;
    }


    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("porsche")||validModel.equals("holden")){
            this.model = model;
        }else{
            this.model="unknown";
        }
    }
}
