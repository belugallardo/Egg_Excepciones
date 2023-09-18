/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author belugallardo
 */
public class ServicioPersona {
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        
        Persona p1 = new Persona();
        
        System.out.println("Ingrese su nombre");
        p1.setNombre(leer.nextLine());
        
        try{
        System.out.println("Ingrese su edad");
        p1.setEdad(leer.nextInt());
        leer.nextLine();
        } catch(Exception e){
            System.out.println("Dato incorrecto");
        }
        
        System.out.println("Ingrese su sexo:\n"
                + "H - hombre\n"
                + "M - mujer\n "
                + "O - otro");
        String sexo = leer.nextLine();
        if (sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("O")){
            char carac = sexo.charAt(0);
            p1.setSexo(carac);
        } else{
            System.out.println("La opcion no es valida, se le asignara OTRO");
            p1.setSexo('O');
        }
        
        System.out.println("Ingrese su peso");
        p1.setPeso(leer.nextInt());
        
        System.out.println("Ingrese su altura");
        p1.setAltura(leer.nextDouble());
        
       
        
        
        
        
        return p1;
        
    }
    
//    public int calcularIMC(Persona p1){
//       
//        int imc = (int) (p1.getPeso()/(p1.getAltura()*p1.getAltura()));
//        if (imc < 20){
//            return -1;
//        } else if(imc >= 20 || imc <= 25 ){
//            return 0;
//        } else {
//            return 1;
//        }
//    }
    
    public boolean esMayorDeEdad(Persona p1){
       
        
        return p1.getEdad()>= 18;
       
    }
}
