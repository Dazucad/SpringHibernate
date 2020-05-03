package Main;

import DaoClass.DaoClass;
import configuration.Config;
import entities.PC;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Iterator;
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
    }
}
