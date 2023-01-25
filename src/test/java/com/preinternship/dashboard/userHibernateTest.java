package com.preinternship.dashboard;

import com.preinternship.dashboard.entities.User;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.List;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;

/**
 * https://www.youtube.com/watch?v=xHminZ9Dxm4
 */
public class userHibernateTest {

    private EntityManagerFactory emf;

    @BeforeEach
    protected void setUp() throws Exception{
        // A SessionFactory is set up once for an application
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure() // configures settings form hibernate.cfg.xml
                .build();
        try{
            emf = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        }
        catch (Exception e){
            // the registry would be destroyed by the SessionFactory
            StandardServiceRegistryBuilder.destroy( registry );
        }
    }

    @AfterEach
    protected void tearDown() throws Exception{
        if (emf != null){
            emf.close();
        }
    }

    @Test
    void saveUserToDb(){
        User user = new User("John","one@one.com", "passcode");

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(user);
        em.getTransaction().commit();
    }

    @Test
    void fetchUsers(){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        List<User> users = em.createQuery("select u from User u", User.class)
                .getResultList();
        users.forEach(System.out::println);

        em.getTransaction().commit();
    }

    @Test
    @Disabled
    public void userHibernateTest() {
        User user = null;
//        assertThat(user.getUserName()).isEqualTo("John");
    }

}
