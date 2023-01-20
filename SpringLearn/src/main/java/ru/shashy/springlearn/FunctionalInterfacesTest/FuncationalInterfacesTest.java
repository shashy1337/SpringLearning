package ru.shashy.springlearn.FunctionalInterfacesTest;

import java.util.function.Supplier;

public class FuncationalInterfacesTest {
    public static void main(String[] args){
        Supplier<String> str = () -> String.format("aasd%o", 1);
        System.out.println(str);
    }
}