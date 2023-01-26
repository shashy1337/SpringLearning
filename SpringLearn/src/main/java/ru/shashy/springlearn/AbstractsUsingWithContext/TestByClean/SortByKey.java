package ru.shashy.springlearn.AbstractsUsingWithContext.TestByClean;

import java.util.TreeMap;
import java.util.Map;

public class SortByKey implements Sorter{

    private TreeMap<String, String> treeMap = new TreeMap<>();
    private final DataLayer dataLayer;

    public SortByKey(DataLayer dataLayer){
        this.dataLayer = dataLayer;
    }

    @Override
    public void sortDetails() {
        treeMap.putAll(dataLayer.getDestinations());
        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}