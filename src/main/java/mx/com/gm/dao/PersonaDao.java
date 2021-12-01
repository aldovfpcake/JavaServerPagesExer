
package mx.com.gm.dao;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import mx.com.gm.domain.Persona;

public class PersonaDao {
     private  EntityManagerFactory Emf;
     private  EntityManager Em;
     
     public PersonaDao(){
         Emf = Persistence.createEntityManagerFactory("HibernatePU");
         Em  = Emf.createEntityManager();
     }
   
    public List<Persona> listar(){
        String Hql = "SELECT p FROM Persona p ";
        Query query = Em.createQuery(Hql);
        List<Persona> personas = query.getResultList();
        return personas;
    }
      public void insertar(Persona persona)
      {
            try{
                Em.getTransaction().begin();
                Em.persist(persona);
                Em.getTransaction().commit();
            }catch (Exception ex){
                    ex.printStackTrace(System.out);
                    Em.getTransaction().rollback();
                    } 
            finally{      
              /* if(Em != null){
                  Em.close();
            } */ 
             }
      }     
      public void modificar(Persona persona)
      {
          try{
                Em.getTransaction().begin();
                Em.merge(persona);
                Em.getTransaction().commit();
            }catch (Exception ex){
                    ex.printStackTrace(System.out);
                    Em.getTransaction().rollback();
                    } 
            finally{      
               /* if(Em != null){
                  Em.close();
            } */      
          
          
          
      }          
    
      }
      public Persona BuscarPersonaPorId(Persona p){
          return Em.find(Persona.class,p.getIdPersona());
          
      }
      
      public void EliminarPersona(Persona persona){
          
           try{
                Em.getTransaction().begin();
                Em.remove(Em.merge(persona));
                Em.getTransaction().commit();
            }catch (Exception ex){
                    ex.printStackTrace(System.out);
                    Em.getTransaction().rollback();
                    } 
            finally{      
                if(Em != null){
                  Em.close();
                      }    
                  }
        }
}