package ru.shashy.springlearn.AbstractsUsingWithContext.TestByClean;

import java.util.TreeMap;
import java.util.*;

public class SortByValue implements Sorter{

    @Override
    public void sortDetails() {
        DataLayer dataLayer = new DataLayer();
        Map<String, String> sorted = sortValues(dataLayer.getDestinations());

        for (Map.Entry<String, String> entry : sorted.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public <K, V extends Comparable<V>> Map<K, V> sortValues(final Map<K, V> m)
   {
       Comparator<K> com = new Comparator<K>(){
           public int compare(K k1, K k2){
             int compare = m.get(k1).compareTo(m.get(k2));
             if(compare == 0)
             {
                 return 1;
             }
            else
            {
                return compare;
            }
         }
          };
       Map<K, V> sortedByValues = new TreeMap<>(com);
       sortedByValues.putAll(m);
       return sortedByValues;
   }
}