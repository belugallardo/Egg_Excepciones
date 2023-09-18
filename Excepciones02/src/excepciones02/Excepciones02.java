/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones02;

/**
 *
 * @author belugallardo
 */
public class Excepciones02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).*/
      
        int[] numeros = { 1, 2, 3, 4, 5 };

        try {
            
            int valor = numeros[10]; 
        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Se ha producido una excepción: " + e.getMessage());
        }

  
        System.out.println("El programa ha terminado.");
    }
      
      
      
    }
    
