/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones05;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.*/
/**
 *
 * @author belugallardo
 */
public class Excepciones05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(500) + 1;
        int opcion = 0;
        int intentos = 1;
        
        do{
            System.out.println("Ingrese un numero");
            try {
                opcion = leer.nextInt();
                leer.nextLine();
                if(opcion == numeroAleatorio){
                    System.out.println("Adivinaste");
                    System.out.println("Te ha llevado " + intentos + " intentos");
                } else if (opcion < numeroAleatorio) {
                    System.out.println("El numero a adivinar es mayor");
                } else{
                    System.out.println("El numero a adivinar es menor");
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un número válido.");
                leer.nextLine(); // Limpia el búfer de entrada
            }
            intentos++;
        } while (opcion != numeroAleatorio);

    }

}
