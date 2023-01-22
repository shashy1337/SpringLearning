package ru.shashy.springlearn.ProgrammingBeanAdd;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.function.Supplier;

public class ProgrammingBeanAdd {


    public static ArrayList<Parrot> initParrots(){
        ArrayList<Parrot> parrots = new ArrayList<>();
        for (int i = 0; i < 6; i++){
            if (i % 2 == 0){
                parrots.add(new Parrot(String.format("Parrot%d", i), "green"));
            } else {
                parrots.add(new Parrot(String.format("Parrot%d", i), "orange"));
            }
        }
        return parrots;
    }

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        ArrayList<Parrot> parrots = initParrots();
        for (Parrot p : parrots){
            if (p.isGreen()){
                System.out.println(p.getName() + " " + p.getColor());
                Supplier<Parrot> supplierParrot = () -> p;
                context.registerBean(String.format(p.getName()), Parrot.class, supplierParrot);
            }
        }
        Parrot parrot0 = context.getBean("Parrot0", Parrot.class);
        System.out.println(parrot0.getName());
        System.out.println(parrot0.getColor());
    }
}