package Java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class iterateHashMaps {
    public static void main(String[] args) {
        iterateMap();
    }

    public static void iterateMap() {
        HashMap<String, String> CarEngines = new HashMap<String, String>();
        CarEngines.put("Hyundai", "Standard");
        CarEngines.put("Subaru", "Sports");
        CarEngines.put("McLaren", "Super");
        CarEngines.put("Hyundai", "Standard");

        Iterator iterate = CarEngines.entrySet().iterator();

        while (iterate.hasNext()) { 
        /*Returns true if the iteration has more elements. 
        (In other words, returns true if next would return an element rather than throwing an exception.)*/
            Map.Entry carengines = (Map.Entry) iterate.next();
            System.out.println(carengines.getKey() + " has a engine type of " + carengines.getValue());
        }

        System.out.println("-----------------------------");

        for (Map.Entry carengines: CarEngines.entrySet()) {
            System.out.println(carengines.getKey() + " has a engine type of " + carengines.getValue());
        }
    }
}