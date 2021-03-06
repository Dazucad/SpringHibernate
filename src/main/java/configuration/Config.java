package configuration;

import daoClass.DaoClass;
import entities.Laptop;
import entities.PC;
import entities.Printer;
import entities.Product;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public SessionFactory sessionFactory(){
        org.hibernate.cfg.Configuration configuration = new org.hibernate.cfg.Configuration();
        configuration.setProperty("hibernate.dialect","org.hibernate.dialect.H2Dialect")
                .setProperty("hibernate.show_sql", "true")
                .setProperty("hibernate.connection.url","jdbc:h2:~/test")
                .setProperty("hibernate.connection.driver_class","org.h2.Driver")
                .setProperty("hibernate.connection.username","sa")
                .setProperty("hibernate.connection.password","");
        configuration.addAnnotatedClass(Laptop.class);
        configuration.addAnnotatedClass(PC.class);
        configuration.addAnnotatedClass(Printer.class);
        configuration.addAnnotatedClass(Product.class);
        return configuration.buildSessionFactory();
    }

    @Bean
    public DaoClass daoClass(SessionFactory sessionFactory){
        return new DaoClass(sessionFactory);
    }
}
