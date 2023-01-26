package ru.shashy.springlearn.AbstractsUsingWithContext.TestByClean;

public class AbstractsUsingWithClean {


    public static void main(String[] args){
        DataLayer dataLayer = new DataLayer();
        Sorter sorterByKey = new SortByKey(dataLayer);
        Sorter sorterByValue = new SortByValue();
        var delivaryDetailsPrinter = new DeliveryDetailsPrinter(sorterByKey);
        var delivaryDetailsPrinterVal = new DeliveryDetailsPrinter(sorterByValue);
        delivaryDetailsPrinter.printDetails();
        System.out.println("----------------------------------------------------------");
        delivaryDetailsPrinterVal.printDetails();
    }
}