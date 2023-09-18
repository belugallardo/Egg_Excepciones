/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones03;

import java.util.InputMismatchException;
import java.util.Scanner;

/*Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.*/
/**
 *
 * @author belugallardo
 */
public class Excepciones03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

       try {
            System.out.print("Ingrese el primer número: ");
            String numero1Str = leer.nextLine();

            System.out.print("Ingrese el segundo número: ");
            String numero2Str = leer.nextLine();

            int numero1 = Integer.parseInt(numero1Str);
            int numero2 = Integer.parseInt(numero2Str);

            if (numero2 != 0) {
                int resultado = numero1 / numero2;
                System.out.println("Resultado de la división: " + resultado);
            } else {
                System.out.println("No se puede dividir por cero.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese números válidos.");
        } catch (NumberFormatException e) {
            System.out.println("Error: No se pudo convertir la cadena a entero.");
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        } finally {
            leer.close();
        }

    }
}
