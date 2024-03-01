/*
 * :   Elabore un algoritmo que lea un número y obtenga su cuadrado y su cubo
 */
package cuartoejercicio;

import java.util.Scanner;

public class CuartoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        double numeroUsuario, cuadradoNumero, cuboNumero;
        
        // Pedir al usuario que ingrese un número
        System.out.print("Ingresa un número: ");
        numeroUsuario = scanner.nextDouble();

        // formulas para calcular el cuadrado y el cubo
        cuadradoNumero = (numeroUsuario * numeroUsuario );
        cuboNumero = (numeroUsuario * numeroUsuario * numeroUsuario ); 


        // imprimiendo el resultado de las oporaciones
        System.out.println("El cuadrado de " + numeroUsuario + " es: " + cuadradoNumero);
        System.out.println("El cubo de " + numeroUsuario + " es: " + cuboNumero);
    }
    
}
