package daoClass;

import entities.PC;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.PersistenceException;
import java.util.List;

@Repository
public class DaoClass {
    private final SessionFactory sessionFactory;

    public DaoClass(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void insert(PC pc) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        try {
            session.save(pc);
            transaction.commit();
        } catch (PersistenceException e) {
            System.out.println("не удается вставить строку\n");
            e.printStackTrace();
            transaction.rollback();
        }
    }

    @Transactional
    public List<PC> findAllPC() {
        return sessionFactory.openSession().createQuery("from PC").list();
    }

    public PC findPCbyId(Integer id){
        Session session=sessionFactory.openSession();
        return session.byId(PC.class).load(id);
    }
}
