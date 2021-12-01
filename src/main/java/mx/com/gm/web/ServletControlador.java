/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.web;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
/*import javax.servlet.http.*;*/
import mx.com.gm.domain.Persona;
import mx.com.gm.servicios.ServiciosPersonas;

/**
 *
 * @author avlea
 */
/*@WebServlet("/ServletControlador"*/

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            /*{
        try {
            ServiciosPersonas serviciopersona = new ServiciosPersonas();
            List<Persona> personas = serviciopersona.ListarPersona();
            request.setAttribute("personas", personas);
            request.getRequestDispatcher("WEB/INF/listado.jsp").forward(request, response);
        } catch (IOException ex) {
           ex.printStackTrace(System.out);
        }
    
    }    */  
    {     
        ServiciosPersonas servicioPersonas = new ServiciosPersonas();
        
        List<Persona> personas = servicioPersonas.ListarPersona();
        
        request.setAttribute("personas", personas);
        
        try {
            request.getRequestDispatcher("listado.jsp").forward(request, response);
        } catch (ServletException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
} 
            
            
            
           
