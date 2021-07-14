
package ar.org.centro8.curso.java.aplicaciones.test;

import ar.org.centro8.curso.java.aplicaciones.entities.Cliente;
import java.time.LocalTime;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestJpaClientes {
    public static void main(String[] args) {
        EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAPU");
        EntityManager em = emf.createEntityManager();
         Query query;
         Cliente cliente;
      
        System.out.println(LocalTime.now());
        
        System.out.println("****************** ALL ******************** ");
        em.createNamedQuery("Cliente.findAll").getResultList().forEach(System.out::println);
        System.out.println("****************** SAVE ******************** ");
      
        cliente = new Cliente("Juana","Savora","DNI","34567188");
        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
        System.out.println(cliente);

        
        System.out.println("****************** POR APELLIDO Gomez ******************** ");
              query = em.createNamedQuery("Cliente.findByApellido");
              query.setParameter("apellido", "Gomez");  //keysense
              query.getResultList().forEach(System.out::println);

        System.out.println("****************** REMOVE id = 5 ******************** ");      
        
        query = em.createNamedQuery("Cliente.findById");
        query.setParameter("id", 3);
        cliente = (Cliente)query.getSingleResult();
        if(cliente!=null){
            em.getTransaction().begin();
            em.remove(cliente);
            em.getTransaction().commit();
        }
        System.out.println(cliente);
       
        
        System.out.println("****************** UPDATE id = 8 ******************** ");      
        
        query = em.createNamedQuery("Cliente.findById");
        query.setParameter("id", 1);
        cliente = (Cliente)query.getSingleResult();
        if(cliente!=null){
            cliente.setEdad(22);
            cliente.setNombre("Maria");
            cliente.setEmail("santini@mail");
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
        }
         System.out.println(cliente);
        System.out.println("****************** ALL ******************** ");
        em.createNamedQuery("Cliente.findAll").getResultList().forEach(System.out::println);
        
        em.close();
        emf.close();
    }
}
