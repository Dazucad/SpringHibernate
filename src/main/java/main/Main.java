package main;

import daoClass.DaoClass;
import configuration.Config;
import entities.PC;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(Config.class);
        context.refresh();
        DaoClass daoClass=new DaoClass(context.getBean(SessionFactory.class));
        List<PC> list=daoClass.findAllPC();
        for (PC pc : list) {
            System.out.println(pc);
        }
        /*PC pc=new PC();
        pc.setCode(13);
        pc.setModel("1232");
        pc.setSpeed((short) 1000);
        pc.setRam((short) 256);
        pc.setHd(100f);
        pc.setCd("52x");
        pc.setPrice(new BigDecimal(1234));
        daoClass.insert(pc);*/

        System.out.println(daoClass.findPCbyId(1));

        System.out.println("выход из программы");
    }
}
