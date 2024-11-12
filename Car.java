package Srscarcompany;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class Car {

    protected String modelName ;
    protected int horsepower;
    protected double price;
    protected int modelYear;
    protected  String serialNumber;

    public Car(String modelName, int horsepower, double price, int modelYear, String serialNumber){
        this.modelName = modelName;
        this.horsepower = horsepower;
        this.price      = price;
        this.modelYear = modelYear;
        this.serialNumber = serialNumber;

    }


    public String displayInfo(){
        return "Model: " + modelName + ", Horsepower: " + horsepower +
                ", Price: $" + price + ", Year: " + modelYear +
                ", Serial Number: " + serialNumber  ;
    }



}
