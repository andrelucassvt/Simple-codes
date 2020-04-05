/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.meubanco.teste;

import br.com.meubanco.Categoria;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.event.spi.PersistEvent;

/**
 *
 * @author andre
 */
public class CategoriaTeste {
    
    
    
    public static void main(String[] args) {
     
        Categoria c = new Categoria();
        c.setDescricao("Bebida");
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("seuPU");
        EntityManager em = emf.createEntityManager();
        
        
        em.getTransaction().begin();
        em.persist(c);
        em.getTransaction().commit();
        
        em.close();
        emf.close();
        
    }
}
