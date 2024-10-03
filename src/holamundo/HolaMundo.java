/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in); 
        System.out.println("Hello, Umg!");
        System.out.println("----------------------------------------------");
        System.out.println("Datos Personales:");
        System.out.println("Nombre: Henry Angel Gabriel Teret Hernández");
        System.out.println("Carnet: 1990-23-15274");
        System.out.println("Edad: 20 años");
        System.out.println("Sección: A");
        System.out.println("Curso: Programación II");
        System.out.println("----------------------------------------------");
        
        int num1 = 0;
        int num2 = 0;
        
        int suma = 0, resta = 0, multiplicacion = 0, division = 0;
        
        System.out.println("Ingrese el número 1: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el número 2: ");
        num2 = sc.nextInt();
        
        
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        
        System.out.println("La suma de los números es: " + suma);
        System.out.println("La resta de los números es: " + resta);
        System.out.println("La multiplicación de los números es: " + multiplicacion);
        System.out.println("La división de los números es: " + division);
        
        
        
        
     
        
    }
    
}
