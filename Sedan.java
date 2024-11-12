package Srscarcompany;

import java.util.HashMap;
import java.util.Map;

class Sedan extends Car {

     private Sedan(String modelName, int horsepower, double price, int modelYear, String serialNumber){
         super(modelName,horsepower,price,modelYear,serialNumber);
     }

     private static final Map<String,Sedan> models = new HashMap<>();

     static{
         models.put("I1",new Sedan("I1",150,25000,2023,"SED-I1-001"));
         models.put("I2", new Sedan("I2", 160, 26000, 2024, "SED-I2-002"));
         models.put("I3", new Sedan("I3", 170, 27000, 2025, "SED-I3-003"));
         models.put("I4", new Sedan("I4", 180, 28000, 2023, "SED-I4-004"));
         models.put("I5", new Sedan("I5", 190, 29000, 2024, "SED-I5-005"));
     }


     public static Sedan getmodel(String model){

         return  models.get(model);
     }


}
