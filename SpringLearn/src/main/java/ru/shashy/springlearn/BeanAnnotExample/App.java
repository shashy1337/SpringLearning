package ru.shashy.springlearn.BeanAnnotExample;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        String s = context.getBean(String.class);
        System.out.println(s);

        Parrot p1 = context.getBean("parrot1", Parrot.class);
        System.out.println(p1.getName());

        Parrot p2 = context.getBean("parrot2",Parrot.class);
        System.out.println(p2.getName());

        Parrot p3 = context.getBean("parrot3", Parrot.class);
        System.out.println(p3.getName());

        int i1 = context.getBean(Integer.class);
        System.out.println(i1);

        Parrot p4 = context.getBean(Parrot.class);
        System.out.println(p4.getName());
    }
}
