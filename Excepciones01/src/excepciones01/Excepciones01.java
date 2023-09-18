/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones01;

import Entidad.Persona;
import Servicio.ServicioPersona;

/**
 *
 * @author belugallardo
 */
public class Excepciones01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioPersona  sp = new ServicioPersona();
        
        
       
        sp.crearPersona();
        
    }
    
}
