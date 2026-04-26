/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;



/**
 *
 * @author PC
 */
 
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import logica.Usuario;

public class UsuarioJpaController implements Serializable {

    private EntityManagerFactory emf = null;

    public UsuarioJpaController() {
        emf = Persistence.createEntityManagerFactory("Usuario_UP"); // ⚠️ mismo nombre que en persistence.xml
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    // CREATE
    public void create(Usuario usuario) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(usuario);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    // UPDATE
    public void edit(Usuario usuario) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(usuario);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    // DELETE
    public void destroy(int id) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            Usuario usuario = em.find(Usuario.class, id);
            if (usuario != null) {
                em.remove(usuario);
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    // FIND ONE
    public Usuario findUsuario(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Usuario.class, id);
        } finally {
            em.close();
        }
    }

    // FIND ALL
    public List<Usuario> findUsuarioEntities() {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createQuery("SELECT u FROM Usuario u");
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    // COUNT
    public int getUsuarioCount() {
        EntityManager em = getEntityManager();
        try {
            Query query = em.createQuery("SELECT COUNT(u) FROM Usuario u");
            return ((Long) query.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
}
