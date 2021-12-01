package mx.com.gm.servicios;

import java.util.List;
import mx.com.gm.dao.PersonaDao;
import mx.com.gm.domain.Persona;

public class ServiciosPersonas {
    private PersonaDao personadao;
 
    public ServiciosPersonas(){
        this.personadao = new PersonaDao();
    }
    
    public List<Persona> ListarPersona(){
       return this.personadao.listar();
     
     }
    
  
    
}
