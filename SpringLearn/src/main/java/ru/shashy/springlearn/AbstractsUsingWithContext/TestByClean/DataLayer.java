package ru.shashy.springlearn.AbstractsUsingWithContext.TestByClean;

import java.util.HashMap;
import java.util.Map;

public class DataLayer {

    private Map<String, String> destinations = new HashMap<>();

    public DataLayer(){
        destinations.put("Kate", "New York");
        destinations.put("Jack", "Boston");
        destinations.put("Kitty", "inDaParis");
    }
    public Map<String, String> getDestinations() {
        return destinations;
    }
}