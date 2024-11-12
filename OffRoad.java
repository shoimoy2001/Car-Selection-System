package Srscarcompany;
import java.util.Map;
import java.util.HashMap;

 class OffRoad extends Car {


     private static final Map<String, OffRoad> models = new HashMap<>();



     static {
         models.put("Z1", new OffRoad("Z1", 220, 35000, 2023, "OFF-Z1-001"));
         models.put("Z2", new OffRoad("Z2", 240, 36000, 2024, "OFF-Z2-002"));
         models.put("Z3", new OffRoad("Z3", 260, 37000, 2025, "OFF-Z3-003"));
         models.put("Z4", new OffRoad("Z4", 280, 38000, 2023, "OFF-Z4-004"));
         models.put("Z5", new OffRoad("Z5", 300, 39000, 2024, "OFF-Z5-005"));
     }

     private OffRoad (String modelName, int horsepower, double price, int modelYear, String serialNumber){
         super(modelName,horsepower,price,modelYear,serialNumber);
     }




     public static OffRoad getmodel(String model){
         return models.get(model);
     }






}
