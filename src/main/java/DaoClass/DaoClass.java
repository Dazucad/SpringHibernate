package DaoClass;

import entities.PC;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository

public class DaoClass {
    private final SessionFactory sessionFactory;

    public DaoClass(SessionFactory sessionFactory){
        this.sessionFactory=sessionFactory;
    }

    @Transactional
    public List<PC> findAllPC(){
        return sessionFactory.openSession().createQuery("from PC").list();
    }
}
