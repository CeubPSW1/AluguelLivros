/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import configuracao.HibernateUtil;
import model.Editora;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Alexandre.Torres
 */
public class EditoraService {
    
    public static void grava(Editora editora){
        SessionFactory sf = null;
        Session session = null;
        
        try{
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            
            session.beginTransaction();
            session.save(editora);
            session.getTransaction().commit();                    
            
        }catch (Exception e){
            e.printStackTrace();
            if ( session != null)
               session.getTransaction().rollback();
            
        } finally {
            if (session != null)
                session.close();
        }
    }

    public static Editora getEditora(long id) {
        SessionFactory sf = null;
        Session session = null;
        Editora editora = null;
        try{
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            
            session.beginTransaction();
            editora = (Editora)session.get( Editora.class, id );
            session.getTransaction().commit();                    
            
        }catch (Exception e){
            e.printStackTrace();
            if ( session != null)
               session.getTransaction().rollback();
            
        } finally {
            if (session != null)
                session.close();
        }    
    
        return editora;
    }
    
}
